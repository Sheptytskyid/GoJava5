package module2.homework.task2_2;

class Bank {
    double balance;
    String name;

    Bank (String n, double b) {
        name = new String(n);
        balance = b;
    }

    void withdrawer(double withdrawal){
        System.out.println(name);
        if(withdrawal * 1.05 <= balance)
            System.out.println("OK " + (withdrawal * 0.05) + " " + (balance -= withdrawal * 1.05) + "\n"); // prints and updates the balance
        else
            System.out.println("NO\n");
    }
}