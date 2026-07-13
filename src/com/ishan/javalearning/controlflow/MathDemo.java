package com.ishan.javalearning.controlflow;

public class MathDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Maximum and Minimum
        System.out.println("Max : " + Math.max(a, b));
        System.out.println("Min : " + Math.min(a, b));

        // Power
        System.out.println("Power : " + Math.pow(2, 3));

        // Square Root
        System.out.println("Square Root : " + Math.sqrt(25));

        // Absolute Value
        System.out.println("Absolute : " + Math.abs(-10));

        // Ceiling
        System.out.println("Ceil : " + Math.ceil(4.2));

        // Floor
        System.out.println("Floor : " + Math.floor(4.9));

        // Round
        System.out.println("Round : " + Math.round(4.6));

        // PI and Euler Number
        System.out.println("PI : " + Math.PI);
        System.out.println("E : " + Math.E);

        // Trigonometric Functions
        System.out.println("sin(90) : " +
                Math.sin(Math.toRadians(90)));

        System.out.println("cos(0) : " +
                Math.cos(Math.toRadians(0)));

        // Logarithm
        System.out.println("log(10) : " + Math.log(10));

        // Base 10 Log
        System.out.println("log10(100) : " +
                Math.log10(100));
    }
}