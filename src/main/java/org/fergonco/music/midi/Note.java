package org.fergonco.music.midi;

import java.io.IOException;
import java.io.OutputStream;

public interface Note {
	int A3 = 0x39;
	int C4 = 0x3c;
	int D4 = 0x3e;
	int E4 = 0x40;
	int F4 = 0x41;
	int G4 = 0x43;
	int A4 = 0x45;
	int B4 = 0x47;
	int NOTE_ON = 9;
	int NOTE_OFF = 8;
	
	void write(int trackIndex, int ticksPerQuarterNote, OutputStream os) throws IOException;

	void transpose(int i);

}
