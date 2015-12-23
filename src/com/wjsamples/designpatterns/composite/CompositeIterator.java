package com.wjsamples.designpatterns.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
	private Stack<Iterator<MenuComponent>> mStack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		mStack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if (mStack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = mStack.peek();
			if (!iterator.hasNext()) {
				mStack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = mStack.peek();
			MenuComponent component = iterator.next();
			if (component instanceof Menu) {
				mStack.push(component.createIterator());
			}
			return component;
		} else {	
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
