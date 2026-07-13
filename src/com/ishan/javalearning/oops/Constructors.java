package com.ishan.javalearning.oops;

class Students {
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name is "+this.name);
        System.out.println("Age is "+this.age);
    }

//    Students() {
//        System.out.println("Constructor called");
//    }

    // Paramatised Constructor
//    Students(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    // Copy Constructor
    Students(Students s2){
        this.name =  s2.name;
        this.age = s2.age;
    }

    Students(){

    }
}

public class Constructors {
    public static void main(String[] args) {
//        Students s1 = new Students("Ishan", 19);
//        s1.name = "Ishan";
//        s1.age = 20;
//        s1.printInfo();

        Students s1 = new Students();
        s1.name = "Ishan";
        s1.age = 20;

        Students s2 = new Students(s1);
        s2.printInfo();
    }
}
