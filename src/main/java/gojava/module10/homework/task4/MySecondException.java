package gojava.module10.homework.task4;

public class MySecondException extends Exception {

    public MySecondException(String message) {
        super(message);
    }

    public MySecondException() {
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
