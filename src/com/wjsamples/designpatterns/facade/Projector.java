package com.wjsamples.designpatterns.facade;

public class Projector {
	DvdPlayer mDvd;
	
	public Projector (DvdPlayer dvd) {
		mDvd = dvd;
	}
	
	public void on () {
		System.out.println("Turn Projector on");
	}
	
	public void off () {
		System.out.println("Turn Projector off");
	}
	
	public void tvMode () {
		System.out.println("Set Projector to tv mode");
	}
	
	public void wideScreenMode () {
		System.out.println("Set Projector too wide screen mode");
	}
}
