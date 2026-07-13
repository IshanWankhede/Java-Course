package com.ishan.javalearning.controlflow;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {

        Random random = new Random();

        // Integer
        int num1 = random.nextInt();

        // Integer from 0 to 99
        int num2 = random.nextInt(100);

        // Double between 0 and 1
        double d = random.nextDouble();

        // Float
        float f = random.nextFloat();

        // Boolean
        boolean b = random.nextBoolean();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(d);
        System.out.println(f);
        System.out.println(b);
    }
}
