In this assignment we are implementing a simple information system prototype for a library. The
prototype will have functionality for searching books by the title, publisher or publishing
year.

The main building blocks of the system are the classes `Book` and
`Library`. Objects of the class `Book` represent the information of a single
book. Object of the class `Library` holds a set of books and provides various ways to
search for the books within the library.

#### Exercise 101.1: Book

Let us start with the class Book. The class has instance variables `title` for the
book title, `publisher` for the name of the publisher, and `year`
for the publishing year. The title and the publisher are of the type String and the publishing year
is represented as an integer.

Now implement the class `Book`. The class should have the constructor `public
Book(String title, String publisher, int year)` and methods `public String
title()`, `public String publisher()`, `public int year()` and
`public String toString()`.

Example usage:

<pre class="sh_java sh_sourceCode">
Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
System.out.println(cheese.title());
System.out.println(cheese.publisher());
System.out.println(cheese.year());

System.out.println(cheese);
</pre>

The output should be:

<pre>
Cheese Problems Solved
Woodhead Publishing
2007
Cheese Problems Solved, Woodhead Publishing, 2007

</pre>

#### Exercise 101.2: Library

Implement the class `Library`, with constructor `public Library()` and
methods `public void addBook(Book newBook)` and `public void
printBooks()`

Example usage below.

<pre class="sh_java sh_sourceCode">
Library Library = new Library();

Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
Library.addBook(cheese);

Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
Library.addBook(nhl);

Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

Library.printBooks();
</pre>

The output should be:

<pre>
Cheese Problems Solved, Woodhead Publishing, 2007
NHL Hockey, Stanley Kupp, 1952
Battle Axes, Tom A. Hawk, 1851

</pre>

#### Exercise 101.3: Search functionality

Add to the class `Library` the methods `public ArrayList<Book>
searchByTitle(String title)`, `public ArrayList<Book> searchByPublisher(String
publisher)` and `public ArrayList<Book> searchByYear(int year)`. The methods
return the list of books that match the given title, publisher or year.

**Note:** you are supposed to do a method that returns an ArrayList. Use the following
skeleton as starting point:

<pre class="sh_java sh_sourceCode">
publicclass Library {
   // ...

   public ArrayList<Book> searchByTitle(String title) {
     ArrayList<Book> found = new ArrayList<Book>();

     // iterate the list of books and add all the matching books to the list found

     return found;
   }
</pre>

Note: when you do the search by a string (title or publisher), do not look for exact matches
(with the method `equals`) instead use the method `contains` of the class
`String`.

Example usage:

<pre class="sh_java sh_sourceCode">
Library Library =new Library();

Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

ArrayList<Book> result = Library.searchByTitle("Cheese");
for (Book book: result) {
    System.out.println(book);
}

System.out.println("---");
for (Book book: Library.searchByPublisher("Penguin Group  ")) {
    System.out.println(book);
}

System.out.println("---");
for (Book book: Library.searchByYear(1851)) {
    System.out.println(book);
}
</pre>

The output should be:

<pre>
Cheese Problems Solved, Woodhead Publishing, 2007
The Stinky Cheese Man and Other Fairly Stupid Tales, Penguin Group, 1992
---
---
Battle Axes, Tom A. Hawk, 1851

</pre>

#### Exercise 101.4: Improved search

There are some minor problems with the implemented search functionality. One particular problem
is that the search differentiates upper and lower case letters. In the above example the search by
title with the search term `"cheese"` produced an empty list as answer.
The example where the search term contained extra white spaces did not give the expected answer, either.
We'd like the search functionality to be case insensitive and not disturbed by the extra white
spaces at the start or at the end of the search terms. We will implement a small helper library
`StringUtils` that will then be used in the Library for the more flexible search
functionality.

Implement the class `StringUtils` with a **static** method `public
static boolean included(String word, String searched)`, which checks if the string
`searched` is contained within the string `word`. As described in the
previous paragraph, the method should be case insensitive and should not care about trailing and
ending white spaces in the string `searched`. If either of the strings is _null_,
the method should return `false`.

_Tip:_ The methods `trim` and `toUpperCase()` of the class
`String` might be helpful.

When you have completed the method, use it in the search functionality of the class
`Library`.

Use the method as follows:

<pre class="sh_java sh_sourceCode">
if(StringUtils.included(book.title(), searchedTitle)) {
    // Book found!
}
</pre>

The improved library with the example:

<pre class="sh_java sh_sourceCode">
Library Library =new Library();

Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

for (Book book: Library.searchByTitle("CHEESE")) {
    System.out.println(book);
}

System.out.println("---");
for (Book book: Library.searchByPublisher("PENGUIN  ")) {
    System.out.println(book);
}
</pre>

should output the following:

<pre>
Cheese Problems Solved, Woodhead Publishing, 2007
The Stinky Cheese Man and Other Fairly Stupid Tales, Penguin Group, 1992
---
The Stinky Cheese Man and Other Fairly Stupid Tales, Penguin Group, 1992
</pre>