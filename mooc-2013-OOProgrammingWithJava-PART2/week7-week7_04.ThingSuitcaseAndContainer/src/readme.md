In these exercises, we create the classes `Thing`, `Suitcase`, and `Container`, and we train to use objects which contain other objects.

#### Exercise 4.1: Class Thing

Create the class `Thing` whose objects can represent different kinds of things. The information to store are the thing's name and weight (kg).

Add the following methods to your class:

* A construsctor, which is given the thing's name and weight as parameter
* `public String getName()`, which returns the thing's name
* `public int getWeight()`, which returns the thing's weight
* `public String toString()`, which returns a string in the form "name (weight kg)"

Below, you find an example of how to use the class:

<pre class="sh_java sh_sourceCode">
publicclass Main {
    publicstatic void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Mobile: " + mobile);
    }
}
</pre>

The program output should look like the following:

<pre>
Book name: Happiness in Three Steps
Book weight: 2
Book: Happiness in Three Steps (2 kg)
Mobile: Nokia 3210 (1 kg)

</pre>

#### Exercise 4.2: Class Suitcase

Create the class `Suitcase`. `Suitcase` has `things` and a maximum weight limit, which defines the greatest total allowed weight of the things contained within the `Suitcase` object.

Add the following methods to your class:

*  A constructor, which is given a maximum weight limit
* `public void addThing(Thing thing)`, which adds the `thing` in the parameter to your suitcase. The method does not return any value.
* `public String toString()`, which returns a string in the form "x things (y kg)"

The `things` are saved into an `ArrayList` object:

<pre class="sh_java sh_sourceCode">
ArrayList<Thing> things = new ArrayList<Thing>();
</pre>

The class `Suitcase` has to make sure the thing's weight does not cause the total weight to exceed the maximum weight limit. The method `addThing` should not add a new thing if the total weight happens to exceed the maximum weight limit.

Below, you find an example of how the class can be used:

<pre class="sh_java sh_sourceCode">
publicclass Main {
    publicstatic voidmain(String[] args) {
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }
}
</pre>

The program output should look like the following:

<pre>
0 things (0 kg)
1 things (2 kg)
2 things (3 kg)
2 things (3 kg)

</pre>

#### Exercise 4.3: Language Check

"0 things" or "1 things" is not really proper English ??? it would be better to say "empty" or "1 thing". Implement this change in the class `Suitcase`.

Now, the output of the previous program should look like the following:

<pre>
empty (0 kg)
1 thing (2 kg)
2 things (3 kg)
2 things (3 kg)

</pre>

#### Exercise 4.4: Every Thing

Add the following methods to `Suitcase`:

* `printThings`, which prints out all the `things` inside the suitcase
* `totalWeight`, which returns the total weight of the `things` in your suitcase

Below, there is an example of how the class can be used:

<pre class="sh_java sh_sourceCode">
publicclass Main {
    publicstaticvoidmain(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        System.out.println("Your suitcase contains the following things:");
        suitcase.printThings();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
    }
}
</pre>

The program output should now look like the following:

<pre>
Your suitcase contains the following things:
Happiness in Three Steps (2 kg)
Nokia 3210 (1 kg)
Brick (4 kg)
Total weight: 7 kg

</pre>

Modify your class also so that you use only two object variables. One contains the maximum weight, the other is a list with the things in your suitcase.

#### Exercise 4.5: The heaviest Thing

Now, add the method `heaviestThing` to your class `Suitcase`, which returns the thing which weighs the most. If there are more than one `thing` with the same weight, the method can return either one. The method has to return an object reference. If the suitcase is empty, the method returns _null_.

Here is an usage example of the class:

<pre class="sh_java sh_sourceCode">
publicclass Main {
    publicstatic void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }
}
</pre>

The program output should look like the following:

<pre>
The heaviest thing: Brick (4 kg)

</pre>

#### Exercise 4.6: Container

Create the class `Container`, which has the following methods:

*  a constructor which is given the maximum weight limit
* `public void addSuitcase(Suitcase suitcase)`, which adds the suitcase as a parameter to the container
* `public String toString()` which returns a string in the form "x suitcases (y kg)"

Store the suitcase with a suitable `ArrayList` construction.

The class `Container` has to make sure the `thing`'s total weight does not overcome the maximum weight limitation. The method `addSuitcase` should not add a new suitcase if the total weight happens to exceed the maximum weight limit.

Below, there is an example of how the class can be used:

<pre class="sh_java sh_sourceCode">
publicclass Main {
    publicstatic voidmain(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);
    }
}
</pre>

The program output should look like the following:

<pre>
2 suitcases (7 kg)

</pre>

#### Exercise 4.7: The Container Contents

Add the method `public void printThings()` to your `Container`; the method prints out all the things inside the container's suitcases.

Below is an example of how the class can be used:

<pre class="sh_java sh_sourceCode">
publicclass Main {
    publicstatic voidmain(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println("There are the following things in the container suitcases:");
        container.printThings();
    }
}
</pre>

The program output should look like the following:

<pre>
There are the following things in the container suitcases:
Happiness in Three Steps (2 kg)
Nokia 3210 (1 kg)
Brick (4 kg)

</pre>

#### Exercise 4.8: A Lot of Bricks

Let's check that our container works fine and we can still not exceed the maximum weight limit. In the `Main` class, create the method `public static void addSuitcasesFullOfBricks(Container container)`, which adds 100 suitcases into the container it receives as parameter; there is one brick in each suitcase. The bricks weight will then increase by one each time until the weight becomes 100 kg.

The program body is the following:

<pre class="sh_java sh_sourceCode">
publicclass Main{
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
    }
}
</pre>

The program output should look like the following:

<pre>
44 suitcases (990 kg)
</pre>