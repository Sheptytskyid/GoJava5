package gojava.module6.homework;

import java.util.Arrays;

public final class ArraysUtils {

    public static int sum(int[] array) {
        int sum = 0;

        for (int arrayElement : array) {
            sum += arrayElement;
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int arrayElement : array) {
            min = arrayElement < min ? arrayElement : min;
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int arrayElement : array) {
            max = arrayElement > max ? arrayElement : max;
        }
        return max;
    }

    public static int maxPositive(int[] array) {
        int max = array[0];

        for (int arrayElement : array) {
            max = arrayElement > max ? arrayElement : max;
        }
        if (max < 0) {
            throw new ArithmeticException("Error: this array contains no positive elements");
        }
        return max;
    }

    public static int multiplication(int[] array) {
        int mult = 1;

        for (int arrayElement : array) {
            mult *= arrayElement;
        }
        return mult;
    }

    public static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    public static int secondLargest(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray[sortedArray.length - 2];     //return the second largest element in a sorted array
    }

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[reversedArray.length - 1 - i] = array[i];
        }
        return reversedArray;
    }

    public static int[] findEvenElements(int[] array) {
        int numberOfEvenElements = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                numberOfEvenElements++;
            }
        }
        int[] arrayOfEvenElements = new int[numberOfEvenElements];
        int arrayIndex = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                arrayOfEvenElements[arrayIndex] = element;
                arrayIndex++;
            }
        }
        return arrayOfEvenElements;
    }

    static void arraysOperations(int[] array) {
        System.out.println("Initial array:\n" + Arrays.toString(array));
        System.out.println("Reversed initial array:\n" + Arrays.toString(reverse(array)));
        System.out.println("Even elements:\n" + Arrays.toString(findEvenElements(array)));
        System.out.println("Max element: " + max(array));
        System.out.println("Min element: " + min(array));
        System.out.print("MaxPositive element: ");
        try {
            System.out.println(maxPositive(array));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sum of all elements: " + sum(array));
        System.out.println("Product of all elements: " + multiplication(array));
        System.out.print("Modulus of the first and the last element: ");
        try {
            System.out.println(modulus(array));
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero occurred");
        }
        System.out.println("Second largest element: " + secondLargest(array));
    }
}