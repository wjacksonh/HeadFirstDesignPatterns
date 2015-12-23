package com.wjsamples.designpatterns.command;

public class GarageDoorUpCommand implements Command {
	GarageDoor mGarageDoor;
	
	public GarageDoorUpCommand (GarageDoor garageDoor) {
		mGarageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		mGarageDoor.up();
	}

	@Override
	public void undo() {
		mGarageDoor.down();
	}
}
