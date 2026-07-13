package com.ishan.javalearning.oops.Inheritance;

class Aniimal {

    void eat() {
        System.out.println("Eating");
    }
}

class Doog extends Aniimal {

    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Doog {

    void weep() {
        System.out.println("Weeping");
    }
}

public class Multilevel_Inheritance {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}