package structural.flyweight;

public class Trouser {
    private String fabric;

    public Trouser(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
