package com.wjsamples.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	private ArrayList<Menu> mMenus;
	
	public Waitress(ArrayList<Menu> menus) {
		mMenus = menus;
	}
	
	public void printMenu () {
		Iterator<Menu> menusIterator = mMenus.iterator();
		System.out.println("Menu\n----");
		
		while (menusIterator.hasNext()) {
			Menu curMenu =  menusIterator.next();
			System.out.println("\n" + curMenu.getName());
			printMenu(curMenu.createIterator());
		}
	}

	private void printMenu(Iterator<MenuItem> iter) {
		while (iter.hasNext()) {
			MenuItem item = (MenuItem)iter.next();
			System.out.print (item.getName() + ", ");
			System.out.print (item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
	}
}
