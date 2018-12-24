In this assignment, we make a simple calculator, similar to the one made in the material of programming basics' week 1. This time however, we pay attention to the structure of the program. Especially we will make the _main_-method (the main program) very light. The main program method doesn't actually do anything else than just start the program:

<pre class="sh_java sh_sourceCode">
publicclass Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
</pre>

What the main program here does is it just creates the object that implements the actual application logic and then starts it. This is the proper way of creating programs and from now on we'll try to achieve this structure.

#### Exercise 3.1: Reader

In order to communicate with the user, the calculator needs a Scanner-object. As we've seen, reading integers with a Scanner is a little laborious. We now create a separate class `Reader` that encapsulates a Scanner-object.

Implement the class `Reader` and add the following methods to it

* `public String readString()`
* `public int readInteger()`

Within the Reader there should be a Scanner-object as an instance variable, which the methods use in the old familiar way we know from programming basics. Remember that when reading integers, it's good to first read the entire line and then turn that in to an integer. Here we can utilize the method `parseInt` of the `Integer`-class.

#### Exercise 3.2: Application body

The calculator works like this:

<pre>
command: 

<font color="red">sum</font>
value1: 

<font color="red">4</font>
value2: 

<font color="red">6</font>
sum of the values 10

command: 

<font color="red">product</font>
value1: 

<font color="red">3</font>
value2: 

<font color="red">2</font>
product of the values 6

command: 

<font color="red">end</font>
</pre>

Implement the class `Calculator` to take care of the application logic of your program, and for that class a method `public void start()` which looks exactly like this:

<pre class="sh_java sh_sourceCode">
public void start() {while(true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
</pre>

The calculator has the operations `sum, difference, product`.

Finish the bodies for the methods `sum`, `difference`, `product` and `stasistics`. All of them are to be of the type `private void` which means that the methods are available only for internal use in the calculator.

Add an instance variable of the type `Reader` for the calculator and create the reader in the constructor. _The calculator may not have a separate Scanner-type variable!_

#### Exercise 3.3: Implementation of the application logic

Now implement the methods `sum`, `difference` and `product` so that they work according to the example above. In the example, first a command is asked from the user and then two values. The desired operation is then executed and the value of the operation is printed. Notice that asking the user for the values happens within the methods `sum`, `difference` and `product`! The methods use the Reader-object to ask the values, so the body of the methods is as follows:

<pre class="sh_java sh_sourceCode">
privatevoidsum() {
       System.out.print("value1: ");
       int value1 = // read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = // read the value using the Reader-object
       // print the value according to the example above
    }
</pre>

#### Exercise 3.4: Statistics

After the `while`-loop in the `start`-method, the method `statistics` is called. The method is meant to print the amount of operations done with the Calculator-object:

<pre>
command: 

<font color="red">sum</font>
value1: 

<font color="red">4</font>
value2: 

<font color="red">6</font>
sum of the values 10

command: 

<font color="red">product</font>
luku1: 

<font color="red">3</font>
luku2: 

<font color="red">2</font>
product of the values 6

command: 

<font color="red">end</font>
Calculations done 2

</pre>

Implement the method `private void statistics()`, and make the required changes to the code of the Calculator-class in order to collect the statistics.

Note: if an invalid command is given to the program (something other than sum, difference, product or end), the calculator will not react to the command in any way, but instead continues by asking the next command. Statistics is not to count an invalid command as a completed calculation.

<pre>
command: 

<font color="red">integral</font>
command: 

<font color="red">difference</font>
value1: 

<font color="red">3</font>
value2: 

<font color="red">2</font>
difference of the values 1

command: 

<font color="red">end</font>
Calculations done 1

</pre>

**Bonus assignment (not tested):** Reading the user input is repeated in the same way in all three operation implementing methods. Remove the repetition from your code with the help of a support method. The method can return the two values asked from the user in an array, for example.