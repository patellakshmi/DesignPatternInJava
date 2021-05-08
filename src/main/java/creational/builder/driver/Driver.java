package creational.builder.driver;

import creational.builder.User;

public class Driver {

    public static void driver(){
        User user = User.builder().setName("Lakshmi").setFather("R.R.Patel").build();
        System.out.println(user.getName());
    }

    public static void drive() {
        User user = User.builder().setName("Lakshmi").setFather("R.R.Patel").build();
        System.out.println(user.getName());
    }
}
