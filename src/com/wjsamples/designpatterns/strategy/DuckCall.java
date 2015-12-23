package com.wjsamples.designpatterns.strategy;

public class DuckCall {
	FlyBehavior   mFlyBehavior;
	QuackBehavior mQuackBehavior;
	
	public DuckCall () {
		mFlyBehavior = new FlyNoWay();
		mQuackBehavior=  new Quak();
	}
	
	
	public void performFly () {
		mFlyBehavior.fly ();
	}
	
	public void performQuack () {
		mQuackBehavior.quack ();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.mFlyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.mQuackBehavior = quackBehavior;
	}
}
