package com.ishan.javalearning.oops.Abstraction;

interface Animall {

    void sound();
}

class Dogg implements Animall {

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class Interfaces {

    public static void main(String[] args) {

        Animall a = new Dogg();

        a.sound();
    }
}

/*
Abstract Class = "Partially Completed Blueprint"
Interface = "Rules/Contract"

An abstract class is a class declared with the `abstract`
keyword that may contain both abstract methods
(methods without body) and concrete methods
(methods with implementation).

An interface is a reference type that contains
a set of method declarations that implementing
classes must provide implementations for.
 */