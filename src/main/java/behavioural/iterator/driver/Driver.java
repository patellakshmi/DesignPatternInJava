package behavioural.iterator.driver;

import behavioural.iterator.Iterator;
import behavioural.iterator.Product;
import behavioural.iterator.ProductContainer;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void drive(){

        Product p1 = new Product("CoolerXM","Cooler", 4000.00);
        Product p2 = new Product("LG-AC","AC", 8000.00);
        Product p3 = new Product("Mac-13","Computer System", 2000.00);
        Product p4 = new Product("AntiVirus-Giant","Anti-Virus", 3000.00);
        Product p5 = new Product("Maths-NT","Maths book on number theory", 5000.00);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);

        ProductContainer productContainer = new ProductContainer(productList);
        Iterator iterator = productContainer.getIterator();


        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println("Product Name: "+product.getName());
        }


    }
}
