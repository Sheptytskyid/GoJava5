package gojava.module2.homework.task2_3;

public class Clients {

    private static int[] clientBalances = {1200, 250, 2000, 500, 3200};
    private static String[] clientNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    public static void withdraw(String clientName, double withdrawal) {
        int clientIndex = 0;


        while (!clientName.equals(clientNames[clientIndex])) {
            clientIndex++;
            if (clientIndex == clientNames.length) {
                System.out.println(clientName + ": Name not found\n");
                return;
            }
        }


        if (withdrawal * 1.05 <= clientBalances[clientIndex]) {

            System.out.println(clientName + " " + withdrawal + " "
                               + (clientBalances[clientIndex] -= withdrawal * 1.05));
            System.out.println();
        } else {
            System.out.println(clientNames[clientIndex] + " NO\n");
        }
    }
}
