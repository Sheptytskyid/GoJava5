package gojava.module10.homework.task2;

public class MyExceptionDemo {

    public static void main(String[] args) {
        try {
            throw new MyException("Testing MyException");
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
