package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class ACTMediator {
    private List<Aircraft> aircraftList = new ArrayList<>();

    public void register(Aircraft aircraft){
        aircraftList.add(aircraft);
    }

    public abstract void send(String msg, Aircraft aircraft);

}
