
public class Person {

    private String name;
    private String number;

    public Person() {
        this.name   = "";
        this.number = "0";
    }

    public Person(String name, String number) {
        this.name   = name;
        this.number = number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return this.getName() + " number: " + this.getNumber();
    }
}