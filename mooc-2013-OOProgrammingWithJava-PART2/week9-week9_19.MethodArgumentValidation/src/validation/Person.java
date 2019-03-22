package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name cannot be null, empty, or longer than 40 chars");
        } else {
            this.name = name;
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be in range 0-120");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
