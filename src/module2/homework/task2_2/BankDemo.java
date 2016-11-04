package module2.homework.task2_2;

/**
 * Class BankDemo is used to test the functionality of the Bank class
 *
 * @author Denys Sheptytskyi
 */
public class BankDemo {
    public static void main(String[] args) {
        /*
         * creates 2 clients with specified names and account balances and tries to withdraw a certain amount by calling a
         * withdraw() method of the Bank class
         */

        Bank client1 = new Bank("Client1", 100.0);
        Bank client2 = new Bank("Client2", 100.0);

        client1.withdraw(10.0);
        client2.withdraw(99.0);
        client1.withdraw(0.0); //another zero transaction to check if the client1's balance has been updated
    }
}
