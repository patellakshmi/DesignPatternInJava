package behavioural.momento.driver;

import behavioural.momento.CareTaker;
import behavioural.momento.Originator;

public class Driver {

    public static void drive(){
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator("Init-State");
        careTaker.addMomento(originator.getMomento());
        originator.setState("transition-state");
        originator.setState("hibernation-state");
        careTaker.addMomento(originator.getMomento());
        originator.setState("revoking-live-state");
        careTaker.addMomento(originator.getMomento());

        for(int i = 0; i < 3; i++){
            System.out.println(careTaker.getMomento(i).getState());
        }



    }
}
