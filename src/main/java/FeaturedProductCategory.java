import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {
    private Date expirationDate;

    public FeaturedProductCategory(String name, Date expirationDate) {
        super(name);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":ID:" + this.ID.toString() + ",name:" + this.getName() + ",expirationDate:" + expirationDate.toString();
    }
}