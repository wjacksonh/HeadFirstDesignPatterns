package com.wjsamples.designpatterns.command;

public class MacroCommand implements Command {
	Command[] mCommands;
	
	public MacroCommand (Command[] commands) {
		mCommands = commands;
	}

	@Override
	public void execute() {
		for (int i = 0; i < mCommands.length; i++) {
			mCommands[i].execute();
		}
	}

	@Override
	public void undo() {
		for (int i = 0; i < mCommands.length; i++) {
			mCommands[i].undo ();
		}		
	}	
}
