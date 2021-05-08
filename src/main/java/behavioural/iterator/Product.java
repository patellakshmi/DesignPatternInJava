package behavioural.iterator;

public class Product {

    private String name;
    private String desc;
    private double cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Product(String name, String desc, double cost) {
        this.name = name;
        this.desc = desc;
        this.cost = cost;
    }
}