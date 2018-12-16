In this assignment we are implementing a simple phone book.

#### Exercise 94.1: Person

Start by programing the class `Person` which works as follows:

<pre class="sh_java sh_sourceCode">
public staticvoidmain(String[] args) {
    Person pekka = new Person("Pekka Mikkola", "040-123123");

    System.out.println(pekka.getName());
    System.out.println(pekka.getNumber());

    System.out.println(pekka);
    pekka.changeNumber("050-333444");
    System.out.println(pekka);
}
</pre>

The output is:

<pre>
Pekka Mikkola
040-123123
Pekka Mikkola  number: 040-123123
Pekka Mikkola  number: 050-333444

</pre>

So you have to implement the following class:

* the method `public String toString()`, which returns the string representation
        formulated as the above example shows
* constructor that sets the person name and phone number
* `public String getName()`, that returns the name
* `public String getNumber()`, that returns the phone number
* the method `public void changeNumber(String newNumber)`, that can be used to
        change the phone number of the person

#### Exercise 94.2: Adding persons to Phonebook

Program the class `Phonebook` that stores `Person`-objects using an
ArrayList. At this stage you'll need the following methods:

* `public void add(String name, String number)` creates a
        `Person`-object and adds it to the ArrayList inside the Phonebook
* `public void printAll()`, prints all the persons inside the Phonebook

With the code:

<pre class="sh_java sh_sourceCode">
public static voidmain(String[] args) {
    Phonebook phonebook = new Phonebook();

    phonebook.add("Pekka Mikkola", "040-123123");
    phonebook.add("Edsger Dijkstra", "045-456123");
    phonebook.add("Donald Knuth", "050-222333");

    phonebook.printAll();
}
</pre>

the output should be:

<pre>
Pekka Mikkola  number: 040-123123
Edsger Dijkstra  number: 045-456123
Donald Knuth  number: 050-222333

</pre>

#### Exercise 94.3: Searching for numbers from the phonebooks

Extend the class Phonebook with the method `public String searchNumber(String name)`,
that returns the phone number corresponding to the given name. If the sought person is not known
the string "number not known" is returned.

Example code:

<pre class="sh_java sh_sourceCode">
public static voidmain(String[] args) {
    Phonebook phonebook = new Phonebook();
    phonebook.add("Pekka Mikkola", "040-123123");
    phonebook.add("Edsger Dijkstra", "045-456123");
    phonebook.add("Donald Knuth", "050-222333");

    String number = phonebook.searchNumber("Pekka Mikkola");
    System.out.println( number );

    number = phonebook.searchNumber("Martti Tienari");
    System.out.println( number );
}
</pre>

output:

<pre>
040-123123
number not known
</pre>