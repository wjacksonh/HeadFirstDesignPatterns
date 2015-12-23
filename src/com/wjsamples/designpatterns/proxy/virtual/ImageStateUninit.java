package com.wjsamples.designpatterns.proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

public class ImageStateUninit implements ImageState {

	private ImageProxy mProxy;
	private Thread     mRetrivalThread;
	private boolean    mRetrieving = false;
	private ImageIcon  mImageIcon;
	private Component  mHoldingComponent;
	private URL        mImageURL;
	
	public ImageStateUninit (ImageProxy proxy, URL url, Component c) {
		mProxy = proxy;
		mHoldingComponent = c;
		mImageURL = url;
	}
	
	@Override
	public int getIconHeight() {
		return 600;
	}

	@Override
	public int getIconWidth() {
		return 800;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.drawString("Loading CD Cover, please wait...", x+300, y+190);
		
		if (!mRetrieving) {
			mRetrieving = true;
			mRetrivalThread = new Thread (new Runnable() {
				
				@Override
				public void run() {
					try {
						mImageIcon = new ImageIcon(mImageURL, "CD Cover");
						mHoldingComponent.repaint();
						mProxy.setState(new ImageStateReady(mImageIcon));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			mRetrivalThread.start();
		}
	}
}
