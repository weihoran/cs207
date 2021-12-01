package performer;

import java.util.Observable;
import java.util.Random;

public class Performer extends Observable {

    public static final int PERFORM_GOOD = 0;
    public static final int PERFORM_BAD = 1;
    //public static final int PERFORM_END = 2;

    public void perform() {
        System.out.println("Performing");
        setChanged();
        notifyObservers(PERFORM_BAD);

    }

}
