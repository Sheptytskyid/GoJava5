package module1.practice;

public class Task1 {
    public static void main(String[] args) {
        int[] balances = {100, 5400, 4321, 900, -50, 0};
        String[] names = {"Test1", "Alexandr", "Denis", "Test2", "User", "Pasha"};
        int counter = 0;

        for (int x : balances) {
            if (x > 1000) {
                counter++;
            }
        }

        String nam[] = new String[counter];
        counter = 0;

        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                nam[counter] = names[i];
                counter++;
            }
        }
        for (String x : nam)
            System.out.println(x);
    }
}
