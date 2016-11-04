package module2.homework.task2_4;

/**
 * The Clients2Demo class is used to test the functionality of the Clients2 class
 *
 * @author Denys Sheptytskyi
 */
class Clients2Demo {
    public static void main(String[] args) {
        /*
         * creates 3 clients as objects of Clients2 class and tries to fund their accounts
         */
        Clients2 person1 = new Clients2("Ann");
        Clients2 person2 = new Clients2("Oww");
        Clients2 person3 = new Clients2("Denys");       // non-existent client name

        person1.fund(100);
        person2.fund(490);
        person3.fund(10); //try search
        person1.fund(0); // confirms that the balances have been updated
    }
}
