package org.fergonco.music.midi;

import java.io.IOException;
import java.io.OutputStream;

public class NoteImpl extends AbstractNote implements Note {

	private int pitch;
	private int volume;

	public NoteImpl(int pitch, Duration duration, int volume) {
		super(duration);
		this.pitch = pitch;
		this.volume = volume;
	}

	public int getPitch() {
		return pitch;
	}

	public int getVolume() {
		return volume;
	}

	@Override
	public void write(int trackIndex, int ticksPerQuarterNote, OutputStream os) throws IOException {
		// timestamp
		write(os, 0);
		// event type
		os.write(NOTE_ON * 16 + trackIndex);
		// note
		os.write(getPitch());
		// volume
		os.write(getVolume());

		// length
		write(os, duration.getTicks(ticksPerQuarterNote));
		// event type
		os.write(NOTE_OFF * 16 + trackIndex);
		// note
		os.write(getPitch());
		// volume
		os.write(0);
	}

	@Override
	public void addDuration(Duration duration) {
		this.duration.add(duration);
	}

	@Override
	public MidiEvents getOnMidiEvents(int ticksPerQuarterNote) {
		return new MidiEvents(new int[] { pitch }, new int[] { volume }, duration.getTicks(ticksPerQuarterNote));
	}

	@Override
	public MidiEvents getOffMidiEvents() {
		return new MidiEvents(new int[] { pitch }, new int[] { 0 }, 0);
	}

}
