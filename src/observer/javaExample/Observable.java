package observer.javaExample;

/**
 * Created by MikBac on 2019
 */

public interface Observable {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver();

}
