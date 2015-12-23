package com.wjsamples.designpatterns.decorator;

public class Espresso extends Beverage {

	public Espresso () {
		mDescription = "Espresso";
	}
	
	@Override
	public double cost() {
		double cost = 0;
		switch (getSize ()) {
			case TALL:   cost += 1.89; break;
			case GRANDE: cost += 1.99; break;
			case VENTI:  cost += 2.05; break;
		}
		return cost;
	}
}
