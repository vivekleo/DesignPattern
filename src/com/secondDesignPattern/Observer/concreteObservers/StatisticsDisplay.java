package com.secondDesignPattern.Observer.concreteObservers;

import com.secondDesignPattern.Observer.DisplayElement;
import com.secondDesignPattern.Observer.Observer;
import com.secondDesignPattern.Observer.Subject;
import com.secondDesignPattern.Observer.model.WeatherModel;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private WeatherModel weatherModel;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Average/Min/Max Temperature: " + weatherModel.getTemperature() + "/" + weatherModel.getTemperature() + "/" + weatherModel.getTemperature());
    }

    @Override
    public void update(WeatherModel weatherModel) {
        this.weatherModel = weatherModel;
        display();
    }
}
