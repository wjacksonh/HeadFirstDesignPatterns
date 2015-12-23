package com.wjsamples.designpatterns.command;

public class StereoOnWithDVDCommand implements Command {
	Stereo mStereo;
	
	public StereoOnWithDVDCommand (Stereo stereo) {
		mStereo = stereo;
	}
	
	@Override
	public void execute() {
		mStereo.on();
		mStereo.setDVD();
		mStereo.setVolume(11);
	}

	@Override
	public void undo() {
		mStereo.off();
	}
}
