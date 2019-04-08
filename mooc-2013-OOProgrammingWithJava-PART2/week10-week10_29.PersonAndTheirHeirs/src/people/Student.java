package people;

public class Student extends Person {

    private int credits;

    public Student(String name, String addr) {
        super(name, addr);
        this.credits = 0;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  credits " + credits;
    }
}
