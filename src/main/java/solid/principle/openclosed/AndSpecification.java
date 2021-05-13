package solid.principle.openclosed;

public class AndSpecification implements Specification<Product>{

    private Specification<Product> first;
    private Specification<Product> second;

    public AndSpecification(Specification<Product> first, Specification<Product> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.first.isSatisfied(item) && this.second.isSatisfied(item);
    }

}
