package com.wjsamples.designpatterns.command;

public class StereoOffCommand implements Command {
	Stereo mStereo;
	
	public StereoOffCommand (Stereo stereo) {
		mStereo = stereo;
	}
	
	@Override
	public void execute() {
		mStereo.off();
	}

	@Override
	public void undo() {
		mStereo.on();
	}
}
