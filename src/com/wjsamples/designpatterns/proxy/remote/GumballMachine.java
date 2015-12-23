package com.wjsamples.designpatterns.proxy.remote;

import java.rmi.RemoteException;

public class GumballMachine	implements GumballMachineRemote {	
	private State  mSoldOutState;
	private State  mNoQuarterState;
	private State  mHasQuarterState;
	private State  mSoldState;
	private State  mWinnerState;
	private String mLocation;
	
	private State mState = mSoldOutState;
	private int   mCount = 0;
	
	public GumballMachine (String location, int count) throws RemoteException {
		mSoldOutState = new SoldOutState (this);
		mNoQuarterState = new NoQuarterState(this);
		mHasQuarterState = new HasQuarterState (this);
		mSoldState = new SoldState (this);
		mWinnerState = new WinnerState (this);
		
		mLocation = location;
		
		mCount = count;
		if (mCount > 0) {
			mState = mNoQuarterState;
		}
	}
	
	public void insertQuarter() {
		mState.insertQuarter();
	}
	
	public void ejectQuarter() {
		mState.ejectQuarter();
	}
	
	public void turnCrank() {
		if (mState instanceof HasQuarterState) {
			mState.turnCrank();
			mState.dispense();
		}
	}
	
	@Override
	public String toString() {
		return "\nGumball Machine has " + mCount + " and is in state " + mState.toString() + "\n";
	}
	
	public void refil (int count) {
		mCount = count;
		mState = mNoQuarterState;
	}

	void setState(State state) {
		mState = state;
	}
	
	public void releaseBall () {
		System.out.println("A gumball comes rolling out of the slot...");
		if (mCount != 0) {
			mCount--;
		}
	}
	
	public State getHasQuarterState() {
		return mHasQuarterState;
	}

	public State getSoldOutState() {
		return mSoldOutState;
	}

	public State getNoQuarterState() {
		return mNoQuarterState;
	}

	public State getSoldState() {
		return mSoldState;
	}
	
	public State getWinnerState() {
		return mWinnerState;
	}

	public int getCount() {
		return mCount;
	}

	public String getLocation() {
		return mLocation;
	}
	
	public State getState () {
		return mState;
	}
}
