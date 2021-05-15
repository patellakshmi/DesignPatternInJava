package behavioural.observer;

public class Person extends Observer{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("My name is "+this.name+" "+"I have received msg: "+msg);
    }

}
