package behavioural.template;

public class MarioGame extends Game{
    @Override
    public boolean isEnableAudioCommand() {
        return true;
    }

    @Override
    public void configAudioSystem() {
        System.out.println("Configuring the Audio System...");
    }

    @Override
    public void initialize() {
        System.out.println("Initialized the game...");
    }

    @Override
    public void start() {
        System.out.println("Started the game...");
    }

    @Override
    public void end() {
        System.out.println("end the game...");
    }
}
