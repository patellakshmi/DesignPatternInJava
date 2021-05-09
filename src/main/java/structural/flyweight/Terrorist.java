package structural.flyweight;

public class Terrorist extends Player{

    public Terrorist(Shirt shirt, Trouser trouser, Cap cap, String weapon, String type){
        super(shirt, trouser, cap, weapon, type);
    }

    @Override
    public void mission() {
        System.out.println("Kill the citizens");
    }

    @Override
    public Player getClone() {
        return new Terrorist(this.shirt, this.trouser, this.cap, this.weapon, this.type);
    }

    public void setExtrinsic(String weapon, String type){
        super.setExtrinsic(weapon, type);
    }

    public void setWeapon(String weapon) {
        super.setWeapon(weapon);
    }

    public void setType(String type) {
        super.setType(type);
    }

    public Shirt getShirt(){
        return this.shirt;
    }


}
