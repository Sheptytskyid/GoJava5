package gojava.module10.homework.task5;

public class MyThirdException extends Exception {

    public MyThirdException(String message) {
        super(message);
    }

    public MyThirdException() {
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
