public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0);

        myAccount.activate(); // "Account is already activated!"

        myAccount.suspend(); // "Account is suspended!"
        myAccount.activate(); // "Account is activated!"
        System.out.println(" ");
        myAccount.deposit(1000.0); // Update balance and display account info
        myAccount.withdraw(100.0); // Update balance and display account info
        System.out.println(" ");
        myAccount.close(); // "Account is closed!"
        myAccount.activate(); // "You cannot activate a closed account!"
        myAccount.suspend(); // "You cannot suspend a closed account!"
        System.out.println(" ");
        myAccount.withdraw(500.0); // "You cannot withdraw on a closed account!"
        myAccount.deposit(1000.0); // "You cannot deposit on a closed account!"
    }
}