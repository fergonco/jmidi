package org.fergonco.music.midi;

import java.util.ArrayList;

public class BeatIterator {

	private ArrayList<Note> notes;
	private int ticksPerQuarterNote;
	private int lastEventRemainingTicks = 0;
	private MidiEvents offMidiEvents = null;
	private int currentNote = 0;

	public BeatIterator(ArrayList<Note> notes, int ticksPerQuarterNote) {
		this.notes = notes;
		this.ticksPerQuarterNote = ticksPerQuarterNote;
	}

	public ArrayList<BeatRelativeMidiEvents> nextBeat() {
		ArrayList<BeatRelativeMidiEvents> ret = new ArrayList<>();
		int consumedTicks = 0;
		do {
			int beatRemainingTicks = ticksPerQuarterNote - consumedTicks;
			if (lastEventRemainingTicks < beatRemainingTicks) {
				consumedTicks += lastEventRemainingTicks;
				// Initiate an ON event if there is no pending OFF one
				if (offMidiEvents == null) {
					Note note = notes.get(currentNote++);
					MidiEvents onMidiEvents = note.getOnMidiEvents(ticksPerQuarterNote);
					ret.add(new BeatRelativeMidiEvents(consumedTicks, onMidiEvents));
					lastEventRemainingTicks = onMidiEvents.getLengthInTicks();

					// Queue OFF event
					offMidiEvents = note.getOffMidiEvents();
				} else {
					lastEventRemainingTicks = offMidiEvents.getLengthInTicks(); // 0

					// Close the OFF event
					ret.add(new BeatRelativeMidiEvents(consumedTicks, offMidiEvents));
					offMidiEvents = null;
				}
			} else {
				consumedTicks += beatRemainingTicks;
				lastEventRemainingTicks -= beatRemainingTicks;
			}
		} while (consumedTicks < ticksPerQuarterNote);

		return ret;
	}
}
