package gojava.module6.homework;

import java.util.Arrays;

public class ArraysUtilsDemo {

    public static void main(String[] args) {
        int[] array = {-14, 26, 3, 1, 12, -17, 5, 8, -1, 2};
        System.out.println("Initial array:\n" + Arrays.toString(array));
        System.out.println("Reversed initial array:\n" + Arrays.toString(ArraysUtils.reverse(array)));
        System.out.println("Even elements:\n" + Arrays.toString(ArraysUtils.findEvenElements(array)));
        System.out.println("Max element: " + ArraysUtils.max(array));
        System.out.println("Min element: " + ArraysUtils.min(array));
        System.out.print("MaxPositive element: ");
        try {
            System.out.println(ArraysUtils.maxPositive(array));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sum of all elements: " + ArraysUtils.sum(array));
        System.out.println("Product of all elements: " + ArraysUtils.multiplication(array));
        System.out.print("Modulus of the first and the last element: ");
        try {
            System.out.println(ArraysUtils.modulus(array));
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero occurred");
        }
        System.out.println("Second largest element: " + ArraysUtils.secondLargest(array));
    }
}
