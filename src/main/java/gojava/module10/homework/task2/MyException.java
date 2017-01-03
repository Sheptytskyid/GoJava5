package gojava.module10.homework.task2;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public MyException() {
        super();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
