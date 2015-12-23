package com.wjsamples.designpatterns.command;

public class LightOffCommand implements Command {
	Light mLight;
	
	public LightOffCommand (Light light) {
		mLight = light;
	}
	
	@Override
	public void execute() {
		mLight.off ();
	}

	@Override
	public void undo() {
		mLight.on ();

	}
}
