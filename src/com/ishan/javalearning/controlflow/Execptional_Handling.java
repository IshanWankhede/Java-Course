package com.ishan.javalearning.controlflow;

import java.util.Arrays;

public class Execptional_Handling {
    public static void main(String[] args) {
        // TRY - CATCH in EXCEPTION HANDLING

        int[] marks = {97, 98, 99};
        try {
            System.out.println(marks[5]);
        }  catch (Exception e) {
            // do something after catching
        }

        System.out.println("The Student name is Ishan");
    }
}
