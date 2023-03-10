
public class Main {

    public static void main(String[] args) {

        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NOTE: new Money-object is created and reference to that
                                // is assigned to variable a.
                                // The Money object 10.00e that variable a used to hold
                                // is not referenced anymore

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        System.out.println();

        // 95.2 ################################################################
        Money d = new Money(10,0);
        Money e = new Money(3,0);
        Money f = new Money(5,0);

        System.out.println(d.less(e));  // false
        System.out.println(e.less(f));  // true
        System.out.println();

        // 95.3 ################################################################
        Money g = new Money(10,0);
        Money h = new Money(3,50);

        Money i = g.minus(h);

        System.out.println(g);  // 10.00e
        System.out.println(h);  // 3.50e
        System.out.println(i);  // 6.50e

                                // 6.50 - 10 = -3.50
        i = i.minus(g);         // NOTE: new Money-object is created and reference to that is assigned to variable c
                                // the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(g);  // 10.00e
        System.out.println(h);  // 3.50e
        System.out.println(i);  // 0.00e

    }
}