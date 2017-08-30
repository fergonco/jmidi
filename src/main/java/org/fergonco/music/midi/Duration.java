package org.fergonco.music.midi;

public class Duration {
	public static final Duration WHOLE = new Duration(4);
	public static final Duration HALF = new Duration(2);
	public static final Duration QUARTER = new Duration(1);
	public static final Duration EIGHTH = new Duration(1.0 / 2);
	public static final Duration SIXTEENTH = new Duration(1.0 / 4);

	private double multiplier;

	public Duration(double multiplier) {
		this.multiplier = multiplier;
	}

	public int getTicks(int ticksPerQuarterNote) {
		return (int) Math.round(ticksPerQuarterNote * multiplier);
	}

	public Duration dot() {
		return new Duration(multiplier + multiplier / 2);
	}

	public double getNumBeats() {
		return multiplier;
	}

	public void add(Duration duration) {
		// TODO Auto-generated method stub
		
	}

}
