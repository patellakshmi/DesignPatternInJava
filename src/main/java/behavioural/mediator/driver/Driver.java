package behavioural.mediator.driver;

import behavioural.mediator.ACTMediator;
import behavioural.mediator.ACTMediatorImpl;
import behavioural.mediator.Aircraft;
import behavioural.mediator.AircraftImpl;

import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void drive(){

       ACTMediator actMediator = new ACTMediatorImpl();
        Aircraft boeing = new AircraftImpl("Boeing-709", actMediator);
        Aircraft patel = new AircraftImpl("GoAir-500", actMediator);
        boeing.send("What is your location", "goAir-500");
        patel.send("I am at: lat:908, long: 456", "Boeing-709");



    }
}
