package com.wjsamples.designpatterns.command;

/*
 * This is a Receiver
 */
public class CeillingFan {
	public static final int FAN_OFF    = 0;
	public static final int FAN_HIGH   = 3;
	public static final int FAN_MEDIUM = 2;
	public static final int FAN_LOW    = 1;

	String mName;
	int    mState;
	
	public CeillingFan (String name) {
		mName = name;
		mState = FAN_OFF;
	}
	
	public void high () {
		mState = FAN_HIGH;	
		System.out.println(mName + " Ceilling Fan is On high");
	}
	
	public void medium () {
		mState = FAN_MEDIUM;	
		System.out.println(mName + " Ceilling Fan is On medium");
	}
	
	public void low () {
		mState = FAN_LOW;
		System.out.println(mName + " Ceilling Fan is On low");
	}
	
	public void off () {
		mState = FAN_OFF;	
		System.out.println(mName + " Ceilling Fan is Off");
	}
	
	public int getSpeed () {
		return mState;
	}
}
