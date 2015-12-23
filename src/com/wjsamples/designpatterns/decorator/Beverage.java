package com.wjsamples.designpatterns.decorator;

public abstract class Beverage {
	Size mSize = Size.TALL;
	
	public static class Builder {
		Beverage mBeverage;
		
		private Builder (Beverage beverage) {
			mBeverage = beverage;
		}
		
		public static Builder create (Beverage beverage) {
			return new Builder (beverage);
		}
		
		public Builder add (Beverage beverage) {
			mBeverage = beverage;
			
			return this;
		}
		
		public Builder setSize (Size size) {
			mBeverage.setSize(size);
			
			return this;
		}
		
		public Beverage get () {
			return mBeverage;
		}
	}
	
	String mDescription = "Unknown Description";
	
	public Size getSize () {
		return mSize;
	}
	
	public void setSize (Size size) {
		mSize = size;
	}
	
	public String getDescription () {
		String size = "Unknown Size";
		
		switch (mSize) {
			case TALL:   size = "Tall ";   break;
			case GRANDE: size = "Grande "; break;
			case VENTI:  size = "Venti ";  break;
		}	
		return size + mDescription;
	}
	
	public abstract double cost (); 
}
