package containers;

public class ProductContainer extends Container {

    public ProductContainer() {
    }

    private String productName;

    public ProductContainer(double capacity) {
        super(capacity);
    }

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String getName() {
        return productName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
}
