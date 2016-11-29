package moduleTwo.homework.task2_4;

class Clients2 {

    private static int[] clientBalances = {1200, 250, 2000, 500, 3200};
    private static String[] clientNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static void fund(String clientName, double sum) {
        int clientIndex = 0;


        while (!clientName.equals(clientNames[clientIndex])) {
            clientIndex++;
            if (clientIndex == clientNames.length) {
                System.out.println(clientName + ": Name not found\n");
                return;
            }
        }


        System.out.println(clientName + " " +
                (clientBalances[clientIndex] += sum));
        System.out.println();
    }
}
