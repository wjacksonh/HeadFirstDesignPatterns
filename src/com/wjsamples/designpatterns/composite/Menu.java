package com.wjsamples.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	private Iterator<MenuComponent>  mIterator = null;
	private ArrayList<MenuComponent> mMenuComponents = new ArrayList<MenuComponent>();
	private String                   mName;
	private String                   mDescription;;
	
	public Menu (String name, String description) {
		mName = name;
		mDescription = description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		mMenuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		mMenuComponents.remove(menuComponent);

	}
	
	@Override
	public MenuComponent getChild(int i) {
		return mMenuComponents.get(i);
	}

	public String             getName (){
		return mName;
	}
	
	@Override
	public String getDescription() {
		return mDescription;
	}
	
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		Iterator<MenuComponent> iterator = mMenuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent component = iterator.next();
			component.print();
		}
	}
	@Override
	public Iterator<MenuComponent> createIterator() {
		if (mIterator == null) {
			mIterator = new CompositeIterator (mMenuComponents.iterator());
		}
		
		return mIterator;
	}
}
