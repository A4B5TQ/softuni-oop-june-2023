package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {


    private List<Observer> observers;

    public Publisher() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyForUpdate(Data data) {
        for (Observer observer : this.observers) {
            observer.update(data);
        }
    }
}
