package structural.bridge.bridge;

public class MacScheduler implements SystemScheduler{


    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the Mac system for schedules the thread...");
    }
}
