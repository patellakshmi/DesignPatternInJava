package behavioural.command;

public class Remote {

    private Command fanOffCommand;
    private Command fanOnCommand;
    private Command lightOffCommand;
    private Command lightOnCommand;

    public Remote(Command fanOffCommand, Command fanOnCommand, Command lightOffCommand, Command lightOnCommand) {
        this.fanOffCommand = fanOffCommand;
        this.fanOnCommand = fanOnCommand;
        this.lightOffCommand = lightOffCommand;
        this.lightOnCommand = lightOnCommand;
    }

    public void turnOffLight(){
        this.lightOffCommand.execute();
    }

    public void turnOnLight(){
        this.lightOnCommand.execute();
    }

    public void turnOffFan(){
        this.fanOffCommand.execute();
    }

    public void turnOnFan(){
        this.fanOnCommand.execute();
    }
}
