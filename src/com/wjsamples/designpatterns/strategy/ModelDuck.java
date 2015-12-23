package com.wjsamples.designpatterns.strategy;

public class ModelDuck extends Duck {

	public ModelDuck () {
		mFlyBehavior = new FlyNoWay();
		mQuackBehavior = new Quak(); 
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck");
	}

}
