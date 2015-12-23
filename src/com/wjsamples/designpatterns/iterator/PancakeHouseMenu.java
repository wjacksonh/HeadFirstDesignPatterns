package com.wjsamples.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	private ArrayList<MenuItem> mMenuItems;
	
	public PancakeHouseMenu () {
		mMenuItems = new ArrayList<MenuItem> ();
		
		addItem ("K&B's Pancake Breakfast", 
				 "Pancakes with scrambled eggs, and toast",
				 true,
				 2.99);
		
		addItem ("Regular Pancake Breakfast", 
				 "Pancakes with fried eggs, and sausage",
				 false,
				 2.99);
		
		addItem ("Blueberry Pancakes", 
				 "Pancakes made with fresh blueberries",
				 true,
				 3.49);
		
		addItem ("Waffles", 
				 "Waffles with your choice of blueberries or strawberries",
				 true,
				 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		mMenuItems.add(menuItem);
	}
	
	public Iterator<MenuItem> createIterator () {
		return mMenuItems.iterator();
	}

	@Override
	public String getName() {
		return "Breakast Menu";
	}
}
