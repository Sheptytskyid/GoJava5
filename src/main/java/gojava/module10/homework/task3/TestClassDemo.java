package gojava.module10.homework.task3;

public class TestClassDemo {

    public static void main(String[] args) {
        TestClass testClass = null;

        try {
            testClass.testMethod();
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
