// contains all methods to manipulate an array and a caller which takes
// an array as an argument, calls all methods and prints the results
// all methods are overloaded to work with both int and double Arrays
// all methods are private may be called only by the caller within this class
// all methods are static to work without objects
package module2.homework.task2_1;

class Arrays {
    private static int sum(int arr[]) {
        int sum = 0;

        for (int x : arr) sum += x;
        return sum;
    }

    private static double sum(double arr[]) {
        double sum = 0;

        for (double x : arr) sum += x;
        return sum;
    }

    private static int min(int arr[]) {
        int min = arr[0];

        for (int x : arr) min = x < min ? x : min;
        return min;
    }

    private static double min(double arr[]) {
        double min = arr[0];

        for (double x : arr) min = x < min ? x : min;
        return min;
    }

    private static int max(int arr[]) {
        int max = arr[0];

        for (int x : arr) max = x > max ? x : max;
        return max;
    }

    private static double max(double arr[]) {
        double max = arr[0];

        for (double x : arr) max = x > max ? x : max;
        return max;
    }

    private static int maxPositive(int arr[]) {
        int max = arr[0];

        for (int x : arr) if (x >= 0 && x > max) max = x;
        if (max < 0) throw (new ArithmeticException()); // throw an exception if there are no positive elements
        return max;
    }

    private static double maxPositive(double arr[]) {
        double max = arr[0];

        for (double x : arr) if (x >= 0 && x > max) max = x;
        if (max < 0) throw (new ArithmeticException()); // throw an exception if there are no positive elements
        return max;
    }

    private static int multiplication(int arr[]) {
        int mul = 1;

        for (int x : arr) mul *= x;
        return mul;
    }

    private static double multiplication(double arr[]) {
        double mul = 1;

        for (double x : arr) mul *= x;
        return mul;
    }

    private static int modulus(int arr[]) {
        return arr[0] % arr[arr.length-1]; // may return an ArithmeticException if the denominator equals zero
    }

    private static double modulus(double arr[]){
        return arr[0] % arr[arr.length-1]; // may return an ArithmeticException if the denominator equals zero
    }

    private static int secondLargest(int arr[]) {
        //use bubble sort to sort an array and then return the 9th array element
        //will return the same result as max if the max element is not unique
        for (int a = 1; a < arr.length; a++){
            for (int b = arr.length - 1; b >= a; b--){
                if (arr[b-1] > arr[b]){
                    int t = arr[b-1];
                    arr[b-1] = arr[b];
                    arr[b] = t;
                }
            }
        }
        return arr[arr.length - 2];
    }

    private static double secondLargest(double arr[]) {
        //use bubble sort to sort an array and return the 9th array element
        //will return the same result as max if the max element is not unique
        for (int a = 1; a < arr.length; a++){
            for (int b = arr.length - 1; b >= a; b--){
                if (arr[b-1] > arr[b]){
                    double t = arr[b-1];
                    arr[b-1] = arr[b];
                    arr[b] = t;
                }
            }
        }
        return arr[arr.length - 2];
    }

    static void caller(int arr[]){
        System.out.println("Initial array: ");
        for (int x : arr) System.out.print(x + ", ");
        System.out.println("\n");
        System.out.println("Max element: " + max(arr));
        System.out.println("Min element: " + min(arr));
        System.out.print("MaxPositive element: ");
        try {
            System.out.println(Arrays.maxPositive(arr)); // may throw an exception if no positive elements will be found
        }
        catch(ArithmeticException exc) {
            System.out.println("Error: this array contains no positive elements");
        }
        System.out.println("Product of all elements: " + Arrays.multiplication(arr));
        System.out.print("Modulus of the first and the last element: ");
        try {
            System.out.println(Arrays.modulus(arr));
        } catch(ArithmeticException exc) {
            System.out.println("Error: division by zero occurred");
        }
        System.out.println("Second largest element: " + Arrays.secondLargest(arr));
        System.out.println("\n\n");
    }

    static void caller(double arr[]){
        System.out.println("Initial array: ");
        for (double x : arr) System.out.print(x + ", ");
        System.out.println("\n");
        System.out.println("Max element: " + max(arr));
        System.out.println("Min element: " + min(arr));
        System.out.print("MaxPositive element: ");
        try {
            System.out.println(Arrays.maxPositive(arr)); // may throw an exception if no positive elements will be found
        } catch(ArithmeticException exc) {
            System.out.println("Error: this array contains no positive elements");
        }
        System.out.println("Product of all elements: " + Arrays.multiplication(arr));
        System.out.print("Modulus of the first and the last element: ");
        try {
            System.out.println(Arrays.modulus(arr));
        } catch(ArithmeticException exc) {
            System.out.println("Error: division by zero occurred");
        }
        System.out.println("Second largest element: " + Arrays.secondLargest(arr));
        System.out.println("\n\n");
    }
}