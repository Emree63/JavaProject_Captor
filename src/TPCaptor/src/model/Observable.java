package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

}
