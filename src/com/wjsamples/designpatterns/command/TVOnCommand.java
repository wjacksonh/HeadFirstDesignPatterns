package com.wjsamples.designpatterns.command;

public class TVOnCommand implements Command {
	TV mTV;
	
	public TVOnCommand (TV tv) {
		mTV = tv;
	}
	
	@Override
	public void execute() {
		mTV.on();
		mTV.setInputChannel("DVD");
		mTV.setVolume(5);
	}

	@Override
	public void undo() {
		mTV.off ();
	}
}
