public class ProductCategory {
    private String name;
    protected Integer ID;
    private static Integer LastID = 0;

    public ProductCategory() {
        this.name = null;
        this.ID = 0;
    }

    public ProductCategory(String name) {
        this.name = name;
        LastID += 1;
        this.ID = LastID;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {

        return "ID:" + this.ID + ",name:" + this.name;
    }

}