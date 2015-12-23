package com.wjsamples.designpatterns.command;

public class CeillingFanLowCommand implements Command {
	CeillingFan mFan;
	int         mPreviousState;
	
	public CeillingFanLowCommand (CeillingFan fan) {
		mFan = fan;
	}
	
	@Override
	public void execute() {
		mPreviousState = mFan.getSpeed();
		mFan.low();
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
