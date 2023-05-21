package nl.hhs.observer;

public interface IObserver {

    // Deze methode wordt aangeroepen als de status van observable is veranderd.
    void update (Observable observable, Object object);
}
