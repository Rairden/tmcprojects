In the exercise layout, you find the premade interface `NationalService`, which contains the following operations:

*  the method `int getDaysLeft()` which returns the number of days left on service
*  the method `void work()`, which reduces the working days by one. The working days number can not become negative.

<pre class="sh_java sh_sourceCode">
public interface NationalService {
    int getDaysLeft();
    void work();
}
</pre>

#### Exercise 10.1: CivilService

Create the class `CivilService` which implements your `NationalService` interface. The class constructor is without parameter. The class has the object variable daysLeft which is initialised in the constructor receiving the value 362.

#### Exercise 10.2: MilitaryService

Create the class `MilitaryService` which implements your `NationalService` interface. The class constructor has one parameter, defining the days of service (`int daysLeft`).