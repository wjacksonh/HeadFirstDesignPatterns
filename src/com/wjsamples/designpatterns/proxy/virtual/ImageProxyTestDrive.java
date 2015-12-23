package com.wjsamples.designpatterns.proxy.virtual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageProxyTestDrive {	
	private ImageComponent            mImageComponent;
	private JFrame                    mFrame = new JFrame("CD Cover Viewer");
	private JMenuBar                  mMenuBar;
	private JMenu                     mMenu;
	private Hashtable<String, String> mCDs = new Hashtable<>();
	
	public static void main(String[] args) throws Exception {
		new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive () throws Exception {
		mCDs.put("Amon Amarth: Twilight of the Thunder God",                "http://ecx.images-amazon.com/images/I/51nqAqU-vmL.jpg");
		mCDs.put("Dimmu Borgir: Abrahadabra",                               "http://ecx.images-amazon.com/images/I/51p4RaK8IrL.jpg");
		mCDs.put("Cradle of Filth: The Manticore & Other Horrors (Deluxe)", "http://ecx.images-amazon.com/images/I/91C9AF46VkL._SL1400_.jpg");
		mCDs.put("Nightwish: Once",                                         "http://ecx.images-amazon.com/images/I/61QNX54X5ML.jpg");
		mCDs.put("Epica: Divine Conspiracy",                                "http://ecx.images-amazon.com/images/I/51w6WfTlb3L.jpg");
		mCDs.put("Arch Enemy: Khaos Legions",                               "http://ecx.images-amazon.com/images/I/81wre88PNJL._SL1500_.jpg");
		mCDs.put("Motionless in White: Infamous",                           "http://ecx.images-amazon.com/images/I/81q-19XjDZL._SL1500_.jpg");
		mCDs.put("Testament: The Gathering",                                "http://ecx.images-amazon.com/images/I/51XrnIoL2kL.jpg");

		URL initialURL = new URL ((String)mCDs.get("Arch Enemy: Khaos Legions"));
		
		mMenuBar = new JMenuBar();
		mMenu = new JMenu("Favorite CDs");
		mMenuBar.add(mMenu);
		mFrame.setJMenuBar(mMenuBar);
		
		for (String name : mCDs.keySet()) {
			JMenuItem menuItem = new JMenuItem(name);
			mMenu.add(menuItem);
			
			menuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					mImageComponent.setIcon(new ImageProxy(getCDUrl (e.getActionCommand()), mImageComponent));
				}
			});
		}
		
		mImageComponent = new ImageComponent (null);
		mImageComponent.setIcon(new ImageProxy (initialURL, mImageComponent));
		mImageComponent.repaint();
		mFrame.getContentPane().add(mImageComponent);
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mFrame.setSize(800, 600);
		mFrame.setVisible(true);
	}

	protected URL getCDUrl(String name) {

		try {
			String cdImage = mCDs.get(name);
			System.out.println("Name: " + name + " URL: " + cdImage);
			return new URL(cdImage);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
