package com.ishan.javalearning.oops.Abstraction;

class Student {

    String name;
    static String college = "VIT Pune";

    Student(String name) {
        this.name = name;
    }

    void display() {

        System.out.println(
                name + " - " + college);
    }
}

public class Static_Keyword {

    public static void main(String[] args) {

        Student s1 = new Student("Ishan");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
}