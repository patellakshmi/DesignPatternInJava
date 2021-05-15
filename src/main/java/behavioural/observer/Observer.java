package behavioural.observer;

public abstract class Observer {

    private Observable observable;

    public abstract void update(String mgs);

    public void setObservable(Observable observable){
        this.observable = observable;
    }

    public void broadCast(String msg, Observer observer){
        observable.event(msg, observer);
    }
}
