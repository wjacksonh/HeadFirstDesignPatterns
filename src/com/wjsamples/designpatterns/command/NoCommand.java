package com.wjsamples.designpatterns.command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("NULL execute");
	}

	@Override
	public void undo() {
		System.out.println("NULL Undo");
	}

}
