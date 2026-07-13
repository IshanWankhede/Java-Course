package com.ishan.javalearning.controlflow;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // to take input

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println(age);
    }
}
