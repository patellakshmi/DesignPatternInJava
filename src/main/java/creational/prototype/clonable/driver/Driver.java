package creational.prototype.clonable.driver;

import creational.prototype.clonable.Address;
import creational.prototype.clonable.Person;

public class Driver {
    public static void drive() throws CloneNotSupportedException {
        Address address = Address.builder().setHouse(123).setVillage("Sarai").setPost("Kanakpur").setDistrict("VNS").build();
        Person person = new Person("Patel", address);
        Person clonePerson = (Person) person.clone();
        clonePerson.setName("Singh");
        clonePerson.getAddress().setVillage("Devrai");

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());
    }
}
