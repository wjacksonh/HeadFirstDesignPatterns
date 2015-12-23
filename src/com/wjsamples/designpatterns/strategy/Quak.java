package com.wjsamples.designpatterns.strategy;

public class Quak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack!!");
	}

}
