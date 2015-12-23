package com.wjsamples.designpatterns.singleton;

public class ChocolateFactory {
	private volatile static ChocolateFactory mInstance;
	
	private boolean mEmpty = true;
	private boolean mBoiled = false;
	
	private ChocolateFactory () {}
	
	/*
	 * Implemented as 'Double-Checked' Locking to Avoid using 
	 * synchronized after initialization.
	 */
	public static ChocolateFactory getInstance () {
		if (mInstance == null) {
			synchronized (ChocolateFactory.class) {
				if (mInstance == null) {
					System.err.println("Creating singleton of ChocolateFactory");
					mInstance = new ChocolateFactory ();
				}
			}
		}
		
		return mInstance;
	}
	
	public boolean isEmpty () {
		return mEmpty;
	}
	
	public boolean isBoiled () {
		return mBoiled;
	}
	
	public void fill () {
		if (isEmpty()) {
			mEmpty = false;
			mBoiled = false;
			System.err.println("Filling the boiler...");
		} else {
			System.err.println("ERROR: not filling the boiler!");
		}
	}
	
	public void drain () {
		if (!isEmpty() && isBoiled()) {
			mEmpty = true;
			System.err.println("Draining the boiler...");
		} else {
			System.err.println("ERROR: not draining the boiler!");
		}
	}
	
	public void boil () {
		if (!isEmpty() && !isBoiled()) {
			mBoiled = true;
			System.err.println("boiling...");
		} else {
			System.err.println("ERROR: not boiling!");
		}
	}
}
