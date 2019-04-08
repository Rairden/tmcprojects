package people;

public class Person {

    private String name;
    private String addr;

    public Person() {
    }

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return name + "\n" + "  " + addr;
    }
}
