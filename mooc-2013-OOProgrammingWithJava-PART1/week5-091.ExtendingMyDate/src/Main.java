
public class Main {

    public static void main(String[] args) {

        MyDate d = new MyDate(30, 12, 1999);
        MyDate e = new MyDate(30, 11, 1999);
        MyDate f = new MyDate(30, 12, 2011);

        d.advance(3);
        e.advance(3);
        f.advance(500);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // 91.3
        MyDate day = new MyDate(25, 2, 2011);
        MyDate newDate = day.afterNumberOfDays(7);
        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));


    }
}