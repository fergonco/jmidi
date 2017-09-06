package org.fergonco.music.midi;

import java.io.IOException;
import java.io.OutputStream;

public class DrumNoteImpl extends PolyphonicNote implements Note {

	public DrumNoteImpl(Duration duration, int[] volume, int[] instruments) {
		super(duration, volume, instruments);
	}

	@Override
	public void write(int trackIndex, int ticksPerQuarterNote, OutputStream os) throws IOException {
		super.write(9, ticksPerQuarterNote, os);
	}

}
