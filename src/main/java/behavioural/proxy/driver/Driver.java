package behavioural.proxy.driver;

import behavioural.proxy.ProxyInternet;
import behavioural.proxy.RealInternet;

public class Driver {

    public static void drive(){

        ProxyInternet proxyInternet = new ProxyInternet(new RealInternet());
        try {
            proxyInternet.connect("abc.com");
        }catch (Exception e){
            System.out.println("Exception: "+e);
        }

    }

}
