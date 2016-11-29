package gojava.module2.practice;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(countFactorial(4));
    }

    static int countFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        number *= countFactorial(number - 1);
        return number;
    }
}
