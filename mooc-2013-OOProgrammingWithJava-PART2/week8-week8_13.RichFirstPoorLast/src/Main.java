
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    // You find the pre-made class Person. People have got name and salary information.
    // Make Person implement the `Comparable` interface, so that the `compareTo` method
    // would sort the people according to their salary -- rich first, poor last.

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Matti", 150000));
        people.add(new Person("Pekka", 3000));
        people.add(new Person("Mikko", 300));
        people.add(new Person("Arto", 10));
        people.add(new Person("Merja", 500));
        people.add(new Person("Pertti", 80));

        System.out.println(people);

        // When you have implemented the compareTo-method, remove comment below.
        Collections.sort(people);
        System.out.println(people);


    }
}

/*
[Matti 150000, Pekka 3000, Mikko 300, Arto 10, Merja 500, Pertti 80]
[Matti 150000, Pekka 3000, Merja 500, Mikko 300, Pertti 80, Arto 10]
*/
