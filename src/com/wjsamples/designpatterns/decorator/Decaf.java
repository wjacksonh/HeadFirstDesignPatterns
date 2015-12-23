package com.wjsamples.designpatterns.decorator;

public class Decaf extends Beverage {

	public Decaf () {
		mDescription = "Decaffinated Coffee";
	}
	
	@Override
	public double cost() {
		double cost = 0;
		switch (getSize ()) {
			case TALL:   cost += .99; break;
			case GRANDE: cost += 1.05; break;
			case VENTI:  cost += 1.15; break;
		}
		return cost;
	}
}
