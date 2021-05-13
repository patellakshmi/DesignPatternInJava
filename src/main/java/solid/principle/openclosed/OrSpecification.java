package solid.principle.openclosed;

public class OrSpecification implements Specification<Product>{

    private Specification<Product> first;
    private Specification<Product> second;

    public OrSpecification(Specification<Product> first, Specification<Product> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.first.isSatisfied(item) || this.second.isSatisfied(item);
    }

}
