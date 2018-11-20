package com.secondDesignPattern.Observer.builtInSupport;

import com.secondDesignPattern.Observer.DisplayElement;
import com.secondDesignPattern.Observer.model.WeatherModel;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    WeatherModel weatherModel;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Humidity: " + weatherModel.getHumidity() + "   Temperature: " + weatherModel.getTemperature());
    }

    @Override
    public void update(Observable o, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            weatherModel = weatherData.getWeatherModel();
            display();
        }
    }
}
