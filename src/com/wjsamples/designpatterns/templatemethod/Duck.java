package com.wjsamples.designpatterns.templatemethod;

public class Duck implements Comparable<Duck> {
	String mName;
	int    mWeight;
	
	public Duck (String name, int weight) {
		mName = name;
		mWeight = weight;
	}
	
	@Override
	public String toString() {
		return "Duck [mName=" + mName + ", mWeight=" + mWeight + "]";
	}

	@Override
	public int compareTo(Duck otherDuck) {
		if (mWeight < otherDuck.mWeight) {
			return -1;
		} else if (mWeight == otherDuck.mWeight) {
			return 0;
		} else {
			return 1;
		}
	}
}
