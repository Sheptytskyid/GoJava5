package module2.homework.task2_2;

class BankDemo {
    public static void main(String[] args) {
        Bank client1 = new Bank("Client1", 100.0);
        Bank client2 = new Bank("Client2", 100.0);

        client1.withdrawer(10.0);
        client2.withdrawer(99.0);
        client1.withdrawer(0.0); //another transaction to check if the balance has been updated
    }
}
