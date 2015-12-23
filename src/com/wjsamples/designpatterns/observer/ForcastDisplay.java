package com.wjsamples.designpatterns.observer;

import java.util.Observable;
import java.util.Vector;
import java.util.Observer;

public class ForcastDisplay implements Observer, DisplayElement {
	private Observable     mObservable;
	private Vector <Float> mPressures;
	private int            mPressureTrend;
	
	public static final String IMPROVING_WEATHER = "Improving Weather on the way!";
	public static final String WORSENIG_WEATHER  = "Watch out for cooler, rainy weather";
	public static final String SAME_WEATHER      = "More of the same";
	
	public ForcastDisplay (Observable o) {
		mObservable = o;
		mObservable.addObserver (this);
		
		mPressures = new Vector<Float>();
		mPressureTrend = 0;
	}
	
	@Override
	public void display() {
		if (mPressures.size() == 1) {
			System.out.println(IMPROVING_WEATHER);
		} else {
			switch (mPressureTrend) {
				case  1: System.out.println(IMPROVING_WEATHER); break;
				case  0: System.out.println(SAME_WEATHER);      break;
				case -1: System.out.println(WORSENIG_WEATHER);  break;
			}
		}

	}
	
	void calculatePressureTrend () {
		int len = mPressures.size();
		if (mPressures.size() > 1) {
			float a = mPressures.get(len-2);
			float b = mPressures.get(len-1);
			
			if (a < b) {
				mPressureTrend = 1;
			} else if (a > b) {
				mPressureTrend = -1;
			} else {
				mPressureTrend = 0;
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			 mPressures.add(new Float (weatherData.getPressure()));
			 calculatePressureTrend ();
			 
			 display ();
		}
	}
}
