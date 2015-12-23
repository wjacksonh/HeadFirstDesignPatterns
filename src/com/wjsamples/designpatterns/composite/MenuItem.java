package com.wjsamples.designpatterns.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
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

	@Override
	public void print() {
		System.out.print(" " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", $" + getPrice());
		System.out.println("    --" + getDescription());
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator ();
	}
}
