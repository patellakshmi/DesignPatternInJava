package structural.bridge.problem;

public class LPTSImpl extends PreemptiveThreadScheduler{
    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the Linux system for schedules the thread...");
    }
}
