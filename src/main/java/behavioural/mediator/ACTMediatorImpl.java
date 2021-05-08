package behavioural.mediator;

import java.util.List;

public class ACTMediatorImpl extends ACTMediator{

    @Override
    public void send(String msg, Aircraft aircraft) {
        aircraft.receive(msg);
    }
}
