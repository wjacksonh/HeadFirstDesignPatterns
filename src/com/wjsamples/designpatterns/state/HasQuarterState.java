package com.wjsamples.designpatterns.state;

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine mGumballMachine;
	Random mRandomNumber = new Random(System.currentTimeMillis());
	
	public HasQuarterState (GumballMachine gumballMachine) {
		mGumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		mGumballMachine.setState(mGumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = mRandomNumber.nextInt(10);
		if ((winner == 0) && mGumballMachine.getCount() > 1) {
			mGumballMachine.setState(mGumballMachine.getWinnerState());
		} else {
			mGumballMachine.setState(mGumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
