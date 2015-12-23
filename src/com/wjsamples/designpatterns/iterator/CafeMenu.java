package com.wjsamples.designpatterns.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
	private Hashtable<String, MenuItem> mMunuItems = new Hashtable<String, MenuItem>();
	
	public CafeMenu () {
		addItem ("Veggie Burger and Air Fries",
				 "Veggie Burger on a whole wheat bunm leeuce, tomato, and fries",
				 true,
				 3.99);
		
		addItem ("Soup of the day",
				 "A cup of Soup of the day and a side salad",
				 false,
				 3.69);
		
		addItem ("Burrito",
				 "A large burrito, with pinto beans, salsa, gaucamole",
				 false,
				 3.69);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		mMunuItems.put(name, item);
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return mMunuItems.values().iterator();
	}

	@Override
	public String getName() {
		return "Dinner Menu";
	}
}
