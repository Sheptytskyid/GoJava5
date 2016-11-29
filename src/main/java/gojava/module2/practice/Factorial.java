package gojava.module2.practice;

public class Factorial {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countFactorial(n));
    }

    static int countFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        n *= countFactorial(n-1);
        return n;
    }
}
