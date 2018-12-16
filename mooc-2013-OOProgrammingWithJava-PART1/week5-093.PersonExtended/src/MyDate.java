
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day    = day;
        this.month  = month;
        this.year   = year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        if (this.year == compared.year
                && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        // if two dates are equivalent, return false.
        return false;
    }

    // copy exercise #92 differenceInYears() I made.
    public int differenceInYears(MyDate compareDate) {
        // If years are equal, then you cannot have 1 full year.  Missing one day (364).
        if (this.year == compareDate.year) { return 0; }

        // If this year > other year
        if (!this.earlier(compareDate)) {
            if (this.month >= compareDate.month && this.day >= compareDate.day) {
                return this.year - compareDate.year;
            } else {
                return this.year - compareDate.year - 1;
            }
        }
        // If this year < other year
        if (this.earlier(compareDate)) {
            if (compareDate.month >= this.month && compareDate.day >= this.day) {
                return compareDate.year - this.year;
            } else {
                return compareDate.year - this.year - 1;
            }
        }
        return -1;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}