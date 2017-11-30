package org.fergonco.music.midi;

public class MidiEvents {

	private int[] pitch;
	private int[] volume;
	private int lengthInTicks;

	public MidiEvents(int[] pitch, int[] volume, int lengthInTicks) {
		super();
		this.pitch = pitch;
		this.volume = volume;
		this.lengthInTicks = lengthInTicks;
	}

	public int[] getPitch() {
		return pitch;
	}

	public void setPitch(int[] pitch) {
		this.pitch = pitch;
	}

	public int[] getVolume() {
		return volume;
	}

	public void setVolume(int[] volume) {
		this.volume = volume;
	}

	public int getLengthInTicks() {
		return lengthInTicks;
	}

	public void setLengthInTicks(int lengthInTicks) {
		this.lengthInTicks = lengthInTicks;
	}

}
