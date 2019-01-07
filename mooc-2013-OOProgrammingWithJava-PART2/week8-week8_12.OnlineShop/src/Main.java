
public class Main {

    public static void main(String[] args) {

        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk:  " + store.price("milk"));
        System.out.println("coffee:  " + store.price("coffee"));
        System.out.println("sugar: " + store.price("sugar"));

        printLine();    // -------------------------------------

        Storehouse store2 = new Storehouse();
        store2.addProduct("coffee", 5, 1);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store2.stock("coffee"));
        System.out.println("sugar: " + store2.stock("sugar"));

        System.out.println("we take a coffee " + store2.take("coffee"));
        System.out.println("we take a coffee " + store2.take("coffee"));
        System.out.println("we take sugar " + store2.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store2.stock("coffee"));
        System.out.println("sugar: " + store2.stock("sugar"));

        printLine();    // -------------------------------------

        Storehouse store3 = new Storehouse();
        store3.addProduct("milk", 3, 10);
        store3.addProduct("coffee", 5, 6);
        store3.addProduct("buttermilk", 2, 20);
        store3.addProduct("yogurt", 2, 20);

        System.out.println("products:");
        for (String product : store3.products()) {
            System.out.println(product);
        }

        printLine();    // -------------------------------------

        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println("the total price of a purchase containing four milks is " + purchase.price());
        System.out.println(purchase);
        purchase.increaseAmount();
        System.out.println(purchase);

        printLine();    // -------------------------------------

        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());

        printLine();    // -------------------------------------




    }


    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}