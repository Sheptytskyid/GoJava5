package gojava.module1.practice;

import java.util.Random;

public class Variables {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            System.out.println(rand.nextInt(100));
        }

    }
}
