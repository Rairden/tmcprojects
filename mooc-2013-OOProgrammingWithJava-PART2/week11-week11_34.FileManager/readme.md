Together with the exercise body, you find the class `FileManager`, which contains the method bodies to read a write a file.

#### Exercise 34.1: File Reading

Implement the method `public ArrayList<String> read(String file)` to return the lines of the parameter file in ArrayList form, each file line being a String contained by the ArrayList.

There are two text files to help testing the project: `src/testinput1.txt` and `src/testinput2.txt`. The methods are supposed to be used in the following way:

<pre class="sh_java sh_sourceCode">
public static void main(String[] args) throws FileNotFoundException, IOException {
        FileManager f = new FileManager();

        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
</pre>

The print output should look like the following

<pre>
first
second
</pre>

#### Exercise 34.2: Writing a Line

Modify the method `public void save(String file, String text)` so that it would write the string of the second argument into the file of the first argument. If the file already exists, the string is written over the old version.

#### Exercise 34.3: Writing a List

Modify the method `public void save(String file, ArrayList<String> texts)` so that it would write the strings of the second argument into the file of the first argument; each string of the array list has to go to its own line. If the file already exists, the strings are written over the old version.
