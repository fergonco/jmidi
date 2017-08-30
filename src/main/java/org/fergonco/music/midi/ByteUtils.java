package org.fergonco.music.midi;

import java.nio.ByteBuffer;

public class ByteUtils {

	public static byte[] bytes(int integer) {
		ByteBuffer b = ByteBuffer.allocate(4);
		// b.order(ByteOrder.LITTLE_ENDIAN);
		b.putInt(integer);

		return b.array();
	}

	public static byte[] bytes(short theShort) {
		ByteBuffer b = ByteBuffer.allocate(2);
		// b.order(ByteOrder.LITTLE_ENDIAN);
		b.putShort(theShort);

		return b.array();
	}

}
