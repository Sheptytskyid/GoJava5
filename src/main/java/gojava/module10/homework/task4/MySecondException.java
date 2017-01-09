package gojava.module10.homework.task4;

public class MySecondException extends Exception {

    public MySecondException(String message) {
        super(message);
    }

    public MySecondException() {
        super();
    }

    public MySecondException(String message, Throwable cause) {
        super(message, cause);
    }
}
