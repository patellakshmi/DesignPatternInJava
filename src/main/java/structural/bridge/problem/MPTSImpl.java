package structural.bridge.problem;

public class MPTSImpl extends PreemptiveThreadScheduler{
    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the mac system for schedules the thread...");
    }
}
