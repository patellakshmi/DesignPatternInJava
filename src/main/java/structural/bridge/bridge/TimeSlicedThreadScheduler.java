package structural.bridge.bridge;

public class TimeSlicedThreadScheduler extends ThreadScheduler{


    TimeSlicedThreadScheduler(SystemScheduler systemScheduler) {
        super(systemScheduler);
    }

    @Override
    public void schedule() {
        System.out.println("TimeSlicedThreadScheduler schedule the thread..");
    }

    @Override
    public void manageToSchedule() {
            systemScheduler.manageToSchedule();
    }
}
