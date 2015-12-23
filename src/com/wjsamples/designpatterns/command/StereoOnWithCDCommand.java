package com.wjsamples.designpatterns.command;

public class StereoOnWithCDCommand implements Command {
	Stereo mStereo;
	
	public StereoOnWithCDCommand (Stereo stereo) {
		mStereo = stereo;
	}
	
	@Override
	public void execute() {
		mStereo.on();
		mStereo.setCD();
		mStereo.setVolume(11);
	}

	@Override
	public void undo() {
		mStereo.off();
	}
}
