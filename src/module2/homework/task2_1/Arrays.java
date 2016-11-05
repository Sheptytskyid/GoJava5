package module2.homework.task2_1;

/**
 * contains all methods to manipulate an array and a caller which takes
 * an array as an argument, calls all methods and prints the results
 * all methods are overloaded to work with both int and double Arrays
 * all methods are private may be called only by the caller within this class
 * all methods are static to work without objects
 *
 * @author Denys Sheptytskyi
 */

public class Arrays {

    /**
     * takes an integer array as a parameter and performs all types
     * of calculations with it by calling other methods provided by
     * this class the results are displayed in a console
     *
     * @param array
     */
    static void caller(int array[]) {
        System.out.println("Initial array: ");
        for (int x : array) {
            System.out.print(x + ", ");     //prints the initial array
        }
        System.out.println("\n");

        System.out.println("Max element: " + max(array));
        System.out.println("Min element: " + min(array));
        System.out.print("MaxPositive element: ");
        try {
            System.out.println(Arrays.maxPositive(array)); // may catch an exception if no positive elements will be found
        } catch (ArithmeticException exc) {
            System.out.println("Error: this array contains no positive elements");
        }
        System.out.println("Product of all elements:" + Arrays.multiplication(array));
        System.out.print("Modulus of the first and the last element: ");
        try {
            System.out.println(Arrays.modulus(array));
        } catch (ArithmeticException exc) {
            System.out.println("Error: division by zero occurred");
        }
        System.out.println("Second largest element: " + Arrays.secondLargest(array));
        System.out.println("\n\n");
    }

    /**
     * overloads static void caller(int array[])
     * takes a double array as a parameter and performs all types
     * of calculations with it by calling other methods provided by
     * this class the results are displayed in a console
     *
     * @param array
     */
    static void caller(double array[]) {
        System.out.println("Initial array: ");
        for (double x : array) {
            System.out.print(x + ", ");     //prints the initial array
        }
        System.out.println("\n");

        System.out.println("Max element: " + max(array));
        System.out.println("Min element: " + min(array));
        System.out.print("MaxPositive element: ");
        try {
            System.out.println(Arrays.maxPositive(array)); // may catch an exception if no positive elements will be found
        } catch (ArithmeticException exc) {
            System.out.println("Error: this array contains no positive elements");
        }
        System.out.printf("%s %.2f %n", "Product of all elements: ", Arrays.multiplication(array));
        System.out.print("Modulus of the first and the last element: ");
        try {
            System.out.printf("%.2f %n", Arrays.modulus(array));
        } catch (ArithmeticException exc) {
            System.out.println("Error: division by zero occurred");
        }
        System.out.println("Second largest element: " + Arrays.secondLargest(array));
        System.out.println("\n\n");
    }

    /**
     * returns the sum of all elements in an int array
     *
     * @param array
     * @return
     */
    private static int sum(int array[]) {
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
     * @param array
     * @return
     */
    private static double sum(double array[]) {
        double sum = 0;

        for (double x : array) {
            sum += x;
        }
        return sum;
    }

    /**
     * returns the minimum element in an int array
     *
     * @param array
     * @return
     */
    private static int min(int array[]) {
        int min = array[0];

        for (int x : array) {
            min = x < min ? x : min;        //if the next element is less than min, assign it to min
        }
        return min;
    }

    /**
     * overloads private static int min(int array[])
     * returns the minimum element in a double array
     *
     * @param array
     * @return
     */
    private static double min(double array[]) {
        double min = array[0];

        for (double x : array) {
            min = x < min ? x : min;        //if the next element is less than min, assign it to min
        }
        return min;
    }

    /**
     * returns the maximum element in an int array
     *
     * @param array
     * @return
     */
    private static int max(int array[]) {
        int max = array[0];

        for (int x : array) {
            max = x > max ? x : max;        //if the next element is larger than max, assign it to max
        }
        return max;
    }

    /**
     * overloads private static int max(int array[])
     * returns the maximum element in a double array
     *
     * @param array
     * @return
     */
    private static double max(double array[]) {
        double max = array[0];

        for (double x : array) {
            max = x > max ? x : max;        //if the next element is larger than max, assign it to max
        }
        return max;
    }

    /**
     * returns the maximum positive element in an int array
     * throws an ArithmeticException if there are no positive elements
     *
     * @param array
     * @return
     */
    private static int maxPositive(int array[]) {
        int max = array[0];

        for (int x : array) {
            if (x >= 0 && x > max) {        //if the next element is positive and larger than max, assign it to max
                max = x;
            }
        }
        if (max < 0) {
            throw (new ArithmeticException()); // throw an exception if there are no positive elements
        }
        return max;
    }

    /**
     * overloads private static int maxPositive(int array[])
     * returns the maximum positive element in a double array
     * throws an ArithmeticException if there are no positive elements
     *
     * @param array
     * @return
     */
    private static double maxPositive(double array[]) {
        double max = array[0];

        for (double x : array) {
            if (x >= 0 && x > max) {        //if the next element is positive and larger than max, assign it to max
                max = x;
            }
        }
        if (max < 0) {
            throw (new ArithmeticException()); // throw an exception if there are no positive elements
        }
        return max;
    }

    /**
     * returns the product of all elements in an integer array
     *
     * @param array
     * @return
     */
    private static int multiplication(int array[]) {
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
     * @param array
     * @return
     */
    private static double multiplication(double array[]) {
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
     * @param array
     * @return
     */
    private static int modulus(int array[]) {
        return array[0] % array[array.length - 1]; // may throw an ArithmeticException if the denominator equals zero
    }

    /**
     * overloads private static int modulus(int array[])
     * returns the modulus of the first and the last element of a double array
     * throws an ArithmeticException in case of division by zero
     *
     * @param array
     * @return
     */
    private static double modulus(double array[]) {
        return array[0] % array[array.length - 1]; // may throw an ArithmeticException if the denominator equals zero
    }

    /**
     * returns the second largest element of a double array
     *
     * @param array
     * @return
     */
    private static int secondLargest(int array[]) {
        /*use bubble sort to sort an array and then return the 9th (second largest) array element
          will return the same result as a max element if the max element is not unique
          */

        for (int a = 1; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {     // if out of order, replace
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }

        return array[array.length - 2];     //return the second largest element in a sorted array
    }

    /**
     * overloads private static int secondLargest(int array[])
     * returns the second largest element of a double array
     *
     * @param array
     * @return
     */
    private static double secondLargest(double array[]) {
        /*use bubble sort to sort an array and return the 9th (second largest) array element
          will return the same result as max if the max element is not unique
         */

        for (int a = 1; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {     //if out of order, replace
                    double t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }

        return array[array.length - 2];     //return the second largest element in a sorted array
    }

}