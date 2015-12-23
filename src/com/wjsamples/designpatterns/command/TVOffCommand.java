package com.wjsamples.designpatterns.command;

public class TVOffCommand implements Command {
	TV mTV;
	
	public TVOffCommand (TV tv) {
		mTV = tv;
	}
	
	@Override
	public void execute() {
		mTV.off ();
	}

	@Override
	public void undo() {
		mTV.on();
		mTV.setInputChannel("DVD");
		mTV.setVolume(5);
	}
}
