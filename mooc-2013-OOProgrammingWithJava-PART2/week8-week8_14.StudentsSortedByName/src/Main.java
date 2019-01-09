
public class Main {

    // You find the pre-made class Student. Students have got a name. Make Student implement the
    // Comparable interface, so that the compareTo method would sort the students in alphabetic order.
    //
    // Tip: student names are Strings, the class String is Comparable itself. You can use the
    // String's compareTo method when you implement your Student class. String.compareTo gives a
    // different value to characters according to their case; because of this, String has also
    // got the method compareToIgnoreCase which, in fact, ignores the case while comparing. You
    // can use either of them, when you sort your students.

    public static void main(String[] args){
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
    }
}