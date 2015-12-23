package com.wjsamples.designpatterns.facade;

public class Amplifier {
	Tuner     mTuner;
	DvdPlayer mDvd;
	CdPlayer  mCd;
	int       mVolume;
	
	public void on () {
		System.out.println("Turn amplifier on");
	}
	
	public void off () {
		System.out.println("Turn amplifier off");
	}
	
	public void setCd (CdPlayer cd) {
		mCd = cd;
		System.out.println("Set amplifier Cd");
	}
	
	public void setDvd (DvdPlayer dvd) {
		mDvd = dvd;
		System.out.println("Set amplifier Dvd");
	}
	
	public void setStereoSound () {
		System.out.println("Set amplifier to Stereo");
	}
	public void setSurroundSound () {
		System.out.println("Set amplifier to Surround sound");
	}
	
	public void setTuner (Tuner tuner) {
		mTuner = tuner;
		System.out.println("Set amplifier tuner");
	}
	
	public void setVolume (int vol) {
		mVolume = vol;
		System.out.println("Set amplifier volume to " + mVolume);
	}
}
