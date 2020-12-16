Create the class `Printer`, its constructor `public Printer(String fileName)` which receives a String standing for the file name, and the method `public void printLinesWhichContain(String word)` which prints the file lines which contain the parameter word (_lower and upper case make difference in this excercise; for instance, "test" and "Test" are not the considered the same_); the lines are printed in the same order as they are inside the file.

If the argument is an empty String, all of the file is printed.

If the file is not found, the constructor delegates the exception with no need for a try-catch statement; the constructor simply has to be defined in the following way:

<pre class="sh_java sh_sourceCode">
public Printer {

   public Printer(String fileName) throws Exception {
      // ...
   }

   // ...
}
</pre>

The file _textFile_ has been place into the default package of your project to help the tests. When you define the file name of the constructor of Printer, you have to write `src/textfile.txt`. The file contains an extract of Kalevala, a Finnish epic poem:

<pre>
Siinä vanha Väinämöinen
katseleikse käänteleikse
Niin tuli kevätkäkönen
näki koivun kasvavaksi
Miksipä on tuo jätetty
koivahainen kaatamatta
Sanoi vanha Väinämöinen
</pre>

The following example shows what the program should do:

<pre class="sh_java sh_sourceCode">
Printer printer = new Printer("src/textfile.txt");

    printer.printLinesWhichContain("Väinämöinen");
    System.out.println("-----");
    printer.printLinesWhichContain("Frank Zappa");
    System.out.println("-----");
    printer.printLinesWhichContain("");
    System.out.println("-----");
</pre>

Prints:

<pre>
Siinä vanha Väinämöinen
Sanoi vanha Väinämöinen
-----
-----
Siinä vanha Väinämöinen
katseleikse käänteleikse
Niin tuli kevätkäkönen
näki koivun kasvavaksi
Miksipä on tuo jätetty
koivahainen kaatamatta
Sanoi vanha Väinämöinen
</pre>

In the project, you also find the whole Kalevala; the file name is `src/kalevala.txt`