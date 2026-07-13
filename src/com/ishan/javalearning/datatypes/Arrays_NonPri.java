package com.ishan.javalearning.datatypes;

import java.util.Arrays;   // Import the utility class

public class Arrays_NonPri {
    public static void main(String[] args) {
        // ==========================
        // 1. Declaring Arrays
        // ==========================

        int[] arr1;                 // Declaration only

        // ==========================
        // 2. Creating Array
        // ==========================

        arr1 = new int[5];          // Size = 5

        System.out.println(arr1[0]); // Default value = 0


        // ==========================
        // 3. Initialization
        // ==========================

        int[] arr2 = {10, 20, 30, 40, 50};


        // ==========================
        // 4. Accessing Elements
        // ==========================

        System.out.println(arr2[0]); // 10
        System.out.println(arr2[2]); // 30


        // ==========================
        // 5. Updating Elements
        // ==========================

        arr2[1] = 100;
        System.out.println(arr2[1]);


        // ==========================
        // 6. Length
        // ==========================

        System.out.println(arr2.length);


        // ==========================
        // 7. Traversing using For Loop
        // ==========================

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


        // ==========================
        // 8. Enhanced For Loop
        // ==========================

        for (int num : arr2) {
            System.out.println(num);
        }


        // ==========================
        // 9. Printing Arrays
        // ==========================

        System.out.println(Arrays.toString(arr2));


        // ==========================
        // 10. Sorting
        // ==========================

        int[] nums = {5, 1, 4, 2, 3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        // ==========================
        // 11. Filling Array
        // ==========================

        int[] arr3 = new int[5];
        Arrays.fill(arr3, 7);
        System.out.println(Arrays.toString(arr3));


        // ==========================
        // 12. Comparing Arrays
        // ==========================

        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println(Arrays.equals(a,b));


        // ==========================
        // 13. Copying Arrays
        // ==========================

        int[] copy = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(copy));


        // ==========================
        // 14. Multidimensional Arrays
        // ==========================

        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(matrix[1][2]); // 6

        int[] arr5 = {1,2,3};
        String str = "Hello";

        System.out.println(arr5.length);    // 3
        System.out.println(str.length());  // 5
    }
}
