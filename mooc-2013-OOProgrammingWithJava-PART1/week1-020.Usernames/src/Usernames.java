import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {

        String USER1 = "alex";
        String USER2 = "emily";
        String PW1 = "mightyducks";
        String PW2 = "cat";

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String user1 = reader.nextLine();

        System.out.println("Type your password: ");
        String pass1 = reader.nextLine();

        if (USER1.equals(user1) && PW1.equals(pass1))
            System.out.println("You are now logged into the system!");
        else if (USER2.equals(user1) && PW2.equals(pass1))
            System.out.println("You are now logged into the system!");
        else
            System.out.println("Your username or password was invalid!");


    }
}

//    The program should check for the username and password as follows:
//
//        Type your username: alex
//        Type your password: mightyducks
//        You are now logged into the system!

//Note: Remember that you cannot compare strings with the == operation!