package com.wjsamples.designpatterns.compound;

public class QuackCounter implements Quackable {
	private Quackable  mDuck;
	
	private static int mCounter = 0; 
	
	public QuackCounter(Quackable duck) {
		mDuck = duck;
	}
	
	@Override
	public void quack() {
		mDuck.quack();
		mCounter++;
	}
	
	public static int getQuacks () {
		return mCounter;
	}
}
