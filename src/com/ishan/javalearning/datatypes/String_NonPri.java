package com.ishan.javalearning.datatypes;

public class String_NonPri {
    public static void main(String[] args) {
        // ==========================
        // 1. Creating Strings
        // ==========================

        String name = "Ishan";              // Stored in String Pool
        String college = "VIT Pune";

        // Creating String using new keyword
        String city = new String("Pune");  // Object created in Heap

        System.out.println(name);
        System.out.println(college);
        System.out.println(city);


        // ==========================
        // 2. Length of String
        // ==========================

        System.out.println("Length : " + name.length());


        // ==========================
        // 3. Access Character
        // ==========================

        System.out.println("First Character : " + name.charAt(0));


        // ==========================
        // 4. Convert Case
        // ==========================

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        // ==========================
        // 5. Concatenation
        // ==========================

        String fullName = name + " Sharma";

        System.out.println(fullName);


        // ==========================
        // 6. Equals Method
        // ==========================

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1.equals(s2)); // true


        // ==========================
        // 7. == Operator
        // ==========================

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // compares memory addresses
        System.out.println(s3 == s4);

        // compares actual values
        System.out.println(s3.equals(s4));


        // ==========================
        // 8. Contains
        // ==========================

        String sentence = "I Love Java";

        System.out.println(sentence.contains("Java"));


        // ==========================
        // 9. Substring
        // ==========================

        System.out.println(name.substring(1, 4));


        // ==========================
        // 10. Index Of
        // ==========================

        System.out.println(name.indexOf('a'));


        // ==========================
        // 11. Strings are Immutable
        // ==========================

        String str = "hello";

        str.toUpperCase();

        // original string remains same
        System.out.println(str);

        // store returned string
        str = str.toUpperCase();

        System.out.println(str);

        /*
        STACK  → Variables & References
        HEAP   → Objects
        POOL   → Special area inside Heap for Strings
         */

        /*
        Primitive Types
↓
        Stored directly (for local variables).

        Arrays
        ↓
        Reference in Stack
        Array Object in Heap

        Strings
        ↓
        Reference in Stack
        String object in Heap/String Pool
         */
    }
}
