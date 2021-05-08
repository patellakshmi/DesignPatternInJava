package behavioural.iterator;

import java.util.List;

public class ProductIterator implements Iterator{

    private List<Product> productList;
    private int index;

    public ProductIterator(List<Product> productList) {
        this.productList = productList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        if( index == productList.size())
            return false;
        else return true;

    }

    @Override
    public Object next() {

        if( index == productList.size())
            return null;
        else {
            Product product = productList.get(index);
            index++;
            return product;
        }

    }
}
