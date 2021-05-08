package structural.bridge.bridge;

public class LinuxScheduler implements SystemScheduler{
    @Override
    public void manageToSchedule() {
        System.out.println("Preparing the Linux system for schedules the thread...");
    }
}
