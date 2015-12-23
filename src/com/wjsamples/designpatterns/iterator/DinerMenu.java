package com.wjsamples.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
	private static final int MAX_ITEMS = 6;
	
	private int         mNumberOfItems = 0;
	private MenuItem [] mMenuItems;
	
	public DinerMenu () {
		mMenuItems = new MenuItem[MAX_ITEMS];
		
		addItem ("Vegetarian BLT", 
				 "(Fakin') Bacon with lettuce & tomato on whole wheat",
				 true,
				 2.99);
		
		addItem ("BLT", 
				 "Bacon with lettuce & tomato on whole wheat",
				 false,
				 2.99);
		
		addItem ("Soup of the day", 
				 "Soup of the day, with side potato salad",
				 false,
				 3.29);
		
		addItem ("Hotdog", 
				 "A hot dog, with saurkraut, relish, onions, topped with cheese",
				 false,
				 3.05);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (mNumberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full! Can't add item to menu");
		} else {
			mMenuItems[mNumberOfItems] = menuItem;
			mNumberOfItems++;
		}
	}
	
	public Iterator<MenuItem> createIterator () {
		return new DinnerMenuIterator(mMenuItems);
	}

	@Override
	public String getName() {
		return "Lunch Menu";
	}
}
