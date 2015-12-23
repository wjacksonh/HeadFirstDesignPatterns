package com.wjsamples.designpatterns.proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;

public class ImageProxy implements Icon {
	private Component  mHoldingComponent;
	
	private ImageState mState;
	
	public ImageProxy (URL url, Component c) {
		mHoldingComponent = c;
		mState = new ImageStateUninit(this, url, mHoldingComponent);
	}
	
	public void setState (ImageState state) {
		mState = state;
	}
	
	@Override
	public int getIconHeight() {
		return mState.getIconHeight();
	}

	@Override
	public int getIconWidth() {
		return mState.getIconWidth();
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		mState.paintIcon(c, g, x, y);
	}
}
