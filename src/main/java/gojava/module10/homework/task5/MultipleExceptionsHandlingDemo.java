package gojava.module10.homework.task5;

import gojava.module10.homework.task2.MyException;
import gojava.module10.homework.task4.MySecondException;

public class MultipleExceptionsHandlingDemo {

    public static void throwExceptionByNumber(int number) throws MyException, MySecondException, MyThirdException {
        switch (number) {
            case 1:
                throw new MyException();
            case 2:
                throw new MySecondException();
            default:
                throw new MyThirdException();
        }
    }

    public static void main(String[] args) {
        try {
            throwExceptionByNumber(1);
            throwExceptionByNumber(2);
            throwExceptionByNumber(3);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
    }

}
