package com.wjsamples.designpatterns.state;

public class WinnerState implements State {
	GumballMachine mGumballMachine;
	
	public WinnerState (GumballMachine gumballMachine) {
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
		System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		mGumballMachine.releaseBall();
		if (mGumballMachine.getCount() == 0) {
			mGumballMachine.setState(mGumballMachine.getSoldOutState());
		} else {
			mGumballMachine.releaseBall();
			if (mGumballMachine.getCount() > 0) {
				mGumballMachine.setState(mGumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs");
				mGumballMachine.setState(mGumballMachine.getSoldOutState());
			}
		}
	}
}
