package solid.principle.openclosed;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product>{

    @Override
    public Stream<Product> filter(List<Product> products, Specification<Product> specification) {
        return products.stream().filter(product ->  specification.isSatisfied(product) );
    }

}
