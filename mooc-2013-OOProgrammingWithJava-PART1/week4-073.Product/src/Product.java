public class Product {

    /**
     * A constructor public Product(String nameAtStart, double priceAtStart, int amountAtStart)
     * A method public void printProduct() that prints a product in the following form:
     * Banana, price 1.1, amount 13
     */

    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;


    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(nameAtStart + ", " + priceAtStart + ", " + amountAtStart);
    }

}
