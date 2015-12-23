package com.wjsamples.designpatterns.command;

public class GarageDoorDownCommand implements Command {
	GarageDoor mGarageDoor;
	
	public GarageDoorDownCommand (GarageDoor garageDoor) {
		mGarageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		mGarageDoor.down();
	}

	@Override
	public void undo() {
		mGarageDoor.up ();
	}
}
