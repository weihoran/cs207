package performer;

import java.util.Observable;
import java.util.Observer;

public class Audience implements Observer {
    private int seatNo;

    private int getSeatNo() {
        return seatNo;
    }

    public Audience(int num){
        this.seatNo = num;
    }

    @Override
    public void update(Observable o, Object arg) {
        Integer state = (Integer) arg;
        switch (state) {
            case Performer.PERFORM_GOOD:
                applaud();
                break;
            case Performer.PERFORM_BAD:
                catcall();
                break;
        }
    }


    private void catcall() {
        System.out.println("Seat" + getSeatNo() + "is catcalling！");
    }

    private void applaud() {
        System.out.println("Seat" + getSeatNo() + "is applauding！");
    }


}
