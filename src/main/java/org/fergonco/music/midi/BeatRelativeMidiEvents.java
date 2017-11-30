package org.fergonco.music.midi;

public class BeatRelativeMidiEvents {

	private int tickPositionInBeat;

	private MidiEvents midiEvents;

	public BeatRelativeMidiEvents(int tickPositionInBeat, MidiEvents midiEvents) {
		super();
		this.tickPositionInBeat = tickPositionInBeat;
		this.midiEvents = midiEvents;
	}

	public int getTickPositionInBeat() {
		return tickPositionInBeat;
	}

	public MidiEvents getMidiEvents() {
		return midiEvents;
	}

}
