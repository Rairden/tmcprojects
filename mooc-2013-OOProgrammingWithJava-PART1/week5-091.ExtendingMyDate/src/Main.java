
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


    }
}