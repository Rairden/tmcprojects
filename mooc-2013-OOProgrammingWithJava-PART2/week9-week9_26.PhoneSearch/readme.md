**Attention: you can create only one Scanner object so that your tests would work well. Also, do not use static variables, the tests execute your program many different times, and the static variable values left from the previous execution would possibly disturb them!**

Let's create an application to manage people phone numbers and addresses.

The exercise can be worth 1-5 points. To receive one point, you should implement the following functionality:

* 1 adding a phone number to the relative person
* 2 phone number search by person

to receive two points we also require

* 3 name search by phone number

to receive three points also

* 4 adding an address to the relative person
* 5 personal information search (search for a person's address and phone number)

if you want to receive four points, also implement

* 6 removing a person's information

and to receive all the points:

* 7 filtered search by keyword (retrieving a list which must be sorted by name in alphabetic order), the keyword can appear in the name or address

An example of how the program works:

<pre>
phone search
available operations:
 1 add a number
 2 search for a number
 3 search for a person by phone number
 4 add an address
 5 search for personal information
 6 delete personal information
 7 filtered listing
 x quit

command: <font color="red">1</font>
whose number: <font color="red">pekka</font>
number: <font color="red">040-123456</font>

command: <font color="red">2</font>
whose number: <font color="red">jukka</font>
  not found

command: <font color="red">2</font>
whose number: <font color="red">pekka</font>
 <font color="red">040-123456</font>

command: <font color="red">1</font>
whose number: <font color="red">pekka</font>
number: <font color="red">09-222333</font>

command: <font color="red">2</font>
whose number: <font color="red">pekka</font>
 040-123456
 09-222333

command: <font color="red">3</font>
number: <font color="red">02-444123</font>
  not found

command: <font color="red">3</font>
number: <font color="red">09-222333</font>
 pekka

command: <font color="red">5</font>
whose information: <font color="red">pekka</font>
  address unknown
  phone numbers:
   040-123456
   09-222333

command: <font color="red">4</font>
whose address: <font color="red">pekka</font>
street: <font color="red">ida ekmanintie</font>
city: <font color="red">helsinki</font>

command: <font color="red">5</font>
whose information: <font color="red">pekka</font>
  address: ida ekmanintie helsinki
  phone numbers:
   040-123456
   09-222333

command: <font color="red">4</font>
whose address: <font color="red">jukka</font>
street: <font color="red">korsontie</font>
city: <font color="red">vantaa</font>

command: <font color="red">5</font>
whose information: <font color="red">jukka</font>
  address: korsontie vantaa
  phone number not found

command: <font color="red">7</font>
keyword (if empty, all listed): <font color="red">kk</font>

 jukka
  address: korsontie vantaa
  phone number not found

 pekka
  address: ida ekmanintie helsinki
  phone numbers:
   040-123456
   09-222333

command: <font color="red">7</font>
keyword (if empty, all listed): <font color="red">vantaa</font>

 jukka
  address: korsontie vantaa
  phone number not found

command: <font color="red">7</font>
keyword (if empty, all listed): <font color="red">seppo</font>
 keyword not found

command: <font color="red">6</font>
whose information: <font color="red">jukka</font>

command: <font color="red">5</font>
whose information: <font color="red">jukka</font>
  not found

command: <font color="red">x</font>
</pre>

Some remarks:

* Because of the tests, it is essential that the _user interface_ works exactly as in the example above. The application can optionally decide in which way invalid inputs are handled. The tests contain only valid inputs.
* _**The program has to start when the main method is executed; you can only create one Scanner object.**_
* Do not use static variables, the tests execute your program many different times, and the static variable values left from the previous execution would possibly disturb them!
* In order to make things easier, we assume the name is a single string; if we want to print our lists sorted by surname in alphabetic order, the name has to be given in the form _surname name_.
* A person can have more than one phone number and address. However, these are not necessarily stored.
* If a person is deleted, no search should retrieve them.
