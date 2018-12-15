
public class Main {

    public static void main(String[] args) {

        MyDate first    = new MyDate(24, 12, 2009);
        MyDate second   = new MyDate(1, 1, 2011);
        MyDate third    = new MyDate(25, 12, 2010);

        System.out.println(first + " and " + second + " difference in years: " + second.differenceInYears(first) );
        System.out.println(second + " and " + first + " difference in years: " + first.differenceInYears(second) );
        System.out.println(first + " and " + third + " difference in years: " + third.differenceInYears(first) );
        System.out.println(third + " and " + first + " difference in years: " + first.differenceInYears(third) );
        System.out.println(third + " and " + second + " difference in years: " + second.differenceInYears(third) );
        System.out.println(second + " and " + third + " difference in years: " + third.differenceInYears(second) );

/*
        24.12.2009  and 1.1.2011    difference in years: 1
        1.1.2011    and 24.12.2009  difference in years: 1
        24.12.2009  and 25.12.2010  difference in years: 1
        25.12.2010  and 24.12.2009  difference in years: 1
        1.1.2011    and 25.12.2010  difference in years: 0
        25.12.2010  and 1.1.2011    difference in years: 0
*/

        /*
        ## HH
        12/28/2001
        11/27/2000

        ## HL
        12/2/2001
        11/28/2000

        ## LH
        11/28/2001
        12/2/2000

        ## LL
        11/27/2001
        12/28/2000
        */
    }
}
