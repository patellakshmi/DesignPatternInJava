package structural.flyweight;

public class Shirt {

    private String fabric;

    public Shirt(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
