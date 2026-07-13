package com.ishan.javalearning.datatypes;

public class Primitive_Types {
    public static void main(String[] args) {
        //byte   → 1 byte
        //short  → 2 bytes
        //int    → 4 bytes
        //long   → 8 bytes
        //float  → 4 bytes
        //double → 8 bytes
        //char   → 2 bytes
        //boolean→ true/false

        byte age = 30;
        int phone = 1029928992;
        long phone1 = 10299289922L;
        float pi = 3.14F;
        char letter = 'a';
        boolean isAdult = true;

        System.out.println("Byte Min : " + Byte.MIN_VALUE);
        System.out.println("Byte Max : " + Byte.MAX_VALUE);

        System.out.println("Short Min : " + Short.MIN_VALUE);
        System.out.println("Short Max : " + Short.MAX_VALUE);

        System.out.println("Integer Min : " + Integer.MIN_VALUE);
        System.out.println("Integer Max : " + Integer.MAX_VALUE);

        System.out.println("Long Min : " + Long.MIN_VALUE);
        System.out.println("Long Max : " + Long.MAX_VALUE);

        System.out.println("Float Min : " + Float.MIN_VALUE);
        System.out.println("Float Max : " + Float.MAX_VALUE);

        System.out.println("Double Min : " + Double.MIN_VALUE);
        System.out.println("Double Max : " + Double.MAX_VALUE);

        System.out.println("Character Min : " + (int) Character.MIN_VALUE);
        System.out.println("Character Max : " + (int) Character.MAX_VALUE);

        char a = (int) 10084;

        System.out.println(a);
    }
}
