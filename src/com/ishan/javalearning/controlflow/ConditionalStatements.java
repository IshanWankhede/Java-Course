package com.ishan.javalearning.controlflow;

public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 20;
        int marks = 85;
        char grade = 'A';

        // ==========================
        // 1. Simple if
        // ==========================
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // ==========================
        // 2. if-else
        // ==========================
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // ==========================
        // 3. if-else-if ladder
        // ==========================
        if (marks >= 90) {
            System.out.println("Grade A+");
        }
        else if (marks >= 80) {
            System.out.println("Grade A");
        }
        else if (marks >= 70) {
            System.out.println("Grade B");
        }
        else if (marks >= 60) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade D");
        }

        // ==========================
        // 4. Nested if
        // ==========================
        if (age >= 18) {

            if (marks >= 60) {
                System.out.println("Eligible");
            }
            else {
                System.out.println("Not Eligible");
            }

        } else {
            System.out.println("Under Age");
        }

        // ==========================
        // 5. Switch Statement
        // ==========================
        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Good");
                break;

            default:
                System.out.println("Needs Improvement");
        }

        // ==========================
        // 6. Enhanced Switch (Java 14+)
        // ==========================
        String day = "MONDAY";

        switch (day) {

            case "MONDAY", "TUESDAY" ->
                    System.out.println("Weekday");

            case "SATURDAY", "SUNDAY" ->
                    System.out.println("Weekend");

            default ->
                    System.out.println("Invalid Day");
        }

        // ==========================
        // 7. Ternary Operator
        // ==========================
        String result =
                (age >= 18)
                        ? "Adult"
                        : "Minor";

        System.out.println(result);
    }
}
