package gojava.module2.homework.task2;

public class BankDemo {
    public static void main(String[] args) {
        /*
         * creates 2 clients with specified names and account balances and tries to withdraw a certain amount by calling a
         * withdraw() method of the Bank class
         */

        Bank client1 = new Bank(100.0, "Client1");
        Bank client2 = new Bank(100.0, "Client2");

        client1.withdraw(10.0);
        client2.withdraw(99.0);
        client1.withdraw(0.0); //another zero transaction to check if the client1's balance has been updated
    }
}
