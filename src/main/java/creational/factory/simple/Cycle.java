package creational.factory.simple;

public class Cycle implements Transport{
    @Override
    public void use() {
        System.out.println("Hey... I am using road-space for travelling");
    }
}
