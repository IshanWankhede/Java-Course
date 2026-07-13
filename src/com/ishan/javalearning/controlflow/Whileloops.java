package com.ishan.javalearning.controlflow;

public class Whileloops {
    public static void main(String[] args) {
        // ==========================
        // 1. Basic While Loop
        // ==========================
        System.out.println("Basic While Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // ==========================
        // 2. Reverse While Loop
        // ==========================
        System.out.println("\nReverse While:");

        int j = 5;

        while (j >= 1) {
            System.out.println(j);
            j--;
        }


        // ==========================
        // 3. Even Numbers
        // ==========================
        System.out.println("\nEven Numbers:");

        int k = 0;

        while (k <= 10) {
            System.out.println(k);
            k += 2;
        }


        // ==========================
        // 4. Infinite While Loop
        // ==========================
        /*
        while (true) {
            System.out.println("Infinite Loop");
        }
        */


        // ==========================
        // 5. Break Example
        // ==========================
        System.out.println("\nBreak Example:");

        int x = 1;

        while (x <= 10) {

            if (x == 5)
                break;

            System.out.println(x);
            x++;
        }


        // ==========================
        // 6. Continue Example
        // ==========================
        System.out.println("\nContinue Example:");

        int y = 0;

        while (y < 5) {

            y++;

            if (y == 3)
                continue;

            System.out.println(y);
        }


        // ==========================
        // 7. Do While Loop
        // ==========================
        System.out.println("\nDo While:");

        int z = 1;

        do {
            System.out.println(z);
            z++;
        }
        while (z <= 5);


        // ==========================
        // 8. Do While executes once
        // ==========================
        System.out.println("\nRuns Once:");

        int num = 10;

        do {
            System.out.println("Executed Once");
        }
        while (num < 5);
    }
}
