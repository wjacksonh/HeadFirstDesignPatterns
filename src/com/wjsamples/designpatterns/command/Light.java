package com.wjsamples.designpatterns.command;

/*
 * This is a Receiver
 */
public class Light {
	String mName;
	
	public Light (String name) {
		mName = name;
	}
	
	public void on () {
		System.out.println(mName + " Light is On");
	}
	
	public void off () {
		System.out.println(mName + " Light is Off");
	}
}
