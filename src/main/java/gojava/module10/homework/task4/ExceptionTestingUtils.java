package gojava.module10.homework.task4;

import gojava.module10.homework.task2.MyException;

public class ExceptionTestingUtils {

    public static void methodF() throws MySecondException {
        try {
            methodG();
        } catch (MyException e) {
            System.out.println("Caught exception: " + e.getMessage());
            MySecondException mySecondException =  new MySecondException("My Second Exception");
            mySecondException.addSuppressed(e);
            throw mySecondException;
        }
    }

    public static void methodG() throws MyException {
        throw new MyException("My Exception");
    }
}
