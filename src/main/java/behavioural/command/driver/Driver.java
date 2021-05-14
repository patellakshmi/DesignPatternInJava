package behavioural.command.driver;

import behavioural.command.*;

public class Driver {
    public static void drive(){
        Fan fan = new Fan("USA-134");
        FanOffCommand fanOffCommand = new FanOffCommand(fan);
        FanOnCommand fanOnCommand = new FanOnCommand(fan);

        Light light = new Light("Bajaj-Ujala");
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        Remote remote = new Remote(fanOffCommand, fanOnCommand, lightOffCommand, lightOnCommand);
        remote.turnOffFan();

    }
}
