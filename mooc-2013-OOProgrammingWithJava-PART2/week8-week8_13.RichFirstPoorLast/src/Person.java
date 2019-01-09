public class Person implements Comparable<Person> {

    private int salary;
    private String name;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person o) {
        return o.salary - this.salary;

        /*if (this.salary > o.salary) {     // this does the same thing
            return 1;
        } else if (this.salary < o.salary) {
            return -1;
        } else  // they are equal
            return 0;*/
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }
}