package com.wjsamples.designpatterns.command;

/*
 * This is a Receiver
 */
public class HotTub {
	
	public HotTub () {
	}
	
	public void circulate () {
		System.out.println("Hotub is circulating");
	}
	
	public void jetsOn () {
		System.out.println("Hottub is bubling");
	}
	
	public void jetsOff () {
		System.out.println("Hottub jets off");
	}
	
	public void setTemprature (int temp) {
		if (temp < 100) {
			System.out.println("Hot tub is cooling to " + temp + " degrees");
		} else {
			System.out.println("Hot tub is heating to " + temp + " degrees");
		}
	}
}
