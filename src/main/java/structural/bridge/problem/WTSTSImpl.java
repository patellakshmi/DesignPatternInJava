package structural.bridge.problem;

public class WTSTSImpl extends TimeSlicedThreadScheduler{
    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the Window system for schedules the thread...");
    }
}
