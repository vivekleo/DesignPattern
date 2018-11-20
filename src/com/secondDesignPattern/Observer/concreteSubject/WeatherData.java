package com.secondDesignPattern.Observer.concreteSubject;

import com.secondDesignPattern.Observer.Observer;
import com.secondDesignPattern.Observer.Subject;
import com.secondDesignPattern.Observer.model.WeatherModel;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {
    private final Set<Observer> observerList;
    WeatherModel weatherModel;

    public WeatherData() {
        this(0, 0, 0);
    }

    public WeatherData(float temperature, float humidity, float pressure) {
        observerList = new HashSet<>();
        weatherModel = new WeatherModel(temperature, humidity, pressure);
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(observer -> observer.update(weatherModel));
    }

    public void updateTemperature(float newTemperature) {
        weatherModel.setTemperature(newTemperature);
        notifyObservers();
    }

    public void updateHumidity(float newHumidity) {
        weatherModel.setHumidity(newHumidity);
        notifyObservers();
    }

    public void updatePressure(float newPressure) {
        weatherModel.setPressure(newPressure);
        notifyObservers();
    }
}
