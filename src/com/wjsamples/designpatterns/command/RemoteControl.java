package com.wjsamples.designpatterns.command;

public class RemoteControl {
	private static final int MAX_COMMANDS = 7;
	
	Command[] mOnCommands;
	Command[] mOffCommands;
	Command   mUndoComand;
	
	public RemoteControl () {
		mOnCommands  = new Command[MAX_COMMANDS];
		mOffCommands = new Command[MAX_COMMANDS];
		
		Command noCommand = new NoCommand ();
		for (int i = 0; i < MAX_COMMANDS; i++) {
			mOnCommands[i] = noCommand;
			mOffCommands[i] = noCommand;
		}
		mUndoComand = noCommand;
	}
	
	public void setCommand (int slot, Command onCommand, Command offComand) {
		if (slot < MAX_COMMANDS) {
			mOnCommands[slot] = onCommand;
			mOffCommands[slot] = offComand;
		} else {
			System.out.println("ERROR: slot is greater than max at " + slot);
		}
	}
	
	public void onButtonWasPushed (int slot) {
		if (slot < MAX_COMMANDS) {
			mOnCommands[slot].execute();
			mUndoComand = mOnCommands[slot];
		} else {
			System.out.println("ERROR: slot is greater than max at " + slot);
		}
	}
	
	public void offButtonWasPushed (int slot) {
		if (slot < MAX_COMMANDS) {
			mOffCommands[slot].execute();
			mUndoComand = mOffCommands[slot];
		} else {
			System.out.println("ERROR: slot is greater than max at " + slot);
		}
	}
	
	public void undoButtonPressed () {
		mUndoComand.undo();
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------ Remote Control ------\n");
		for (int i = 0; i < MAX_COMMANDS; i++) {
			stringBuffer.append("[slot " + i + "] " + mOnCommands[i].getClass().getName()
					+ "    " + mOffCommands[i].getClass().getName() + "\n");
		}
		stringBuffer.append("[undo] " + mUndoComand.getClass().getName() + "\n");
		return stringBuffer.toString();
	}
}
