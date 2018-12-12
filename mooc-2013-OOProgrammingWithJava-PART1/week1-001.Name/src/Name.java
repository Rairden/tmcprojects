import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {
        // Write your program here
        // Please answer to our survey http://oo-start.mooc.fi/english_mooc_participants/new
        // It will take less than 5 minutes!
        System.out.println("What is your ddddd?");
        //System.out.println("yoooooo");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine() == true) {
            String name;
            name = sc.next();
            System.out.println("Why, hello: " + name);
        }


    }

}
