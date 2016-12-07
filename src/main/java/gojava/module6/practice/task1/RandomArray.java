package gojava.module6.practice.task1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        int lowerBound = 10;
        int upperBound = 50;
        int[] randomArray = new int[20];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = getRandomInt(lowerBound, upperBound);
        }
        System.out.println(Arrays.toString(randomArray));
    }

    private static int getRandomInt(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
