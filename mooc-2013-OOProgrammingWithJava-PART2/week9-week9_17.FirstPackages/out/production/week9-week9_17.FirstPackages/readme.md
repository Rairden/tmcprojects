#### Exercise 17.1: UI Interface

Create the package `mooc` in your project. We create the functionality of our application inside this package. Add the package `ui` to your application; at this point, you should have the package `mooc.ui`. Create a new interface in it, and call it `UserInterface`.

The interface `UserInterface` has to determine the method `void update()`. 

#### Exercise 17.2: Text User Interface

Create the class `TextUserInterface` in the same package; make it implement the interface `UserInterface`. Implement the method `public void update()` which is required by the interface `UserInterface` which `TextUserInterface` implements: its only duty should be printing the string "`Updating the user interface`" with a `System.out.println` method call.

#### Exercise 17.3: Application Logic

Create now the package `mooc.logic`, and add the class `ApplicationLogic` in it. The application logic API should be the following:

* the constructor `public ApplicationLogic(UserInterface ui)`. It receives as parameter a class which implements the interface UserInterface. Note: your application logic has to see the interface and therefore to import it; in other words, the line `import mooc.ui.UserInterface` must appear at the beginning of he file  

* the method `public void execute(int howManyTimes)` prints the string "The application logic works" as many times as it is defined by its parameter variable. After each "The application logic works" printout, the code has to call the `update()` method of the object which implements the interface `UserInterface` and which was assigned to the constructor as its parameter.  

You can test your application with the following main class.

<pre class="sh_java sh_sourceCode">
import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;

public class mooc.logic.Main {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
</pre>

The program output should be the following:

<pre>
The application logic works
Updating the user interface
The application logic works
Updating the user interface
The application logic works
Updating the user interface
</pre>