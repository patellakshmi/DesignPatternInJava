package structural.flyweight;

public class CounterTerrorist extends Player{

    public CounterTerrorist(Shirt shirt, Trouser trouser, Cap cap, String weapon, String type){
        super(shirt, trouser, cap, weapon, type);
    }

    @Override
    public void mission() {
        System.out.println("Safe the citizens");
    }

    @Override
    public Player getClone() {
        return new CounterTerrorist(this.shirt, this.trouser, this.cap, this.weapon, this.type);
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
