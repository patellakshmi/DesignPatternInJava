package behavioural.mediator;

public abstract class Aircraft {

    protected ACTMediator actMediator;
    protected String name;

    Aircraft(String name, ACTMediator actMediator){
        this.name = name;
        this.actMediator = actMediator;
    }

    public ACTMediator getActMediator() {
        return actMediator;
    }

    public void setActMediator(ACTMediator actMediator) {
        this.actMediator = actMediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void send(String msg, String nameOfAircraft);

    public abstract void receive(String msg);

}
