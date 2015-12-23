package com.wjsamples.designpatterns.command;

public class GarageDoor {
	String mName;
	
	public GarageDoor (String name) {
		mName = name;
	}
	
	public void up () {
		System.out.println(mName + " Garage door up");
	}
	
	public void down () {
		System.out.println(mName+ " Garage door down");
	}
	
	public void stop () {
		System.out.println("Garage door stop");
	}
	
	public void lightOn () {
		System.out.println("Garage door light on");
	}
	
	public void lightOff () {
		System.out.println("Garage door up");
	}
}
