package gojava.module10.homework.task1;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            throw new Exception("Testing exception handling");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inside \"finally\"");
        }
    }
}
