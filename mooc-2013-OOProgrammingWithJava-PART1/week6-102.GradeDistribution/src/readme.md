**This assignment corresponds to three assignment points.**

**Note1:** Your program should use only one Scanner object, i.e., it is allowed to call
`new Scanner` only once. If you need scanner in multiple places, you can pass it as
parameter:

<pre class="sh_java sh_sourceCode">
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // ...

    doSomething(scanner);
}

public static void doSomething(Scanner scanner) {
    String riw = scanner.nextLine();
    // ...
}
</pre>

If another object needs a scanner, you can pass it as constructor parameter and save in
instance variable.

**Note2:** Do not save anything in static variables. The main method is executed by the tests
multiple times so the use of static variables might cause problems.

The input of the program is a set of exam scores of a course. Each score is an integer. When -1
is entered, the program stops asking for further input.

Inputting the exam scores should work as follows:

<pre>
Type exam scores, -1 completes:

<font color="red">34</font>

<font color="red">41</font>

<font color="red">53</font>

<font color="red">36</font>

<font color="red">55</font>

<font color="red">27</font>

<font color="red">43</font>

<font color="red">40</font>

<font color="red">-1</font>
</pre>

After the scores have been read, the program prints the grade distribution and acceptance
percentage of the course in the following form:

<pre>
Grade distribution:
5: **
4:
3: ***
2: *
1: *
0: *
Acceptance percentage: 87.5

</pre>

Grade distribution is formed as follows:

* Each exam score is mapped to a grade using the same formula as in exercise 18. If the
        score is not within the range 0-60 it is not taken into account.
* The number of grades are printed as stars, e.g. if there are 2 scores that correspond to grade
        5, the line _5: **_ is printed. If there are no scores that correspond to a particular
        grade, as is the case with grade 4 in the above example, the printed line is _4:_

All the grades besides zeros are accepted, so in the above 7 out of 8 participants were
accepted. Acceptance percentage is calculated with the formula _100*accepted/allScores_.
