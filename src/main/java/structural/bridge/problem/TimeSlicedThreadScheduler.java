package structural.bridge.problem;

public abstract class TimeSlicedThreadScheduler implements ThreadScheduler{

    @Override
    public void schedule() {
        System.out.println("TimeSlicedThreadScheduler schedule the thread..");
    }

    public abstract void manageToSchedule();

}
