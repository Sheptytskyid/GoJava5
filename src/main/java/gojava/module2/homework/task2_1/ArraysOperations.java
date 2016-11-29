package gojava.module2.homework.task2_1;

import java.util.Arrays;

/**
 * contains all methods to manipulate an array and a caller which takes
 * an array as an argument, calls all methods and prints the results
 * all methods are overloaded to work with both int and double ArraysOperations
 * all methods are private may be called only by the caller within this class
 * all methods are static to work without objects
 *
 * @author Denys Sheptytskyi
 */

public class ArraysOperations {

    /**
     * takes an integer array as a parameter and performs all types
     * of calculations with it by calling other methods provided by
     * this class the results are displayed in a console
     *
     * @param "int[] array"
     */
    static void caller(int[] array) {
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
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
        System.out.println("\n\n");
    }

    /**
     * overloads static void caller(int array[])
     * takes a double array as a parameter and performs all types
     * of calculations with it by calling other methods provided by
     * this class the results are displayed in a console
     *
     * @param "double[] array"
     */
    static void caller(double[] array) {
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
        System.out.println("Max element: " + max(array));
        System.out.println("Min element: " + min(array));
        System.out.print("MaxPositive element: ");
        try {
            System.out.println(maxPositive(array));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("%s %.2f %n", "Sum of all elements:", sum(array));
        System.out.printf("%s %.2f %n", "Product of all elements: ", multiplication(array));
        System.out.print("Modulus of the first and the last element: ");
        try {
            System.out.printf("%.2f %n", modulus(array));
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero occurred");
        }
        System.out.println("Second largest element: " + secondLargest(array));
        System.out.println("\n\n");
    }

    /**
     * returns the sum of all elements in an int array
     *
     * @param "int[] array"
     * @return sum of all element of an array
     */
    private static int sum(int[] array) {
        int sum = 0;

        for (int x : array) {
            sum += x;
        }
        return sum;
    }

    /**
     * overloads private static int sum(int array[])
     * returns the sum of all elements in a double array
     *
     * @param "double[] array"
     * @return sum of all elements of an array
     */
    private static double sum(double[] array) {
        double sum = 0;

        for (double x : array) {
            sum += x;
        }
        return sum;
    }

    /**
     * returns the minimum element in an int array
     *
     * @param "int[] array"
     * @return minimum element of an array
     */
    private static int min(int[] array) {
        int min = array[0];

        for (int x : array) {
            min = x < min ? x : min;
        }
        return min;
    }

    /**
     * overloads private static int min(int array[])
     * returns the minimum element in a double array
     *
     * @param "double[] array"
     * @return minimum element of an array
     */
    private static double min(double[] array) {
        double min = array[0];

        for (double x : array) {
            min = x < min ? x : min;
        }
        return min;
    }

    /**
     * returns the maximum element in an int array
     *
     * @param "int[] array"
     * @return max element of an array
     */
    private static int max(int[] array) {
        int max = array[0];

        for (int x : array) {
            max = x > max ? x : max;
        }
        return max;
    }

    /**
     * overloads private static int max(int array[])
     * returns the maximum element in a double array
     *
     * @param "double[] array"
     * @return max element of an array
     */
    private static double max(double[] array) {
        double max = array[0];

        for (double x : array) {
            max = x > max ? x : max;
        }
        return max;
    }

    /**
     * returns the maximum positive element in an int array
     * throws an ArithmeticException if there are no positive elements
     *
     * @param "int[] array"
     * @return max positive element of an array
     */
    private static int maxPositive(int[] array) {
        int max = array[0];

        for (int x : array) {
            max = x > max ? x : max;
        }
        if (max < 0) {
            throw new ArithmeticException("Error: this array contains no positive elements");
        }
        return max;
    }

    /**
     * overloads private static int maxPositive(int array[])
     * returns the maximum positive element in a double array
     * throws an ArithmeticException if there are no positive elements
     *
     * @param "double[] array"
     * @return max positive element of an array
     */
    private static double maxPositive(double[] array) {
        double max = array[0];

        for (double x : array) {
            max = x > max ? x : max;
        }
        if (max < 0) {
            throw new ArithmeticException("Error: this array contains no positive elements");
        }
        return max;
    }

    /**
     * returns the product of all elements in an integer array
     *
     * @param "int[] array"
     * @return multiplication of all elements of an array
     */
    private static int multiplication(int[] array) {
        int mult = 1;

        for (int x : array) {
            mult *= x;
        }
        return mult;
    }

    /**
     * overloads private static int multiplication(int array[])
     * returns the product of all elements in a double array
     *
     * @param "double[] array"
     * @return multiplication of all elements of an array
     */
    private static double multiplication(double[] array) {
        double mult = 1;

        for (double x : array) {
            mult *= x;
        }
        return mult;
    }

    /**
     * returns the modulus of the first and the last element of an integer array
     * throws an ArithmeticException in case of division by zero
     *
     * @param "int[] array"
     * @return modulus of the first and the last element of an array
     */
    private static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    /**
     * overloads private static int modulus(int array[])
     * returns the modulus of the first and the last element of a double array
     * throws an ArithmeticException in case of division by zero
     *
     * @param "double[] array"
     * @return modulus of the first and the last element of an array
     */
    private static double modulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    /**
     * returns the second largest element of a double array
     *
     * @param "int[] array"
     * @return second largest element of an array
     */
    private static int secondLargest(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray[sortedArray.length - 2];     //return the second largest element in a sorted array
    }

    /**
     * overloads private static int secondLargest(int array[])
     * returns the second largest element of a double array
     *
     * @param "double[] array"
     * @return second largest element of an array
     */
    private static double secondLargest(double array[]) {
        double[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray[sortedArray.length - 2];     //return the second largest element in a sorted array
    }
}