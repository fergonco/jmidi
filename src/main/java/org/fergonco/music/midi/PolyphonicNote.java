package org.fergonco.music.midi;

import java.io.IOException;
import java.io.OutputStream;

public class PolyphonicNote extends AbstractNote implements Note {

	private int[] pitches;
	private int[] volumes;

	public PolyphonicNote(Duration duration, int[] volumes, int[] pitches) {
		super(duration);
		this.volumes = volumes;
		this.pitches = pitches;
	}

	public void setVolumes(int[] volumes) {
		this.volumes = volumes;
	}

	@Override
	public void write(int trackIndex, int ticksPerQuarterNote, OutputStream os) throws IOException {
		for (int i = 0; i < pitches.length; i++) {
			// timestamp
			write(os, 0);
			// event type
			os.write(NOTE_ON * 16 + trackIndex);
			// note
			os.write(pitches[i]);
			// volume
			os.write(volumes[i]);
		}
		int noteLength = duration.getTicks(ticksPerQuarterNote);
		for (int pitch : pitches) {
			// length
			write(os, noteLength);
			noteLength = 0;
			// note
			os.write(pitch);
			// volume
			os.write(0);
		}

	}

	@Override
	public void addDuration(Duration duration) {
		this.duration.add(duration);
	}

	@Override
	public MidiEvents getOnMidiEvents(int ticksPerQuarterNote) {
		return new MidiEvents(pitches, volumes, duration.getTicks(ticksPerQuarterNote));
	}

	@Override
	public MidiEvents getOffMidiEvents() {
		int[] mute = new int[volumes.length];
		for (int i = 0; i < mute.length; i++) {
			mute[i] = 0;
		}
		return new MidiEvents(pitches, mute, 0);
	}

}
