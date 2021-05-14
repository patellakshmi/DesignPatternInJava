package creational.factory.factory;

public class Aeroplane implements Transport{
    @Override
    public void use() {
        System.out.println("Hey... I am using air-space for travelling");
    }
}
