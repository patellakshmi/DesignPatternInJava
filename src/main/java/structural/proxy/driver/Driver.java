package structural.proxy.driver;

import structural.proxy.ProxyInternet;
import structural.proxy.RealInternet;

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
