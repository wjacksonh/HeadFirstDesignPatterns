package com.wjsamples.designpatterns.iterator;

public class MenuItem {
	private String  mName;
	private String  mDescription;
	private boolean mVegetarian;
	private double  mPrice;
	
	public MenuItem(String name,
					String description, 
					boolean vegetarian,
					double price) {
		mName        = name;
		mDescription = description;
		mVegetarian  = vegetarian;
		mPrice       = price;
	}

	public String getName() {
		return mName;
	}

	public String getDescription() {
		return mDescription;
	}

	public boolean isVegetarian() {
		return mVegetarian;
	}

	public double getPrice() {
		return mPrice;
	}	
}
