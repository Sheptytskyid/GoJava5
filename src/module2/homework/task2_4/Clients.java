package module2.homework.task2_4;

class Clients {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    String name;

    Clients(String n) {
        name = new String(n);
    }

    void funder (int sum){
        int i = 0;
        //search name in ownerNames and return its index
        //returns "Owner not found" when index exceeds the end of ownerNames
        while(!name.equals(ownerNames[i])) {
            i++;
            if (i == ownerNames.length) {
                System.out.println(name + ": Name not found\n");
                return;
            }
        }

            System.out.println(name + " " +
                    (balances[i] += sum)); //updates the balances array
        System.out.println();

    }
}
