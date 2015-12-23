package com.wjsamples.designpatterns.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast () {
		mDescription = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		double cost = 0;
		switch (getSize ()) {
			case TALL:   cost += .89; break;
			case GRANDE: cost += .99; break;
			case VENTI:  cost += 1.05; break;
		}
		return cost;
	}
}
