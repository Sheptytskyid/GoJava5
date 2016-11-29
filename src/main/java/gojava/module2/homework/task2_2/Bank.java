package gojava.module2.homework.task2_2;

/**
 * The Bank class contains a withdraw() method that withdraws a certain amount of money + 5% fee
 * from a client's account if the balance is sufficient for such transaction
 *
 * @author Denys Sheptytskyi
 */
public class Bank {
    private double balance;
    private String clientName;

    public Bank(String n, double b) {
        clientName = n;
        balance = b;
    }

    /**
     * checks if the account balance is sufficient to make a withdrawal + 5% fee
     * prints client's name, OK + amount of fee + balance after withdrawal in case of success and NO in case of failure
     *
     * @param "double withdrawal"
     */
    void withdraw(double withdrawal) {
        System.out.println(clientName);
        if (withdrawal * 1.05 <= balance) {     //checks if balance is sufficient for withdrawal + fee
            System.out.println("OK " + (withdrawal * 0.05) + " " + (balance -= withdrawal * 1.05) + "\n");
        } else {
            System.out.println("NO\n");
        }
    }
}