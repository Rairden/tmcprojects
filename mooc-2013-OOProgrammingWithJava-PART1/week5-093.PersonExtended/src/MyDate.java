
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
        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compareDate) {
        // If years are equal, then you cannot have 1 full year.  Missing one day.
        if (this.year == compareDate.year) { return 0; }

        // If this year > other year
        if (!this.earlier(compareDate)) {
                // HH   (high-high, high-low, etc for MM/DD)
            if (this.month >= compareDate.month && this.day > compareDate.day
            || (this.month == compareDate.month && this.day == compareDate.day)) {
                return this.year - compareDate.year;
            }   // HL
            if (this.month >= compareDate.month && this.day < compareDate.day) {
                return (this.year - compareDate.year) - 1;
            }   // LH
            if (this.month < compareDate.month && this.day > compareDate.day) {
                return (this.year - compareDate.year) - 1;
            }
        }
        // If this year < other year
        if (this.earlier(compareDate)) {
                // HH   (high-high, high-low, etc for MM/DD)
            if (compareDate.month >= this.month && compareDate.day > this.day
            || (compareDate.month == this.month && compareDate.day == this.day)) {
                return compareDate.year - this.year;
            }   // HL
            if (compareDate.month >= this.month && compareDate.day < this.day) {
                return (compareDate.year - this.year) - 1;
            }   // LH
            if (compareDate.month < this.month && compareDate.day > this.day) {
                return (compareDate.year - this.year) - 1;
            }
        }
        return 0;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
