package com.secondDesignPattern.Observer.builtInSupport;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurementsChanged(2, 6, 19);
    }
}
