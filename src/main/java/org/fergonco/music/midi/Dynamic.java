package org.fergonco.music.midi;

public enum Dynamic {
	MUTE(0), PPPP(8), PPP(20), PP(31), P(42), MP(53), MF(64), F(80), FF(96), FFF(112), FFFF(127);

	private int level;

	Dynamic(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public Dynamic louder() {
		Dynamic[] dynamics = Dynamic.values();
		for (int j = 0; j < dynamics.length; j++) {
			if (dynamics[j] == this && j + 1 < dynamics.length) {
				return dynamics[j + 1];
			}
		}
		return this;
	}

}
