package com.wjsamples.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck () {
		mFlyBehavior = new FlyWithWings();
		mQuackBehavior = new Quak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
