package com.wjsamples.designpatterns.command;

public class LightOnCommand implements Command {
	Light mLight;
	
	public LightOnCommand (Light light) {
		mLight = light;
	}
	
	@Override
	public void execute() {
		mLight.on ();
	}

	@Override
	public void undo() {
		mLight.off ();		
	}
}
