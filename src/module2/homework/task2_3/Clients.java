package module2.homework.task2_3;

/**
 * The Clients class contains the bank clients' names and their account balances
 * the class has a withdraw() method which searches a client's account balance by this client's name
 * and withdraws a specified amount + 5% fee from client's account if the balance is sufficient
 *
 * @author Denys Sheptytskyi
 */
public class Clients {

    /* define static arrays with client's names and their account balances */
    private static int[] clientBalances = {1200, 250, 2000, 500, 3200};
    private static String[] clientNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private String clientName;

    Clients(String n) {
        clientName = n;
    }

    /**
     * withdraws a specified amount + 5% fee from a client's account if the account balance is sufficient
     * prints the client's name, sum of withdrawal and the account balance after withdrawal in case of success
     * prints client's name + NO in case of failure (insufficient funds) for withdrawal
     *
     * @param withdrawal
     */
    void withdraw(int withdrawal) {
        int i = 0;      //index to navigate arrays

        /* search name in clientNames and return its index
          returns "Owner not found" when index reached the end of clientNames
         */
        while (!clientName.equals(clientNames[i])) {
            i++;
            if (i == clientNames.length) {
                System.out.println(clientName + ": Name not found\n");
                return;
            }
        }

        /* if there are sufficient funds, make a withdrawal, otherwise print name + NO */
        if (withdrawal * 1.05 <= clientBalances[i]) {
            System.out.println(clientName + " " + withdrawal + " "
                               + (clientBalances[i] -= withdrawal * 1.05)); //updates the balances array
            System.out.println();
        } else {
            System.out.println(clientNames[i] + " NO\n");
        }
    }
}
