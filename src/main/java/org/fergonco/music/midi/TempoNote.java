package org.fergonco.music.midi;

import static org.fergonco.music.midi.ByteUtils.bytes;

import java.io.IOException;
import java.io.OutputStream;

public class TempoNote implements Note {

	private int msPerQuarterNote;

	public TempoNote(double tempo) {
		this.msPerQuarterNote = (int) (60000000 / tempo);
	}

	@Override
	public void write(int trackIndex, int ticksPerQuarterNote, OutputStream os) throws IOException {
		if (trackIndex == 0) {
			// Tempo metaevent
			os.write(0x00);
			os.write(0xFF);
			os.write(0x51);
			os.write(0x03);
			byte[] MPQ = bytes(msPerQuarterNote);
			os.write(MPQ, 1, 3);
		}
	}

	@Override
	public void addDuration(Duration duration) {
		// noop
	}

	@Override
	public MidiEvents getOnMidiEvents(int ticksPerQuarterNote) {
		throw new UnsupportedOperationException();
	}

	@Override
	public MidiEvents getOffMidiEvents() {
		throw new UnsupportedOperationException();
	}


}
