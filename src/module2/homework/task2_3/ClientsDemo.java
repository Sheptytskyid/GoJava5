package module2.homework.task2_3;

class ClientsDemo {
    public static void main(String[] args) {
        Clients person1 = new Clients("Ann");
        Clients person2 = new Clients("Oww");
        Clients person3 = new Clients("Denys");
        Clients person4 = new Clients("Lane");

        person1.withdrawer(100);
        person2.withdrawer(490);
        person3.withdrawer(10); //try searching for non-existent name
        person4.withdrawer(200);

    }
}
