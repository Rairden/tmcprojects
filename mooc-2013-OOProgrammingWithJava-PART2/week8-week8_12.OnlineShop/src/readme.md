Next, we create some programming components which are useful to manage an online shop.

#### Exercise 12.1: Storehouse

Create the class Storehouse with the following methods:

* `public void addProduct(String product, int price, int stock)`, adding to the storehouse a product whose price and number of stocks are the parameter values
* `public int price(String product)` returns the price of the parameter product; if the product is not available in the storehouse, the method returns -99

Inside the storehouse, the prices (and soon also the stocks) of the products have to be stored into a `Map<String, Integer>` variable! The type of the object so created can be `HashMap`, but you should use the interface `Map` for the variable type (see 40.4.2)

The next example clarifies storehouse use:

<pre class="sh_java sh_sourceCode">
Storehouse store =new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk:  " + store.price("milk"));
        System.out.println("coffee:  " + store.price("coffee"));
        System.out.println("sugar: " + store.price("sugar"));
</pre>

Prints:

<pre>
prices:
milk:  3
coffee:  5
sugar: -99

</pre>

#### Exercise 12.2: Product Stock

Store product stocks in a similar `Map<String, Integer>` variable as the one you used for their prices. Fill the Storehouse with the following methods:

* `public int stock(String product)` returns the stock of the parameter product.
* `public boolean take(String product)` decreases the stock of the parameter product by one, and it returns _true_ if the object was available in the storehouse. If the product was not in the storehouse, the method returns _false_, the product stock cannot go below zero.

An example of how to use the storehouse now:

<pre class="sh_java sh_sourceCode">
Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 1);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));
</pre>

Prints:

<pre>
stocks:
coffee:  1
sugar: 0
we take coffee true
we take coffee false
we take sugar false
stocks:
coffee:  0
sugar: 0

</pre>

#### Exercise 12.3: Listing the Products

Let's add another method to our storehouse:

* `public Set<String> products()` returns a name _set_ of the products contained in the storehouse

The method can be implemented easily. Using the Map's method `keySet`, you can get the storehouse products by asking for their prices or stocks.

An example of how to use the storehose now:

<pre class="sh_java sh_sourceCode">
Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);

        System.out.println("products:");
        for (String product : store.products()) {
            System.out.println(product);
        }
</pre>

Prints:

<pre>
products:
buttermilk
jogurt
coffee
milk

</pre>

#### Exercise 12.4: Purchase

We add _purchases_ to our shopping basket. With purchase we mean a specific number of a specific product. For instance, we can put into our shopping basket either a purchase corresponding to one bread, or a purchase corresponding to 24 coffees.

Create the class `Purchase` with the following functionality:

* a constructor `public Purchase(String product, int amount, int unitPrice)`, which creates a purchase corresponding the parameter product. The product unit amount of purchase is clarified by the parameter _amount_, and the third parameter is the _unit price_
* `public int price()`, which returns the purchase price. This is obtained by raising the unit amount by the unit price
* `public void increaseAmount()` increases by one the purchase unit amount
* `public String toString()` returns the purchase in a string form like the following

An example of how to use a purchase

<pre class="sh_java sh_sourceCode">
Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println( purchase );
        purchase.increaseAmount();
        System.out.println( purchase );
</pre>

Prints:

<pre>
the total price of a purchase containing four milks is 8
milk: 4
milk: 5

</pre>

Note: _toString_ follows the pattern _product: amount_, but the price is not reported!

#### Exercise 12.5: Shopping Basket

Finally, we can implement our shopping basket class!

The shopping basket stores its products as _Purchase objects_. The shopping basket has to have an object variable whose type is either `Map<String, Purchase>` or `List<Purchase>`. Do not create any other object variable for your shopping basket in addition to the Map or List needed to store purchases.

Attention: if you store a Purchase object in a Map helping variable, it will be useful to use the Map method values() in this and in the following exercise; with it, it's easy to go through all the stored Purchase objects.

Let's create a constructor without parameter for our shopping basket, as well as the following methods:

* `public void add(String product, int price)` adds a purchase to the shopping basket; the purchase is defined by the parameter product, and its price is the second parameter.
* `public int price()` returns the shopping basket total price

Example code of using basket

<pre class="sh_java sh_sourceCode">
ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());
</pre>

Prints:

<pre>
basket price: 10
basket price: 909

</pre>

#### Exercise 12.6: Printing out the Shopping Basket

Let's create the method `public void print()` for our shopping basket. This prints out the _Purchase_ objects which are contained by the basket. The printing order is not important. The output of the shopping basket in the previous example would be:

<pre>
butter: 1
cheese: 1
computer: 1
milk: 1

</pre>

Note that the number stands for the unit amount of the products, not for their price!

#### Exercise 12.7: Only One Purchase Object for One Product

Let's update our Shopping Basket; if the basket already contains the product which we add, we don't create a new Purchase object, but we update the Purchase object corresponding to the existing product by calling its method _increaseAmount()_.

Example:

<pre class="sh_java sh_sourceCode">
ShoppingBasket basket =new ShoppingBasket();
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("buttermilk", 2);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");
</pre>

Prints:

<pre>
milk: 1
basket price: 3

buttermilk: 1
milk: 1
basket price: 5

buttermilk: 1
milk: 2
basket price: 8

buttermilk: 1
milk: 3
basket price: 11

</pre>

This means that first, we add milk and buttermilk, creating new Purchase objects for them. When we add more milk to the basket, we don't create a new purchase object for the milk, but we update the unit amount of the purchase object representing the milk we already have in the basket.

#### Exercise 12.8: Shop

Now, all the parts of our online shop are ready. Our online shop has a storage house, which contains all products. We have got a shopping basket to manage all our customers. Whenever a customer chooses a purchase, we add it to the shopping basket if the product is available in our storage house. Meanwhile, the storage stocks are reduced by one.

Below, you find a ready-made code body for your online shop. Create the class `Shop` to your project, and copy the code below into it.

<pre class="sh_java sh_sourceCode">
import java.util.Scanner;

public class Shop{

    privateStorehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    // the method to deal with a customer in the shop
    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer:");

        for (String product : store.products()) {
            System.out.println( product );
        }

        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }

            // here, you write the code to add a product to the shopping basket, if the storehouse is not empty
            // and decreases the storehouse stocks
            // do not touch the rest of the code!

        }

        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }
}
</pre>

The following main program fills the shop storehouse and manages the customer Pekka:

<pre class="sh_java sh_sourceCode">
Storehouse store = new Storehouse();
    store.addProduct("coffee", 5, 10);
    store.addProduct("milk", 3, 20);
    store.addProduct("milkbutter", 2, 55);
    store.addProduct("bread", 7, 8);

    Shop shop = new Shop(store, new Scanner(System.in));
    shop.manage("Pekka");
</pre>

The shop is almost ready. There are comments in the method `public void manage(String customer)`, showing the part that you should implement. In that point, implement the code to check whether the object the customer wants is available in the storehouse. If so, reduce the storehouse stocks by one unit, and add the product to the shopping basket.

_Now you have done something! verkkokauppa.com!_