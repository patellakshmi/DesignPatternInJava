package creational.builder;

public class User {

    private String name;
    private String father;
    private int houseNum;
    private String add;
    private String pin;
    private String district;
    private String state;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.father = userBuilder.father;
        this.houseNum = userBuilder.houseNum;
        this.add = userBuilder.add;
        this.pin = userBuilder.pin;
        this.district = userBuilder.district;
        this.state = userBuilder.state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }
    //Builder class
    public static class UserBuilder{

        private String name;
        private String father;
        private int houseNum;
        private String add;
        private String pin;
        private String district;
        private String state;

        public UserBuilder(){};

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder setFather(String name){
            this.father = father;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }

}
