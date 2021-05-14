package behavioural.command;

public class FanOnCommand implements Command{

    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.turnOff();
    }
}
