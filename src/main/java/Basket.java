import java.util.ArrayList;
import java.util.Iterator;

public class Basket {

    private Iterator iterator = new ProductIterator();
    private ArrayList<Product> productList = new ArrayList<Product>();

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public boolean removeProduct(Product product) {
        boolean status = this.productList.remove(product);
        return status;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public Iterator getIterator() {
        return iterator;
    }

    private class ProductIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {

            if(index < productList.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return productList.get(index++);
            } else {
                return null;
            }
        }
    }
}