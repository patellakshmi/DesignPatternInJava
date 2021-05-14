package creational.factory.simple.driver;

import creational.factory.simple.Car;
import creational.factory.simple.Transport;
import creational.factory.simple.TransportSimpleFactory;
import creational.factory.simple.Type;

public class Driver {
    public void drive(){
        Transport transport = TransportSimpleFactory.getObject(Type.CAR);
        transport.use();
    }
}
