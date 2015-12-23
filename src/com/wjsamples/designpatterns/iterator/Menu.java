package com.wjsamples.designpatterns.iterator;

import java.util.Iterator;

public interface Menu {
	public String             getName ();	
	public Iterator<MenuItem> createIterator ();
}
