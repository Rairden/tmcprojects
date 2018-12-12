
public class Accounts {
    /**
     * In the above program, you made a money transfer from one person to another. Let us next create a method that
     * does the same!
     *
     * Create the method public static void transfer(Account from, Account to, double howMuch) in the given program
     * body. The method transfers money from one account to another. You do not need to check that the from account
     * has enough balance.
     *
     * After completing the above, make sure that your main method does the following:
     *
     * Creates an account "A" with the balance of 100.0
     * Creates an account "B" with the balance of 0.0
     * Creates an account "C" with the balance of 0.0
     * Transfers 50.0 from account A to account B
     * Transfers 25.0 from account B to account C
     */

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        transfer(a, b, 50);
        transfer(b, c, 25);
    }

}