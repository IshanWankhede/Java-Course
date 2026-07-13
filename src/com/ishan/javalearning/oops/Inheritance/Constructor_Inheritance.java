package com.ishan.javalearning.oops.Inheritance;

class Animall {

    Animall() {
        System.out.println("Animal Constructor");
    }
}

class Doggg extends Animall {

    Doggg() {
        System.out.println("Dog Constructor");
    }
}

public class Constructor_Inheritance {

    public static void main(String[] args) {

        Doggg d = new Doggg();
    }
}