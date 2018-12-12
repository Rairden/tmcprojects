import java.util.Scanner;
// https://materiaalit.github.io/2013-oo-programming/part1/week-4/

public class Accounts {
    //Create a program that creates an account with the balance of 100.0, deposits 20.0 and prints the account.

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account erik = new Account("Erik", 100);
        erik.deposit(20);
        System.out.println(erik.toString());
    }

}