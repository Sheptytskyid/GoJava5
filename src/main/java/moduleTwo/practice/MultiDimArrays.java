package moduleTwo.practice;

import java.util.Arrays;

public class MultiDimArrays {

    public static void main(String[] args) {
        int[][] array = new int[5][];

        for (int i = 0; i < array.length; i++) {
            array[i] = createRandomArray(5);
        }

        printArray(array);

        for (int i = 0; i < array.length /2+1; i++) {
            transposeArray(array[i], array[array.length - 1 - i]);
        }
        System.out.println();
        printArray(array);

    }

    private static int[] createRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static void transposeArray(int[] array1, int[] array2) {
        if (array1 == array2) {
            for (int i = 0; i < array1.length /2; i++) {
                int t = array1[i];
                array1[i] = array2[array2.length - 1 - i];
                array2[array2.length - 1 - i] = t;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            int t = array1[i];
            array1[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = t;
        }
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}