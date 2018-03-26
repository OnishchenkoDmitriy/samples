package weatherStation_observer_pattern;

import weatherStation_observer_pattern.display.DisplayElement;
import weatherStation_observer_pattern.display.impl.CurrentConditionsDisplay;
import weatherStation_observer_pattern.subject.impl.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(70, 23, 35.4f);
        weatherData.setMeasurements(30, 63, 72.4f);
    }
}
