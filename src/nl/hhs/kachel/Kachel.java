package nl.hhs.kachel;

import nl.hhs.observer.IObserver;
import nl.hhs.observer.Observable;

public class Kachel implements IObserver {

    private String name;
    private String onOrOff = "off";

    public Kachel (int nummer) {
        name = "Kachel " + nummer;
    }

    @Override
    public void update (Observable observable, Object object) {
        if (onOrOff.equals ("on")) {
            switchOff ();
        }
        else {
            switchOn ();
        }
    }

    private void switchOff () {
        System.out.println (name + " gaat uit.");
        System.out.println ("LET OP: de kachel moet nog afkoelen.\n==============");
        onOrOff = "off";
    }

    private void switchOn () {
        System.out.println (name + " gaat aan.\n==============");
        onOrOff = "on";
    }
}
