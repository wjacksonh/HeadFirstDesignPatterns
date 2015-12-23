package com.wjsamples.designpatterns.facade;

public class TheaterLights {
	int mDim;
	
	public void on () {
		System.out.println("Theater lights on");
	}
	
	public void off () {
		System.out.println("Theater lights off");
	}
	
	public void dim (int val) {
		mDim = val;
		System.out.println("Dim lights to " + mDim);
	}
}
