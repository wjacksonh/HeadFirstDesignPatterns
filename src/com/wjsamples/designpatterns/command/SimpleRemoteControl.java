package com.wjsamples.designpatterns.command;

/*
 * SimpleRemoteControl is the Invoker
 */
public class SimpleRemoteControl {
	Command mSlot;
	
	public SimpleRemoteControl () {}
	
	
	public void setCommand (Command command) {
		mSlot = command;
	}
	
	public void buttonWasPressed () {
		mSlot.execute();
	}
}
