package com.wjsamples.designpatterns.decorator;

public class Mocha extends CondimentDecorator {
	
	public Mocha (Beverage.Builder builder) {
		super(builder);
	}
	
	@Override
	public Size getSize () {
		return mBeverage.getSize();
	}	
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double cost = 0;
		switch (getSize ()) {
			case TALL:   cost += .10; break;
			case GRANDE: cost += .15; break;
			case VENTI:  cost += .20; break;
		}
		return cost + super.cost();
	}
}
