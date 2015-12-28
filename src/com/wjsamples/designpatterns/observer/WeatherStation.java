package com.wjsamples.designpatterns.observer;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay current   = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay        stats     = new StatisticsDisplay(weatherData);
		ForcastDisplay           forcast   = new ForcastDisplay(weatherData);
		HeatIndexDisplay         heatIndex = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
		current.display();
		stats.display();
		forcast.display();
		heatIndex.display();
	}

}
