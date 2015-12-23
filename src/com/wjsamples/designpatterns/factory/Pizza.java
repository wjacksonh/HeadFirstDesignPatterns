package com.wjsamples.designpatterns.factory;

public abstract class Pizza {
	String     mName;
	Dough      mDough;
	Sauce      mSauce;
	Veggies    mVegies [];
	Cheese     mCheese;
	Peppereoni mPepperoni;
	Clams      mClams;
	
	abstract void prepare ();
	
	void bake () {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut () {
		System.out.println("Cuttong the pizza into diaganal slices");
	}
	
	void box () {
		System.out.println("Place pizza in official pizza store box");
	}
	
	String getName () {
		return mName;
	}
	
	@Override
	public String toString() {
		return String.format("%s", mName);
	}

	public void setName(String name) {
		mName = name;
	}
}
