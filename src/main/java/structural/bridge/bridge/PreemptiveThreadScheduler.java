package structural.bridge.bridge;

public class PreemptiveThreadScheduler extends ThreadScheduler{

    PreemptiveThreadScheduler(SystemScheduler systemScheduler) {
        super(systemScheduler);
    }

    @Override
    public void schedule() {
        System.out.println("PreemptiveThreadScheduler schedule the thread..");
    }

    @Override
    public void manageToSchedule() {
        systemScheduler.manageToSchedule();
    }
}
