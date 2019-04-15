package gojava.module2.homework.task2;

public class Bank {
    private double balance;
    private String clientName;

    public Bank(double balance, String clientName) {
        this.balance = balance;
        this.clientName = clientName;
    }

    void withdraw(double withdrawal) {
        System.out.println(clientName);
        if (withdrawal * 1.05 <= balance) {     //checks if balance is sufficient for withdrawal + fee
            System.out.println("OK " + (withdrawal * 0.05) + " " + (balance -= withdrawal * 1.05) + "\n");
        } else {
            System.out.println("NO\n");
        }
    }
}