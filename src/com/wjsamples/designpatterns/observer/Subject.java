package com.wjsamples.designpatterns.observer;

public interface Subject {
	public void registerObseerver (Observer o);
	public void removeObseerver (Observer o);
	public void notifyObseervers ();
}
