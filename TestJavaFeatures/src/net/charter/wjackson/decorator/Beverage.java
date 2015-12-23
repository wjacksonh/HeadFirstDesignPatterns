package net.charter.wjackson.decorator;

public abstract class Beverage {
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
		
		public Beverage get () {
			return mBeverage;
		}
	}
	
	String mDescription;
	
	public String getDescription () {
		return mDescription;
	}
	
	public abstract double cost (); 
}
