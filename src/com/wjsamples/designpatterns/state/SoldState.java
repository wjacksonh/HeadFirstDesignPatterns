package com.wjsamples.designpatterns.state;

public class SoldState implements State {
	GumballMachine mGumballMachine;
	
	public SoldState (GumballMachine gumballMachine) {
		mGumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice does not give you another gumball");
	}

	@Override
	public void dispense() {
		mGumballMachine.releaseBall();
		if (mGumballMachine.getCount () > 0) {
			mGumballMachine.setState(mGumballMachine.getNoQuarterState());
		} else {
			mGumballMachine.setState(mGumballMachine.getSoldOutState());
		}
	}
}
