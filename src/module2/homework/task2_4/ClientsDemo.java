package module2.homework.task2_4;

class ClientsDemo {
    public static void main(String[] args) {
        Clients person1 = new Clients("Ann");
        Clients person2 = new Clients("Oww");
        Clients person3 = new Clients("Denys");

        person1.funder(100);
        person2.funder(490);
        person3.funder(10); //try search
        person1.funder(0); // confirms that the balances have been updated
    }
}
