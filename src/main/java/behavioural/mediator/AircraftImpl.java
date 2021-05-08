package behavioural.mediator;

public class AircraftImpl extends Aircraft{

    public AircraftImpl(String name, ACTMediator actMediator) {
        super(name, actMediator);
        actMediator.register(this);
    }

    @Override
    public void send(String msg, Aircraft aircraft) {
        actMediator.send(msg, aircraft);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Received: "+msg);
    }
}
