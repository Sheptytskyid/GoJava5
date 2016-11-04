package module2.homework.task2_4;

/**
 * The Clients2 class contains the bank clients' names and their account balances
 * the class has a fund() method which searches a client's account balance by this client's clientName
 * and funds a client's account with a specified amount
 *
 * @author Denys Sheptytskyi
 */
class Clients2 {

    /* define static arrays with client's names and their account balances */
    private static int[] clientBalances = {1200, 250, 2000, 500, 3200};
    private static String[] clientNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private String clientName;

    Clients2(String n) {
        clientName = n;
    }

    /**
     * funds a client's account with a specified amount
     * prints the client's name and balance after funding in case of success
     * prints "Name not found" in case of failure
     *
     * @param sum
     */
    void fund(int sum) {
        int i = 0;      // index to navigate arrays

        /*search clientName in clientNames and return its index
          prints "Name not found" when index exceeds the end of clientNames */
        while (!clientName.equals(clientNames[i])) {
            i++;
            if (i == clientNames.length) {
                System.out.println(clientName + ": Name not found\n");
                return;
            }
        }

        System.out.println(clientName + " " +
                (clientBalances[i] += sum)); //updates the balances array
        System.out.println();

    }
}
