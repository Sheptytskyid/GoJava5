package gojava.module10.homework.task4;

public class Main {

    public static void main(String[] args) {
        try {
            ExceptionTestingUtils.methodF();
        } catch (MySecondException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("caused by: " + e.getCause().getMessage());
        }
    }

}
