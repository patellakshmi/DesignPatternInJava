package structural.bridge.bridge;

public class WindowScheduler implements SystemScheduler{

    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the Window system for schedules the thread...");
    }
}
