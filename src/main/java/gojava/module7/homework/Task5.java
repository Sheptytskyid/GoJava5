package gojava.module7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task5 {

    public static List<Integer> integerList1 = new ArrayList<>(1000);
    public static List<String> stringList1 = new ArrayList<>(1000);
    public static List<Integer> integerList2 = new ArrayList<>(10000);
    public static List<String> stringList2 = new ArrayList<>(10000);
    public static List<Integer> integerLinkedList1;
    public static List<Integer> integerLinkedList2;
    public static List<String> stringLinkedList1;
    public static List<String> stringLinkedList2;

    public static void main(String[] args) {
        fillListsWithRandoms();
        integerLinkedList1 = new LinkedList<>(integerList1);
        integerLinkedList2 = new LinkedList<>(integerList2);
        stringLinkedList1 = new LinkedList<>(stringList1);
        stringLinkedList2 = new LinkedList<>(stringList2);

        measureTimeOfOperations(integerList1);
        measureTimeOfOperations(stringList1);
        measureTimeOfOperations(integerList2);
        measureTimeOfOperations(stringList2);

        measureTimeOfOperations(integerLinkedList1);
        measureTimeOfOperations(stringLinkedList1);
        measureTimeOfOperations(integerLinkedList2);
        measureTimeOfOperations(stringLinkedList2);
    }

    private static <T> void measureTimeOfOperations(List<T> list) {
        long startTime;
        long endTime;
        System.out.println("Performing operations with " + list.getClass().getSimpleName());
        startTime = System.nanoTime();
        list.get(499);
        endTime = System.nanoTime();
        System.out.println("Duration of getting the 500th element is: " + ((endTime - startTime)) + " nanoseconds.");
        startTime = System.nanoTime();
        list.set(499, null);
        endTime = System.nanoTime();
        System.out.println("Duration of setting the 500th element is: " + ((endTime - startTime)) + " nanoseconds.");
        startTime = System.nanoTime();
        list.remove(499);
        endTime = System.nanoTime();
        System.out.println("Duration of removing the 500th element is: " + ((endTime - startTime)) + " nanoseconds.");
        startTime = System.nanoTime();
        list.add(499, null);
        endTime = System.nanoTime();
        System.out.println("Duration of adding the 500th element is: " + ((endTime - startTime)) + " nanoseconds.");
        System.out.println();
    }

    private static void fillListsWithRandoms() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            integerList2.add(i, random.nextInt());
            stringList2.add(i, String.valueOf(random.nextInt()));
            if (i >= 1000) {
                continue;
            }
            integerList1.add(i, random.nextInt());
            stringList1.add(i, String.valueOf(random.nextInt()));
        }
    }

}
