**Note1:** Your program should use only one Scanner object, i.e., it is allowed to call
`new Scanner` only once.

**Note2:** Do not save anything in static variables. The main method is executed by the tests
multiple times so the use of static variables might cause problems.

**This assignment corresponds to three assignment points.**

In this assignment you are supposed to design and implement an observation database for a bird
watcher. The database contains birds, each of which have a name and a Latin name, both Strings.
Database also tracks how many times each bird has been observed.

The program should implement the following commands:

* `Add` - adds a bird
* `Observation` - adds an observation
* `Statistics` - prints all the birds
* `Show` - prints one bird
* `Quit` - terminates the program

The program should also handle the invalid inputs (see `Turing` below).

The following is an example how the program is supposed to work:

<pre>
? 

<font color="red">Add</font>
Name: 

<font color="red">Raven</font>
Latin Name: 

<font color="red">Corvus Corvus</font>
? 

<font color="red">Add</font>
Name: 

<font color="red">Seagull</font>
Latin Name: 

<font color="red">Dorkus Dorkus</font>
? 

<font color="red">Observation</font>
What was observed:? 

<font color="red">Seagull</font>
? 

<font color="red">Observation</font>
What was observed:? 

<font color="red">Turing</font>
Is not a bird!
? 

<font color="red">Observation</font>
What was observed:? 

<font color="red">Seagull</font>
? 

<font color="red">Statistics</font>
Seagull (Dorkus Dorkus): 2 observations
Raven (Corvus Corvus): 0 observations
? 

<font color="red">Show</font>
What? 

<font color="red">Seagull</font>
Seagull (Dorkus Dorkus): 2 observations
? 

<font color="red">Quit</font>
</pre>

**Note** you may structure your program freely, it is only required that the output
of the program is as in the above example.