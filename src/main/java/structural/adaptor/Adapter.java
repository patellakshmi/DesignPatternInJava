package structural.adaptor;

public class Adapter implements TerrestrialAnimalSound{

    private AerialAnimalSound aerialAnimalSound;

    public Adapter(AerialAnimalSound aerialAnimalSound) {
        this.aerialAnimalSound = aerialAnimalSound;
    }

    @Override
    public void terrestrialSound() {
        this.aerialAnimalSound.aerialSound();
    }
}
