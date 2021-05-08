package structural.bridge.problem;

public class LTSTSImpl extends TimeSlicedThreadScheduler{
    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the Linux system for schedules the thread...");
    }
}
