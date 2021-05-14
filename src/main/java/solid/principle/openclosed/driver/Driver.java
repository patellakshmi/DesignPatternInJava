package solid.principle.openclosed.driver;

import solid.principle.openclosed.*;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void drive(){

        Product p1 = new Product("Polo", Color.BLUE, Size.HUGE);
        Product p2 = new Product("Nike", Color.YELLOW, Size.HUGE);
        Product p3 = new Product("Duke", Color.GREEN, Size.MEDIUM);
        Product p4 = new Product("Dollar", Color.RED, Size.SMALL);

        List<Product> list = new ArrayList<Product>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        BetterFilter bf = new BetterFilter();
        //bf.filter(list, new ColorSpecification(Color.BLUE)).forEach(product -> System.out.println(product.toString()));
        bf.filter(list, new OrSpecification(new ColorSpecification(Color.YELLOW), new SizeSpecification(Size.HUGE))).forEach(
                product -> System.out.println(product.toString())
        );
    }

}
