package module2.homework.task2_1;

/**
 * Class ArraysDemo tests the functionality of the Arrays class by creating several arrays and passing them to
 * the caller() method of Arrays class
 *
 * @author Denys Sheptytskyi
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int arrayInt1[] = {-14, 26, 0, 0, 12, -17, 5, 8, -1, 0}; // contains zeros. modulus() will throw an exception
        int arrayInt2[] = {-2, -7, -3, -5, -4, -10, -1, -1, -4, -6}; // all negative to test exception in maxPositive
        double arrayDbl[] = {6.5, -7.2, 1.4, 0.1, 3.25, 2, -5.5, -1.1, 1.5, -0.6};

        Arrays.caller(arrayInt1);
        Arrays.caller(arrayInt2);
        Arrays.caller(arrayDbl);
    }
}
