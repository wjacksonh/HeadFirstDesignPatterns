package com.wjsamples.designpatterns.proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ImageStateReady implements ImageState {

	private ImageIcon  mImageIcon;
	
	public ImageStateReady (ImageIcon imageIcon) {
		mImageIcon = imageIcon;
	}
	
	@Override
	public int getIconHeight() {
		return mImageIcon.getIconHeight();
	}

	@Override
	public int getIconWidth() {
		return mImageIcon.getIconWidth();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		mImageIcon.paintIcon(c, g, x, y);
	}

}
