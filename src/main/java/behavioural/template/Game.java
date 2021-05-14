package behavioural.template;

public abstract class Game {

    public void play(){
        initialize();
        assetUpload();
        if( isEnableAudioCommand()) configAudioSystem();
        start();
        end();
    }

    //Irrespective of method all system uses same
    public void assetUpload(){
        System.out.println("Uploaded the assets...");
    }

    //Hooks function
    public abstract boolean isEnableAudioCommand();
    public abstract void configAudioSystem();

    //Need to be implement
    public abstract void initialize();
    public abstract void start();
    public abstract void end();

}
