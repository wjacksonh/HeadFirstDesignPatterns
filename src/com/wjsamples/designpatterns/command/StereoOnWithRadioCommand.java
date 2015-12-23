package com.wjsamples.designpatterns.command;

public class StereoOnWithRadioCommand implements Command {
	Stereo mStereo;
	
	public StereoOnWithRadioCommand (Stereo stereo) {
		mStereo = stereo;
	}
	
	@Override
	public void execute() {
		mStereo.on();
		mStereo.setRadio();
		mStereo.setVolume(11);
	}

	@Override
	public void undo() {
		mStereo.off();
	}
}
