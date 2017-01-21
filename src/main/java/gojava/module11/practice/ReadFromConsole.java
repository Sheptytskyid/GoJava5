package gojava.module11.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromConsole {

    static List<Integer> integersList = new ArrayList<>();
    static List<String> stringsList = new ArrayList<>();
    static List<Double> doublesList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input String Integer or Double (\"exit\" to exit):");
        readFromConsoleToList();
        System.out.println("Integers:");
        System.out.println(integersList);
        System.out.println("Doubles:");
        System.out.println(doublesList);
        System.out.println("Strings:");
        System.out.println(stringsList);
        scanner.close();
    }

    private static void readFromConsoleToList() {
        String inputText;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integersList.add(scanner.nextInt());
                scanner.nextLine();
            } else if (scanner.hasNextDouble()) {
                doublesList.add(scanner.nextDouble());
                scanner.nextLine();
            } else {
                inputText = scanner.nextLine();
                if (inputText.equalsIgnoreCase("exit")) {
                    return;
                }
                stringsList.add(scanner.nextLine());
            }
        }
    }
}