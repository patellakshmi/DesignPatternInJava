package creational.factory.factory.driver;

import creational.factory.factory.CarFactory;
import creational.factory.factory.IFactory;
import creational.factory.factory.Transport;

public class Driver {
    public void drive(){
        IFactory iFactory = new CarFactory();
        Transport transport = iFactory.getObject();
        transport.use();
    }
}
