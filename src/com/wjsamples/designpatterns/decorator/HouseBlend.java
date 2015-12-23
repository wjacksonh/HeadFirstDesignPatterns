package com.wjsamples.designpatterns.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend () {
		mDescription = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		double cost = 0;
		switch (getSize ()) {
			case TALL:   cost += .79; break;
			case GRANDE: cost += .89; break;
			case VENTI:  cost += .99; break;
		}
		return cost;
	}
}
