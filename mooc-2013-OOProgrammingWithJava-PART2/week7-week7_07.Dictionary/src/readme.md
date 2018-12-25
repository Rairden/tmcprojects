In this exercise, we implement a dictionary which can be used to retrieve the English translation of Finnish words. We implement our dictionary using the `HashMap` data structure.

#### Exercise 7.1: Class Dictionary

Create a class called `Dictionary`. The class has the following methods:

* `public String translate(String word)`, returning the translation of its parameter. If the word is unknown, it returns _null_.
* `public void add(String word, String translation)`, adding a new translation to the dictionary

Implement the class Dictionary so that it contained only one object variable, a `HashMap` data structure.

Test your Dictionary:

<pre class="sh_java sh_sourceCode">
Dictionary dictionary =new Dictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("cembalo", "harpsichord");

    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("porkkana"));
</pre>

<pre>
monkey
null

</pre>

#### Exercise 7.2: Amount of Words

Add the method `public int amountOfWords()`, which returns the amount of words in the dictionary.

<pre class="sh_java sh_sourceCode">
Dictionary dictionary = new Dictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    System.out.println(dictionary.amountOfWords());

    dictionary.add("cembalo", "harpsichord");
    System.out.println(dictionary.amountOfWords());
</pre>

<pre>
2
3

</pre>

#### Exercise 7.3: Listing All Words

Add the method `public ArrayList<String> translationList()` to your dictionary, returning strings which stand for a content list of your dictionary in the form _key = value_.

<pre class="sh_java sh_sourceCode">
Dictionary dictionary =new Dictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("cembalo", "harpsichord");

    ArrayList<String> translations = dictionary.translationList();
    for(String translation: translations) {
        System.out.println(translation);
    }
</pre>

<pre>
banaani = banana
apina = monkey
cembalo = harpsichord

</pre>

**Hint:** you can go through all HashMap keys using the method `keySet` in the following way:

<pre class="sh_java sh_sourceCode">
HashMap<String, String> wordPairs = new HashMap<String, String>();

    wordPairs.put("monkey", "animal");
    wordPairs.put("South", "compass point");
    wordPairs.put("sauerkraut", "food");

    for ( String key : wordPairs.keySet() ) {
        System.out.print( key + " " );
    }

    // prints: monkey South sauerkraut
</pre>

#### Exercise 7.4: The Beginning of a Text User Interface

In this exercise, we also train creating a text user interface. Create the class `TextUserInterface`, with the following methods:

*  the constructor `public TextUserInterface(Scanner reader, Dictionary dictionary)`
* `public void start()`, which starts the interface.

The text user interface stores into two object variables the reader and dictionary it has received as constructor parameters. You don't need other object variables.
**                  The user input must be read using the reader object received as constructor parameter! The translations also have to be stored into the dicitonary object received as constructor parameter. The text user interface must not create new objects itself!
**

**Attention:** This means **The text user interface must not create a scanner itself** but it must use the scanner received as parameter to read the user input!

At the beginning, in the text user interface must only have the command `quit`, to quit the text user interface. If the user inputs something else, we print "Unknown statement".

<pre class="sh_java sh_sourceCode">
Scanner reader = new Scanner(System.in);
    Dictionary dict = new Dictionary();

    TextUserInterface ui = new TextUserInterface(reader, dict);
    ui.start();
</pre>

<pre>
Statement:
  quit - quit the text user interface

Statement: 

<font color="red">help</font>
Unknown statement

Statement: 

<font color="red">quit</font>
Cheers!

</pre>

#### Exercise 7.5: Adding and Translating Words

Add the methods `add` and `translate` to your text user interface. The command `add` asks for a word pair from the user and adds them to the dictionary. The command `translate` asks a word from the user and it prints the translation.

<pre class="sh_java sh_sourceCode">
Scanner reader = new Scanner(System.in);
    Dictionary dict = new Dictionary();

    TextUserInterface ui = new TextUserInterface(reader, dict);
    ui.start();
</pre>

<pre>
Statements:
  add - adds a word pair to the dictionary
  translate - asks a word and prints its translation
  quit - quits the text user interface

Statement: 

<font color="red">add</font>
In Finnish: 

<font color="red">porkkana</font>
Translation: 

<font color="red">carrot</font>

Statement: 

<font color="red">translate</font>
Give a word: 

<font color="red">porkkana</font>
Translation: carrot

Statement: 

<font color="red">quit</font>
Cheers!
</pre>