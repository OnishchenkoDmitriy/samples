package weatherStation_observer_pattern.subject;

import weatherStation_observer_pattern.display.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
