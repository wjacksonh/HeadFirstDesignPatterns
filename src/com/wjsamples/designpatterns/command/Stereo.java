package com.wjsamples.designpatterns.command;

public class Stereo {
	String mName;
	
	public Stereo(String name) {
		mName = name;
	}

	public void on () {
		System.out.println(mName + " Stereo is On");
	}
	
	public void off () {
		System.out.println(mName + " Stereo is Off");
	}
	
	public void setCD () {
		System.out.println(mName + " CD is On");
	}
	
	public void setDVD () {
		System.out.println(mName + " DVD is On");
	}
	
	public void setRadio () {
		System.out.println(mName + " Radio is On");
	}
	
	public void setVolume (int vol) {
		System.out.println(mName + " Volume is set to " + vol);
	}
}
