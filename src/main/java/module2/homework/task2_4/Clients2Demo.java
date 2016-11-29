package module2.homework.task2_4;

class Clients2Demo {

    public static void main(String[] args) {

        Clients2.fund("Ann", 100);
        Clients2.fund("Lane",490);
        Clients2.fund("Noname", 10);
        Clients2.fund("Ann", 0); // confirms that the balances have been updated
    }
}
