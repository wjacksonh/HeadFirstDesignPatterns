package com.wjsamples.designpatterns.decorator;

public abstract class CondimentDecorator extends Beverage {
	Beverage mBeverage;
	
	public CondimentDecorator (Beverage.Builder builder) {
		mBeverage = builder.get();
	}
	
	@Override
	public Size getSize () {
		return mBeverage.getSize();
	}
	
	public void setSize (Size size) {
		mBeverage.setSize(size);
	}
	
	@Override
	public String getDescription () {
		return mBeverage.getDescription();
	}

	@Override
	public double cost() {
		return mBeverage.cost();
	}
}
