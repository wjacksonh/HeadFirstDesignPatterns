package com.wjsamples.designpatterns.facade;

public class CdPlayer {
	Amplifier mAmp;
	String    mSong;
	int       mState = 0;
	
	public CdPlayer (Amplifier amp) {
		mAmp = amp;
	}
	
	public void on () {
		System.out.println("Turn on CdPlayer");
	}
	
	public void off () {
		System.out.println("Turn off CdPlayer");
	}
	
	public void eject () {
		System.out.println("Eject Cd");
	}
	
	public void pause () {
		mState = 1;
		System.out.println("Pause Cd" + mSong);
	}
	
	public void play () {
		switch (mState) {
			case 0: System.out.println("Start playing Cd " + mSong); break;
			case 1: System.out.println("Re-start playing Cd from pause" + mSong); break;
			case 2: System.out.println("Re-Start playing Cd from stop" + mSong); break;
			case 3: System.out.println("Already playing Cd " + mSong);
		}
	}
	
	public void play (String song) {
		mSong = song;
		mState = 3;
		System.out.println("Start playing Cd " + mSong);
	}
	
	public void stop () {
		mState = 2;
		System.out.println("Stop playing Cd " + mSong);
	}
}
