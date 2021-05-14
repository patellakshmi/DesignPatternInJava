package creational.factory.factory;

public class Car implements Transport {
    @Override
    public void use() {
        System.out.println("Hey... I am using road for travelling");
    }
}
