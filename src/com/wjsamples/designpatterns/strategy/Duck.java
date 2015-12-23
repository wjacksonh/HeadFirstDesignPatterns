package com.wjsamples.designpatterns.strategy;

public abstract class Duck {
	FlyBehavior   mFlyBehavior;
	QuackBehavior mQuackBehavior;
	
	public abstract void display ();
	
	public void performFly () {
		mFlyBehavior.fly ();
	}
	
	public void performQuack () {
		mQuackBehavior.quack ();
	}
	
	public void swim () {
		System.out.println("All ducks floatt, even decoys!");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.mFlyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.mQuackBehavior = quackBehavior;
	}
	
}
