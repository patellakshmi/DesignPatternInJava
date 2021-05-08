package structural.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet{

    private List<String> whiteListHost = Arrays.asList("abc.com", "sfp.com", "f3e.com");
    private Internet internet;

    public ProxyInternet(Internet internet){
        this.internet = internet;
    }

    @Override
    public void connect(String host) throws Exception {
        if( whiteListHost.contains(host)){
            System.out.println("Connection established...");
        }else{
            System.out.println("Forbidden host... not able to connect");
            throw new Exception("Forbidden host... not able to connect");
        }
    }

}
