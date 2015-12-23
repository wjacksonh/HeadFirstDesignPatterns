package com.wjsamples.designpatterns.command;

public class HotTubOffCommand implements Command {
	HotTub mHotTub;
	
	public HotTubOffCommand (HotTub hotTub) {
		mHotTub = hotTub;
	}
	
	@Override
	public void execute() {
		mHotTub.jetsOff();
		mHotTub.setTemprature(98);
	}

	@Override
	public void undo() {
		mHotTub.circulate();
		mHotTub.setTemprature(104);
		mHotTub.jetsOn();	
	}
}
