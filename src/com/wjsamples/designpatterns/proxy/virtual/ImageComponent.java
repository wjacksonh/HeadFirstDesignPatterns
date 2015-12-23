package com.wjsamples.designpatterns.proxy.virtual;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8982894806625747944L;
	private Icon mIcon;
	
	public ImageComponent (Icon icon) {
		mIcon = icon;
	}
	
	public void setIcon (Icon icon) {
		mIcon = icon;
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int w = mIcon.getIconWidth();
		int h = mIcon.getIconHeight();
		int x = (800 - w)/2;
		int y = (800 - h)/2;
		mIcon.paintIcon(this, g, x, y);
	}
}
