package com.wjsamples.designpatterns.facade;

public class Tuner {
	Amplifier mAmp;
	int       mState = 0;
	
	public Tuner (Amplifier amp) {
		mAmp = amp;
	}
	
	public void on () {
		System.out.println("Turn on Tuner");
	}
	
	public void off () {
		System.out.println("Turn off Tuner");
	}
	
	public void setAm () {
		mState = 0;
		System.out.println("Set band to AM");
	}
	
	public void setFm () {
		mState = 1;
		System.out.println("Set band to FM");
	}
}
