
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day    = day;
        this.month  = month;
        this.year   = year;
    }

    public void advance() {
            // advance year
        if (this.day == 30 && this.month == 12) {
            this.day    = 1;
            this.month  = 1;
            this.year++;
            return;
        }   // advance month
        if (this.day == 30 && this.month < 12) {
            this.day = 1;
            this.month++;
            return;
        }   // advance day
        if (this.day < 30) {
            this.day++;
        }
    }

    public void advance(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            this.advance();
        }
    }

    // the object for which this method is called should not change!
    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);
        return newMyDate;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

}