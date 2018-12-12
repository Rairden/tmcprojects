
public class Accounts {
    /**
     * creates an account named "Matt's account" with the balance of 1000
     * Creates an account named "My account" with the balance of 0
     * Withdraws 100.0 from Matt's account
     * Deposits 100.0 to My account
     * Prints both accounts
     */

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account $0001 = new Account("Matt's account", 1000);
        Account $0002 = new Account("My account", 0);

        $0001.withdrawal(100);
        $0002.deposit(100);

        System.out.println($0001.toString());
        System.out.println($0002.toString());

    }

}
