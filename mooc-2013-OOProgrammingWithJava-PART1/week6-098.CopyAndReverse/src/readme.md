#### Exercise 98.1: Copy

Implement the method `public static int[] copy(int[] array)` that creates a copy of
the parameter. **Tip:** since you are supposed to create a copy of the parameter, the
method should create a new array where the contents of the parameter is copied.

In the following an example of the usage (note how code uses a handy helper method to print
arrays):

<pre class="sh_java sh_sourceCode">
public static voidmain(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] copied = copy(original);

    // change the copied
    copied[0] = 99;

    // print both
    System.out.println( "original: " + Arrays.toString(original));
    System.out.println( "copied: " + Arrays.toString(copied));
}
</pre>

As seen in the output, the change made to the copy does not affect the original:

<pre>
original: [1, 2, 3, 4]
copied: [99, 2, 3, 4]

</pre>

#### Exercise 98.2: Reverse copy

Implement the method `public static int[] reverseCopy(int[] array)` that creates an
array which contains the elements of the parameter but in reversed order. The parameter array must
remain the same.

E.g. if the parameter contains values _5, 6, 7_ the method returns _a new array_
that contains the values _7, 6, 5_.

In the following an example of the usage:

<pre class="sh_java sh_sourceCode">
public static voidmain(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
}
</pre>

The output should reveal that the parameter remains intact:

<pre>
original: [1, 2, 3, 4]
reversed: [4, 3, 2, 1]
</pre>