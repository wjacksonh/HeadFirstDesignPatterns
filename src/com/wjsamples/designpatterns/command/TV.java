package com.wjsamples.designpatterns.command;

/*
 * This is a Receiver
 */
public class TV {
	String mName;
	
	public TV (String name) {
		mName = name;
	}
	
	public void on () {
		System.out.println(mName + " TV is On");
	}
	
	public void off () {
		System.out.println(mName + " TV is Off");
	}
	
	public void setInputChannel (String channel) {
		System.out.println(mName + " TV is set to " + channel);
	}
	
	public void setVolume (int vol) {
		System.out.println(mName + " TV volume is set to " + vol);
	}
}
