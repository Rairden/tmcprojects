public class Main {
    /**
     * Create a class Product that represents a product sold in a webshop. A product has a price, amount and name.
     *
     * The class should have:
     * A constructor public Product(String nameAtStart, double priceAtStart, int amountAtStart)
     * A method public void printProduct() that prints a product in the following form:
     * Banana, price 1.1, amount 13
     */

    public static void main(String[] args) {
        // You can test your new class here, try e.g.:
        
         Product t = new Product("Banana", 1.1, 13);
         t.printProduct();
    }
}
