package com.ishan.javalearning.oops.Inheritance;

class Animalii {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dogii extends Animalii {

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }
}

public class Upcasting {

    public static void main(String[] args) {

        Animalii a = new Dogii();

        a.sound();
    }
}