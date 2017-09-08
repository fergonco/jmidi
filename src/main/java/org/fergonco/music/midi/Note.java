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
	int DRUMS_Acoustic_Bass_Drum = 35;
	int DRUMS_Bass_Drum_1 = 36;
	int DRUMS_Side_Stick = 37;
	int DRUMS_Acoustic_Snare = 38;
	int DRUMS_Hand_Clap = 39;
	int DRUMS_Electric_Snare = 40;
	int DRUMS_Low_Floor_Tom = 41;
	int DRUMS_Closed_Hi_Hat = 42;
	int DRUMS_High_Floor_Tom = 43;
	int DRUMS_Pedal_HiHat = 44;
	int DRUMS_Low_Tom = 45;
	int DRUMS_Open_HiHat = 46;
	int DRUMS_Low_Mid_Tom = 47;
	int DRUMS_Hi_Mid_Tom = 48;
	int DRUMS_Crash_Cymbal_1 = 49;
	int DRUMS_High_Tom = 50;
	int DRUMS_Ride_Cymbal_1 = 51;
	int DRUMS_Chinese_Cymbal = 52;
	int DRUMS_Ride_Bell = 53;
	int DRUMS_Tambourine = 54;
	int DRUMS_Splash_Cymbal = 55;
	int DRUMS_Cowbell = 56;
	int DRUMS_Crash_Cymbal_2 = 57;
	int DRUMS_Vibraslap = 58;
	int DRUMS_Ride_Cymbal_2 = 59;
	int DRUMS_Hi_Bongo = 60;
	int DRUMS_Low_Bongo = 61;
	int DRUMS_Mute_Hi_Conga = 62;
	int DRUMS_Open_Hi_Conga = 63;
	int DRUMS_Low_Conga = 64;
	int DRUMS_High_Timbale = 65;
	int DRUMS_Low_Timbale = 66;
	int DRUMS_High_Agogo = 67;
	int DRUMS_Low_Agogo = 68;
	int DRUMS_Cabasa = 69;
	int DRUMS_Maracas = 70;
	int DRUMS_Short_Whistle = 71;
	int DRUMS_Long_Whistle = 72;
	int DRUMS_Short_Guiro = 73;
	int DRUMS_Long_Guiro = 74;
	int DRUMS_Claves = 75;
	int DRUMS_Hi_Wood_Block = 76;
	int DRUMS_Low_Wood_Block = 77;
	int DRUMS_Mute_Cuica = 78;
	int DRUMS_Open_Cuica = 79;
	int DRUMS_Mute_Triangle = 80;
	int DRUMS_Open_Triangle = 81;

	void write(int trackIndex, int ticksPerQuarterNote, OutputStream os) throws IOException;

	void addDuration(Duration duration);

}
