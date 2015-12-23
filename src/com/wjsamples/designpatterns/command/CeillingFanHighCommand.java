package com.wjsamples.designpatterns.command;

public class CeillingFanHighCommand implements Command {
	CeillingFan mFan;
	int         mPreviousState;
	
	public CeillingFanHighCommand (CeillingFan fan) {
		mFan = fan;
	}
	
	@Override
	public void execute() {
		mPreviousState = mFan.getSpeed();
		mFan.high();
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
