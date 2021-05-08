package behavioural.mediator;

public abstract class Aircraft {

    protected ACTMediator actMediator;
    protected String name;

    Aircraft(String name, ACTMediator actMediator){
        this.name = name;
        this.actMediator = actMediator;
    }

    public abstract void send(String msg, Aircraft aircraft);

    public abstract void receive(String msg);

}
