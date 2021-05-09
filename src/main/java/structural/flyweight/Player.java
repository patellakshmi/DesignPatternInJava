package structural.flyweight;

public abstract class Player {

    //intrinsic attributes - common to all player
    protected Shirt shirt;
    protected Trouser trouser;
    protected Cap cap;

    //extrinsic attributes - dedicated to particular player
    protected String weapon;
    protected String type;

    public Player(Shirt shirt, Trouser trouser, Cap cap, String weapon, String type) {
        this.shirt = shirt;
        this.trouser = trouser;
        this.cap = cap;
        this.weapon = weapon;
        this.type = type;
    }

    public Player() {
    }

    public void setIntrinsic(Shirt shirt, Trouser trouser, Cap cap){
        this.shirt = shirt;
        this.trouser = trouser;
        this.cap = cap;
    }

    public void setExtrinsic(String weapon, String type){
        this.weapon = weapon;
        this.type = type;
    }

    public abstract void mission();

    public abstract Player getClone();

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shirt getShirt(){
        return this.shirt;
    }

}
