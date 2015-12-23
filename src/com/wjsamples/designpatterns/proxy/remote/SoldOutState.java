package com.wjsamples.designpatterns.proxy.remote;

public class SoldOutState implements State {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1335916018297362501L;
	transient GumballMachine mGumballMachine;
	
	public SoldOutState (GumballMachine gumballMachine) {
		mGumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("No gumballs to dispense, do not insert a quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject since you did not enter a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("There's no quarter in the machine, you can't turn the crank.");
	}

	@Override
	public void dispense() {
		System.out.println("There are no gumballs to dispense");
	}
}
