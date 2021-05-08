package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductContainer {

    private List<Product> productList;

    public ProductContainer(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){

        if( productList == null ){
            productList = new ArrayList<>();
        }else{
            productList.add(product);
        }

    }

    public Iterator getIterator(){
        return new ProductIterator(productList);
    }

}
