import nl.hhs.kachel.Kachel;
import nl.hhs.observer.Observable;

public class Test extends Observable {

    public static void main(String[] args) {

        Test test = new Test ();
        test.addObserver (new Kachel (1));
        test.addObserver (new Kachel (2));
        test.setChanged();
        test.notifyObservers();
        test.setChanged ();
        test.notifyObservers ();
    }
}