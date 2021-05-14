package creational.prototype.clonable;

public class Address implements Cloneable{

    private int house;
    private String village;
    private String post;
    private String district;

    public Address(int house, String village, String post, String district) {
        this.house = house;
        this.village = village;
        this.post = post;
        this.district = district;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public static AddressBuilder builder(){
        return new AddressBuilder();
    }

    public static class AddressBuilder{
        private int house;
        private String village;
        private String post;
        private String district;

        public AddressBuilder setHouse(int house) {
            this.house = house;
            return this;
        }

        public AddressBuilder setVillage(String village) {
            this.village = village;
            return this;
        }

        public AddressBuilder setPost(String post) {
            this.post = post;
            return this;
        }

        public AddressBuilder setDistrict(String district) {
            this.district = district;
            return this;
        }

        public Address build(){
            return new Address(this.house, this.village, this.post, this.district);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        super.clone();
        return new Address(this.house, this.village, this.post, this.district);
    }

    @Override
    public String toString() {
        return "Address{" +
                "house=" + house +
                ", village='" + village + '\'' +
                ", post='" + post + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
