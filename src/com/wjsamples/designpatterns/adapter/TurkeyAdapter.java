package com.wjsamples.designpatterns.adapter;

public class TurkeyAdapter implements Duck {
	Turkey mTurkey;
	
	public TurkeyAdapter (Turkey turkey) {
		mTurkey = turkey;
	}
	
	@Override
	public void quack() {
		mTurkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++)
		mTurkey.fly();
	}
}
