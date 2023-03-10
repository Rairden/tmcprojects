Create the support method `private static void printWithSmileys(String characterString)` for the class `Smileys` which comes with the assignment template. The method is to print the given character string surrounded with smileys. Use the character string `:)` as the smiley.

<pre class="sh_java sh_sourceCode">
printWithSmileys("\\:D/");
</pre>

<pre>
:):):):):)
:) \:D/ :)
:):):):):)

</pre>

Note, that the character string must have \\ so we can print the symbol \.

_Note!_ if the length of the character string is an odd number, add an extra space on the right side of the given character string.

<pre class="sh_java sh_sourceCode">
printWithSmileys("\\:D/");
printWithSmileys("87.");
</pre>

<pre>
:):):):):)
:) \:D/ :)
:):):):):)
:):):):):)
:) 87.  :)
:):):):):)

</pre>

It's a good idea to first think how many smileys should be printed for a character string of a certain length. The length of a character string can be found out with the method `length` which belongs to it. A loop is helpful for printing the top and bottom smiley rows, the middle row can be handled with a normal print command. You can check if a length is an odd number with the help of a remainder `characterString.length() % 2 == 1`.