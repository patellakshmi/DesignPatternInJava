package structural.bridge.bridge;

public abstract class ThreadScheduler {

    protected SystemScheduler systemScheduler;

    ThreadScheduler(SystemScheduler systemScheduler){
        this.systemScheduler = systemScheduler;
    }

    public abstract void schedule();
    public abstract void manageToSchedule();


}
