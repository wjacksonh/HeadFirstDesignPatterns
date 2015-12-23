package com.wjsamples.designpatterns.proxy.remote;

public class NoQuarterState implements State {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3744233869211177751L;
	transient GumballMachine mGumballMachine;
	
	public NoQuarterState (GumballMachine gumballMachine) {
		mGumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		mGumballMachine.setState (mGumballMachine.getHasQuarterState ());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

}
