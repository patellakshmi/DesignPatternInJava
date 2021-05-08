package structural.bridge.problem;

public abstract  class PreemptiveThreadScheduler implements ThreadScheduler{

    @Override
    public void schedule() {
        System.out.println("PreemptiveThreadScheduler schedule the thread..");
    }

    public abstract void manageToSchedule();

}
