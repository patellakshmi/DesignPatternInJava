package behavioural.mediator;

import java.util.List;

public class ACTMediatorImpl extends ACTMediator{

    @Override
    public void send(String msg, String aircraftName) {
        aircraftList.stream().filter(aircraft ->aircraft.getName().equalsIgnoreCase(aircraftName)).forEach(aircraft -> aircraft.receive(msg));
    }
}
