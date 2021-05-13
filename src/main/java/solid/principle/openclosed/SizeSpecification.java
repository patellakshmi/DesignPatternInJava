package solid.principle.openclosed;

public class SizeSpecification implements Specification<Product>{

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        if( item.getSize() == size) return true;
        return false;
    }

}
