package com.wjsamples.designpatterns.proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;

public interface ImageState {
	public int  getIconHeight();
	public int  getIconWidth();
	public void paintIcon(Component c, Graphics g, int x, int y);
}
