package observer.javaExample;

import java.util.HashSet;
import java.util.Set;

public class User implements Observable {

    private Set<Observer> observers = new HashSet<>();
    private String newestUser;


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }


    public String getNewestUser() {
        return newestUser;
    }

    public void setNewestUser(String newestUser) {
        this.newestUser = newestUser;
        notifyObserver();
    }
}
