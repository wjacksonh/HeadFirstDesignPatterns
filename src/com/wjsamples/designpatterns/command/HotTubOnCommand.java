package com.wjsamples.designpatterns.command;

public class HotTubOnCommand implements Command {
	HotTub mHotTub;
	
	public HotTubOnCommand (HotTub hottub) {
		mHotTub = hottub;
	}
	
	@Override
	public void execute() {
		mHotTub.circulate();
		mHotTub.setTemprature(104);
		mHotTub.jetsOn();
	}

	@Override
	public void undo() {
		mHotTub.jetsOff();
		mHotTub.setTemprature(98);
	}
}
