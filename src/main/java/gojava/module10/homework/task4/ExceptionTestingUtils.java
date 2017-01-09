package gojava.module10.homework.task4;

import gojava.module10.homework.task2.MyException;

public class ExceptionTestingUtils {

    public static void methodF() throws MySecondException {
        try {
            methodG();
        } catch (MyException e) {
            throw new MySecondException("My Second Exception", e);
        }
    }

    public static void methodG() throws MyException {
        throw new MyException("My Exception");
    }
}
