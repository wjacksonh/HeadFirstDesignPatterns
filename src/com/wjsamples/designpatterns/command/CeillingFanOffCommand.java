package com.wjsamples.designpatterns.command;

public class CeillingFanOffCommand implements Command {
	CeillingFan mFan;
	int         mPreviousState;
	
	public CeillingFanOffCommand (CeillingFan fan) {
		mFan = fan;
	}
	
	@Override
	public void execute() {
		mPreviousState = mFan.getSpeed();
		mFan.off ();
	}

	@Override
	public void undo() {
		switch (mPreviousState) {
			case CeillingFan.FAN_HIGH:   mFan.high();   break;
			case CeillingFan.FAN_MEDIUM: mFan.medium(); break;
			case CeillingFan.FAN_LOW:    mFan.low();    break;
			case CeillingFan.FAN_OFF:    mFan.off();    break;
		}
	}
}
