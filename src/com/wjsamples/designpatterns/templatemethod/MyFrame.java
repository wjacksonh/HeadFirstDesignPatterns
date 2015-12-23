package com.wjsamples.designpatterns.templatemethod;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(String title) {
		super (title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 300);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		String msg = "I rule!!";
		g.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Head First Design Patterns");
		
		frame.setVisible(true);

	}
}
