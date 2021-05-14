package creational.prototype.serilizable.driver;


import creational.prototype.serilizable.Address;
import creational.prototype.serilizable.Person;
import sun.jvm.hotspot.oops.OopUtilities;

import java.io.*;

public class Driver {
    public static void drive() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Address address = Address.builder().setHouse(123).setVillage("Sarai").setPost("Kanakpur").setDistrict("VNS").build();
        Person person = new Person("Patel", address);

        String FILE = "/Volumes/Data/MyCourses/DesignPatternInJava/src/main/resources/object.txt";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE));
        outputStream.writeObject(person);
        outputStream.flush();
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE));
        Person clonePerson = (Person) inputStream.readObject();
        clonePerson.setName("Singh");
        clonePerson.getAddress().setVillage("Devrai");

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());

    }
}
