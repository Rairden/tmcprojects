import java.util.Scanner;

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

        basket.print();

        printLine();    // -------------------------------------

        ShoppingBasket basket2 = new ShoppingBasket();
        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("buttermilk", 2);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        printLine();    // -------------------------------------

        Storehouse store4 = new Storehouse();
        store4.addProduct("coffee", 5, 10);
        store4.addProduct("milk", 3, 3);
        store4.addProduct("milkbutter", 2, 55);
        store4.addProduct("bread", 7, 8);

        String input = "milk\n" + "milk\n" + "milk\n" + "milk\n" + "bread\n" + "\n";

        Shop shop = new Shop(store4, new Scanner(System.in));
        shop.manage("Pekka");


    }

    private static void printLine() {
        System.out.println("--------------------------------------------");
    }

}

/*
prices:
milk:  3
coffee:  5
sugar: -99
--------------------------------------------
stocks:
coffee:  1
sugar: 0
we take a coffee true
we take a coffee false
we take sugar false
stocks:
coffee:  0
sugar: 0
--------------------------------------------
products:
yogurt
coffee
milk
buttermilk
--------------------------------------------
the total price of a purchase containing four milks is 8
milk: 4
milk: 5
--------------------------------------------
basket price: 10
basket price: 909
--------------------------------------------
computer: 1
milk: 1
buttermilk: 1
cheese: 1
--------------------------------------------
milk: 1
basket price: 3

milk: 1
buttermilk: 1
basket price: 5

milk: 2
buttermilk: 1
basket price: 8

milk: 3
buttermilk: 1
basket price: 11

--------------------------------------------
Welcome to our shop Pekka
below is our sale offer:
bread
coffee
milk
milkbutter
what do you want to buy (press enter to pay): milk
what do you want to buy (press enter to pay): milk
what do you want to buy (press enter to pay): milk
what do you want to buy (press enter to pay): milk
what do you want to buy (press enter to pay): coffee
what do you want to buy (press enter to pay): coffee
what do you want to buy (press enter to pay): bread
what do you want to buy (press enter to pay):
your purchases are:
bread: 1
coffee: 2
milk: 3
basket price: 26

Process finished with exit code 0
*/
