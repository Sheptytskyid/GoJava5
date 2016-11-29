package moduleOne.practice;

import java.util.Random;

public class Variables {
    public static void main(String[] args) {
/*
        int peopleCount = 10;

        long population = 7_000_000;

        byte variable = 100;

        boolean isActive = false;

        double index = 4.5;

        float index1 = 10.444f;*/

        Random rand = new Random();
        for (int i = 0; i < 8; i++)
        System.out.println(rand.nextInt(100));

    }
}
