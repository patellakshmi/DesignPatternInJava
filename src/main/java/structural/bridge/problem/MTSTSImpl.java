package structural.bridge.problem;

public class MTSTSImpl extends TimeSlicedThreadScheduler{
    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the Mac system for schedules the thread...");
    }
}
