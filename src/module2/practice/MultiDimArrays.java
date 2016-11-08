package module2.practice;

import java.util.Arrays;

public class MultiDimArrays {

    public static void main(String[] args) {
        int[][] array = new int[5][];

        for (int i = 0; i < array.length; i++) {
            array[i] = createRandomArray(5);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static int[] createRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}