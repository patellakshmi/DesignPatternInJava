package structural.flyweight.driver;

import structural.flyweight.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {

    public static void drive(){

        Shirt shirt = new Shirt("Cotton");
        Trouser trouser = new Trouser("Cotton");
        Cap cap = new Cap("Cotton");

        String weapon = "None";
        String type = "None";

        CounterTerrorist counterTerrorist = new CounterTerrorist(shirt, trouser, cap, weapon, "CT");
        Terrorist terrorist = new Terrorist(shirt, trouser, cap, weapon, "T");

        List<Player> counterTerroristList = new ArrayList<>();
        List<Player> terroristList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            Player ct = counterTerrorist.getClone();

            counterTerroristList.add(ct);
        }

        for(int i = 0; i < 5; i++){
            Player t = terrorist.getClone();
            t.setExtrinsic("AK"+i, "T");
            counterTerroristList.add(t);
        }

        for(Player p: counterTerroristList){
            System.out.println(p);
            System.out.println(p.getShirt());
        }

        for(Player p: terroristList){
            System.out.println(p);
            System.out.println(p.getShirt());
        }










    }
}
