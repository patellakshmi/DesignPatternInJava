package structural.bridge.problem;

public class WPTSImpl extends PreemptiveThreadScheduler{
    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the window system for schedules the thread...");
    }
}
