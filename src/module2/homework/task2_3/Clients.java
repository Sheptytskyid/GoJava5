package module2.homework.task2_3;

class Clients {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    String name;

    Clients(String n) {
        name = new String(n);
    }

    void withdrawer (int withdrawal){
        int i = 0;
        //search name in ownerNames and return its index
        //returns "Owner not found" when index reached the end of ownerNames
        while(!name.equals(ownerNames[i])) {
            i++;
            if (i == ownerNames.length) {
                System.out.println(name + ": Name not found\n");
                return;
            }
        }

        if (withdrawal * 1.05 <= balances[i]) {
            System.out.println(name + " " +
                    withdrawal + " " +
                    (balances[i] -= withdrawal * 1.05)); //updates the balances array
        System.out.println();
        } else
            System.out.println(ownerNames[i] + " NO\n");
    }
}
