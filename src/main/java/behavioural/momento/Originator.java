package behavioural.momento;

public class Originator {

    private String state;

    public Originator(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Momento getMomento(){
        return new Momento(this.state);
    }

    public void setMomento(Momento momento){
        this.state = momento.getState();
    }

}
