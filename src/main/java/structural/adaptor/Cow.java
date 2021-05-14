package structural.adaptor;

public class Cow implements TerrestrialAnimalSound{
    @Override
    public void terrestrialSound() {
        System.out.println("Cow sound...");
    }
}
