package org.fergonco.music.midi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class AbstractNote {

	protected void write(OutputStream os, int timestamp) throws IOException {
		ArrayList<Byte> bytes = new ArrayList<>();
		boolean done = false;
		while (!done) {
			bytes.add((byte) (timestamp % 128));
			timestamp = timestamp / 128;
			if (timestamp==0){
				done = true;
			}
		}
		for (int i = bytes.size() - 1; i >= 0; i--) {
			byte b = bytes.get(i);
			if (i > 0) {
				b = (byte) (b + 128);
			}
			os.write(b);
		}
	}

}
