package creational.factory.factory;

public class AeroplaneFactory implements IFactory{
    @Override
    public Transport getObject() {
        return new Aeroplane();
    }
}
