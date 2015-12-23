package com.wjsamples.designpatterns.observer.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	JFrame mFrame;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go ();
	}
	
	public void go() {
		mFrame = new JFrame ();
		JButton button = new JButton ("Should I do it?");
		button.addActionListener(new AngelListener ());
		button.addActionListener(new DevilListener ());
		mFrame.getContentPane().add(BorderLayout.CENTER, button);
		mFrame.setSize(300, 200);
		mFrame.setVisible(true);
	}
	
	public class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on, do it!");
		}

	}
	public class AngelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Don't do it, you might regret it!");
		}
	}
}
