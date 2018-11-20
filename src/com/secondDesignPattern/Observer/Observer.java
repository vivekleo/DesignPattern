package com.secondDesignPattern.Observer;

import com.secondDesignPattern.Observer.model.WeatherModel;

public interface Observer {
    void update(WeatherModel weatherModel);
}
