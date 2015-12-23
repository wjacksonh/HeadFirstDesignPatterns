package com.wjsamples.designpatterns.facade;

public class DvdPlayer {
	Amplifier mAmp;
	String    mMovie;
	int       mState = 0;
	
	public DvdPlayer (Amplifier amp) {
		mAmp = amp;
	}
	
	public void on () {
		System.out.println("Turn on DvdPlayer");
	}
	
	public void off () {
		System.out.println("Turn off DvdPlayer");
	}
	
	public void eject () {
		System.out.println("Eject Dvd");
	}
	
	public void pause () {
		mState = 1;
		System.out.println("Pause Cd" + mMovie);
	}
	
	public void play () {
		switch (mState) {
			case 0: System.out.println("Start playing Dvd " + mMovie); break;
			case 1: System.out.println("Re-start playing Dvd from pause" + mMovie); break;
			case 2: System.out.println("Re-Start playing Dvd from stop" + mMovie); break;
			case 3: System.out.println("Already playing Dvd " + mMovie);
		}
	}
	
	public void play (String movie) {
		mMovie = movie;
		mState = 3;
		System.out.println("Start playing Dvd " + mMovie);
	}
	
	public void stop () {
		mState = 2;
		System.out.println("Stop playing Dvd " + mMovie);
	}
}
