Implement the method `public static printArrayAsStars(int[] array)`, which prints a
line with stars for each number in the array. The line length is determined by the number.

The program skeleton:

<pre class="sh_java sh_sourceCode">
publicclass Main{
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // code here
    }
}
</pre>

The above example should cause the following output:

<pre>
*****
*
***
****
**

</pre>

As seen the first line has 5 stars and the reason for that is that is that the first element of
the array is 5. The next line has one star since the second element of the array is 1, etc.