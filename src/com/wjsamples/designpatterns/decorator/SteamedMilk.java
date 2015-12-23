package com.wjsamples.designpatterns.decorator;

public class SteamedMilk extends CondimentDecorator {
	
	public SteamedMilk (Beverage.Builder builder) {
		super(builder);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Steamed Milk";
	}

	@Override
	public Size getSize () {
		return mBeverage.getSize();
	}
	
	@Override
	public double cost() {
		double cost = super.cost();
		switch (getSize ()) {
			case TALL:   cost += .5;  break;
			case GRANDE: cost += .10; break;
			case VENTI:  cost += .15; break;
		}
		return cost;
	}
}
