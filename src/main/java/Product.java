import java.util.ArrayList;

public class Product {

    private String name;
    private Float defaultPrice;
    private ProductCategory productCategory;
    private Integer ID;
    private static Integer LastID = 0;
    private static ArrayList<Product> productList = new ArrayList<Product>();

    public Product () {
        this.name = null;
        this.defaultPrice = 0.0f;
        this.productCategory = null;
        this.ID = 0;
    }

    public Product (String name, Float defaultPrice, ProductCategory productCategory) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
        LastID += 1;
        this.ID = LastID;
        productList.add(this);
    }

    public String getName() {
        return this.name;
    }

    public Float getDefaultPrice() {
        return this.defaultPrice;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public String toString(){
        return "ID:" + ID + ",name:" + this.name + ",defaultPrice:" + defaultPrice + ",productCategory:" + productCategory;
    }

    public static ArrayList<Product> getAllProducts() {
        return productList;
    }

    public static ArrayList<Product> getAllProductsBy(ProductCategory productCategory) {

        ArrayList<Product> productListBy = new ArrayList<Product>();

        for(int i = 0; i < productList.size(); i++){
            if (productList.get(i).productCategory == productCategory) {
                productListBy.add(productList.get(i));
            }
        }
        return productListBy;
    }

}
