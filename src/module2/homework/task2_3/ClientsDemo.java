package module2.homework.task2_3;

/**
 * The ClientsDemo class is used to test the functionality of the Clients class
 *
 * @author Denys Sheptytskyi
 */
public class ClientsDemo {
    public static void main(String[] args) {
        /*
         * creates 4 clients as objects of Clients class and tries to make a withdrawal
         */

        Clients person1 = new Clients("Ann");
        Clients person2 = new Clients("Oww");
        Clients person3 = new Clients("Denys");     //non-existent client name
        Clients person4 = new Clients("Lane");

        person1.withdraw(100);
        person2.withdraw(490);
        person3.withdraw(10);       //try searching for a non-existent name
        person4.withdraw(200);
    }
}
