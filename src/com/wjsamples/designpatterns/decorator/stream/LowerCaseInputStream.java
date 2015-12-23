package com.wjsamples.designpatterns.decorator.stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int ch = super.read();
		return (ch == -1 ? ch : Character.toLowerCase((char)ch));
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		
		return result;
	}

	
	
}
