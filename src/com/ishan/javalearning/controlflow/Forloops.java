package com.ishan.javalearning.controlflow;

public class Forloops {
    public static void main(String[] args) {
        // ==========================
        // 1. Basic For Loop
        // ==========================
        System.out.println("Basic For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // ==========================
        // 2. Reverse For Loop
        // ==========================
        System.out.println("\nReverse For Loop:");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }


        // ==========================
        // 3. Increment by 2
        // ==========================
        System.out.println("\nEven Numbers:");

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }


        // ==========================
        // 4. Multiple Variables
        // ==========================
        System.out.println("\nMultiple Variables:");

        for (int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.println(i + " " + j);
        }


        // ==========================
        // 5. Infinite For Loop
        // ==========================
        /*
        for(;;)
        {
            System.out.println("Infinite Loop");
        }
        */


        // ==========================
        // 6. Enhanced For Loop (For Each)
        // ==========================
        System.out.println("\nFor Each Loop:");

        int[] arr = {10, 20, 30, 40};

        for (int num : arr) {
            System.out.println(num);
        }


        // ==========================
        // 7. Nested For Loop
        // ==========================
        System.out.println("\nNested For Loop:");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }


        // ==========================
        // 8. Using break
        // ==========================
        System.out.println("\nBreak Example:");

        for (int i = 1; i <= 10; i++) {

            if (i == 5)
                break;

            System.out.println(i);
        }


        // ==========================
        // 9. Using continue
        // ==========================
        System.out.println("\nContinue Example:");

        for (int i = 1; i <= 5; i++) {

            if (i == 3)
                continue;

            System.out.println(i);
        }
    }
}
