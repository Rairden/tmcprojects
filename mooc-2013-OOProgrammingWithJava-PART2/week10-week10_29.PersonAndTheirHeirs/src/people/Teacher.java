package people;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String addr, int salary) {
        super(name, addr);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + salary + " euros/month";
    }
}
