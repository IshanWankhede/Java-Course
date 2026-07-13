package com.ishan.javalearning.controlflow;

public class Methods_Function {
    // ==========================
    // 1. Simple Method
    // ==========================
    static void greet() {
        System.out.println("Hello World");
    }

    // ==========================
    // 2. Method with Parameters
    // ==========================
    static void printName(String name) {
        System.out.println("Hello " + name);
    }

    // ==========================
    // 3. Method Returning Value
    // ==========================
    static int add(int a, int b) {
        return a + b;
    }

    // ==========================
    // 4. Method Returning Double
    // ==========================
    static double square(double num) {
        return num * num;
    }

    // ==========================
    // 5. Multiple Parameters
    // ==========================
    static int max(int a, int b) {

        if (a > b)
            return a;

        return b;
    }

    // ==========================
    // 6. Method Overloading
    // ==========================
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    // ==========================
    // Main Method
    // ==========================
    public static void main(String[] args) {

        // Calling simple method
        greet();

        // Method with parameter
        printName("Ishan");

        // Method with return value
        int ans = add(10, 20);
        System.out.println(ans);

        // Square
        System.out.println(square(5));

        // Max
        System.out.println(max(100, 50));

        // Method Overloading
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.5, 20.5));
    }
}
