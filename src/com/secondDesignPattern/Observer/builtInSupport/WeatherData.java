package com.secondDesignPattern.Observer.builtInSupport;

import com.secondDesignPattern.Observer.model.WeatherModel;

import java.util.Observable;

public class WeatherData extends Observable {
    private final WeatherModel weatherModel;

    public WeatherData() {
        weatherModel = new WeatherModel();
    }

    public void measurementsChanged() {
        setChanged();//We first now call setChanged() to indicate the state has changed before calling notify observers.
        notifyObservers();// notice we are not sending data object with notifyObservers() call which means we are using pull model.
    }


    public void setMeasurementsChanged(float temperature, float humidity, float pressure) {
        weatherModel.setPressure(pressure);
        weatherModel.setTemperature(temperature);
        weatherModel.setHumidity(humidity);
        measurementsChanged();
    }

    public WeatherModel getWeatherModel() {
        return weatherModel;
    }
}
