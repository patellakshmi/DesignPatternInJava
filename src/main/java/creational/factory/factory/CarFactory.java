package creational.factory.factory;

public class CarFactory implements IFactory{
    @Override
    public Transport getObject() {
        return new Car();
    }
}
