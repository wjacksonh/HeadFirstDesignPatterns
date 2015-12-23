package net.charter.wjackson.testfeatures;

public class TestGeneric<T> {
	private T mT;
	
	TestGeneric (T t) {
		mT = t;
	}
	
	public T get () {
		return mT;
	}
}
