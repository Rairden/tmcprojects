import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int day, int month, int year) {
        this.name       = name;
        this.birthday   = new MyDate(day, month, year);
    }
    
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int dd = Calendar.getInstance().get(Calendar.DATE);
        int mm = Calendar.getInstance().get(Calendar.MONTH);    // January is 0 so we add one
        int yy = Calendar.getInstance().get(Calendar.YEAR);
        mm++;                                                   // +1 to month

        MyDate today = new MyDate(dd, mm, yy);

        return today.differenceInYears(birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays



        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
