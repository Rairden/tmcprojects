
public class Person {

    public String name;
    public String number;

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
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + "  " + number + ": ";
    }
}
