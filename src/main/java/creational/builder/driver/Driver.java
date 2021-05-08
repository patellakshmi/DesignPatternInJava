package creational.builder.driver;

import creational.builder.User;

public class Driver {

    public static void driver(){
        User user = new User.UserBuilder().setName("Lakshmi").setFather("R.R.Patel").build();
        System.out.println(user.getName());
    }
}
