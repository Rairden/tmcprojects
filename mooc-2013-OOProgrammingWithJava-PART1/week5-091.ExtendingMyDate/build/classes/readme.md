#### Exercise 91.1: Next day

Add to the class MyDate the method `public void advance()` that advances the date by
one. **Note:** In this assignment we assume that all the months have 30 days!

#### Exercise 91.2: Advancing many days

Add also overloaded version `public void advance(int numberOfDays)`. This method
should advance the day by the number given as parameter. Implement this method so that it calls the
method `advance()` that was defined in the previous part of the assignment, e.g. the
call `advance(5)` should call `advance()` 5 times. Again assume that all the
months have 30 days!

#### Exercise 91.3: Creation of a new date

Add to the class `MyDate` the method `MyDate afterNumberOfDays(int days)`,
that returns a **new** `MyDate`-object that has the date which equals the
date of the object for which the method was called advance by the parameter of the method
`days`. Again assume that all the months have 30 days!

Note that the object for which this method is called should not change!

Since the method creates a **new object**, the skeleton is of the form:

<pre class="sh_java sh_sourceCode">
public MyDate afterNumberOfDays(int days){
    MyDate newMyDate = new MyDate( ... );

    // some code here

    return newMyDate;
}
</pre>

The following code

<pre class="sh_java sh_sourceCode">
public static void main(String[] args) {
    MyDate day = new MyDate(25, 2, 2011);
    MyDate newDate = day.afterNumberOfDays(7);
    for (int i = 1; i <= 7; ++i) {
        System.out.println("Friday after  " + i + " weeks is " + newDate);
        newDate = newDate.afterNumberOfDays(7);
    }
    System.out.println("This week's Friday is " + day);
    System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));
}
</pre>

should print:

<pre>
Friday after  1 weeks is 2.3.2011
Friday after  2 weeks is 9.3.2011
Friday after  3 weeks is 16.3.2011
Friday after  4 weeks is 23.3.2011
Friday after  5 weeks is 30.3.2011
Friday after  6 weeks is 7.4.2011
Friday after  7 weeks is 14.4.2011
This week's Friday is 25.2.2011
The date 790 days from this week's Friday is  5.5.2013
</pre>