package creational.factory.simple;

public class Helicopter implements Transport {
    @Override
    public void use() {
        System.out.println("Hey... I am using air-space for travelling");
    }
}
