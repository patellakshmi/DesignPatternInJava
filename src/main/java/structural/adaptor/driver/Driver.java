package structural.adaptor.driver;

import structural.adaptor.Adapter;
import structural.adaptor.Client;
import structural.adaptor.Cow;
import structural.adaptor.Sparrow;

public class Driver {
    public static void drive(){

        Adapter adapter = new Adapter(new Sparrow());
        Client client = new Client(adapter);
        client.sound();


    }
}
