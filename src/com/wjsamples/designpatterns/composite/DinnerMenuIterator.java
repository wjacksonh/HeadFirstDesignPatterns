package com.wjsamples.designpatterns.composite;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {
	private MenuItem [] mMenuItems;
	private int         mPosition = 0;
	
	public DinnerMenuIterator (MenuItem [] items) {
		mMenuItems = items;
	}
	
	@Override
	public boolean hasNext() {
		if (mPosition >= mMenuItems.length || mMenuItems[mPosition] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = mMenuItems[mPosition];
		mPosition++;
		return menuItem;
	}

	@Override
	public void remove() {
		if (mPosition <= 0) {
			throw new IllegalStateException ("You can't remove an item until you have done at least one next ()");
		}
		if (mMenuItems[mPosition-1] != null) {
			for (int i = mPosition-1; i < (mMenuItems.length-1); i++) {
				mMenuItems[i] = mMenuItems[i+1];
			}
			mMenuItems[mMenuItems.length-1] = null;
		}
	}
}
