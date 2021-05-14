package structural.adaptor;

public class Client {

    private TerrestrialAnimalSound terrestrialAnimalSound;

    public Client(TerrestrialAnimalSound terrestrialAnimalSound) {
        this.terrestrialAnimalSound = terrestrialAnimalSound;
    }

    public void sound(){
        this.terrestrialAnimalSound.terrestrialSound();
    }

}
