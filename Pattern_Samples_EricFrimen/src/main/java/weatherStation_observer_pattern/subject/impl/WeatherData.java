package weatherStation_observer_pattern.subject.impl;

import weatherStation_observer_pattern.display.Observer;
import weatherStation_observer_pattern.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0){
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    private void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = humidity;
        measurementChanged();
    }

}
