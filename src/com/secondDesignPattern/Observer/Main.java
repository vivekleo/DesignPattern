package com.secondDesignPattern.Observer;

import com.secondDesignPattern.Observer.concreteObservers.CurrentConditionDisplay;
import com.secondDesignPattern.Observer.concreteObservers.StatisticsDisplay;
import com.secondDesignPattern.Observer.concreteSubject.WeatherData;

//Observer pattern: Defines one to many dependencies between objects so that when one object changes state,
// all dependents are notified and updated automatically.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(2, 8, 19);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.updateTemperature(19);
        weatherData.updateHumidity(18);
    }
}
