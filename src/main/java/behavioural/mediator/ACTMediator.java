package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class ACTMediator {
    protected List<Aircraft> aircraftList = new ArrayList<>();

    public void register(Aircraft aircraft){
        aircraftList.add(aircraft);
    }

    public abstract void send(String msg, String aircraft);

}
