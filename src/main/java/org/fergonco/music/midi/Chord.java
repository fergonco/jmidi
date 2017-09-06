package org.fergonco.music.midi;

import java.util.Arrays;

public class Chord extends PolyphonicNote implements Note {

	public Chord(Duration duration, int volume, int... pitches) {
		super(duration, new int[0], pitches);
		int[] volumes = new int[pitches.length];
		Arrays.fill(volumes, volume);
		this.setVolumes(volumes);
	}

}
