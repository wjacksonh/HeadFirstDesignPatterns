package com.wjsamples.designpatterns.command;

/*
 * This is a Receiver
 */
public class ApplianceControl {
	String mName;
	
	public ApplianceControl (String name) {
		mName = name;
	}
	
	public void on () {
		System.out.println(mName + " is On");
	}
	
	public void off () {
		System.out.println(mName + " is Off");
	}
}
