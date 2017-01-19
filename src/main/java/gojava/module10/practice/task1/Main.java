package gojava.module10.practice.task1;

public class Main {

    public static void main(String[] args) {
        Integer numerator = new Integer(4);
        Number denominator = 0;
        try {
            Integer result = numerator.intValue() / denominator.intValue();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
