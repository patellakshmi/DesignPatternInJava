package behavioural.command;

public class Fan {

    private String name;

    public Fan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void turnOff(){
        System.out.println("Turning fan off");
    }

    public void turnOn(){
        System.out.println("Turning fan on");
    }

    @Override
    public String toString() {
        return "Light{" +
                "name='" + name + '\'' +
                '}';
    }
}
