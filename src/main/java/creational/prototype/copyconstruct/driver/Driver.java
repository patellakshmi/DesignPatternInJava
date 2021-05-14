package creational.prototype.copyconstruct.driver;


import creational.prototype.copyconstruct.Address;
import creational.prototype.copyconstruct.Person;

public class Driver {
    public static void drive() throws CloneNotSupportedException {
        Address address = Address.builder().setHouse(123).setVillage("Sarai").setPost("Kanakpur").setDistrict("VNS").build();
        Person person = new Person("Patel", address);
        Person clonePerson = new Person(person);
        clonePerson.setName("Singh");
        clonePerson.getAddress().setVillage("Devrai");
        System.out.println(person.toString());
        System.out.println(clonePerson.toString());

    }
}
