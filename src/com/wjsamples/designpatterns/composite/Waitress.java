package com.wjsamples.designpatterns.composite;

import java.util.Iterator;

public class Waitress {
	private MenuComponent mAllMenus;
	
	public Waitress(MenuComponent allMenus) {
		mAllMenus = allMenus;
	}
	
	public void printMenus () {
		mAllMenus.print();
	}
	
	public void printVegetarianMenu () {
		Iterator<MenuComponent> iterator = mAllMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent component = iterator.next();
			try {
				if (component.isVegetarian()) {
					component.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
}
