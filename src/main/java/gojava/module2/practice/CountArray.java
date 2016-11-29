package gojava.module2.practice;

import java.util.Arrays;

public class CountArray {

    static int[] array = {1, 5, 1, 6, 8, 1, 5, 2, 1, 11};

    public static void main(String[] args) {

        printNumberOfTimes(countNumberOfTimes(1));
        printNumberOfTimes(countNumberOfTimes(11));
        printNumberOfTimes(countNumberOfTimes(0));

        System.out.println(Arrays.toString(bubbleSortArray(array)));
    }

    private static int countNumberOfTimes(int item) {
        int numberOfTimes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                numberOfTimes++;
            }
        }
        return numberOfTimes;
    }

    static void printNumberOfTimes(int item) {
        if (item == 0) {
            System.out.println("NO");
        } else if (item == 1) {
            System.out.println("YES");
        } else {
            System.out.println(item);
        }
    }

    static int[] bubbleSortArray(int[] array) {
        for (int a = 1; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }
        return array;
    }
}
