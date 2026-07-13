package com.ishan.javalearning.oops;

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name is "+this.name);
        System.out.println("Age is "+this.age);
    }
}

public class Class_Objects {
    public static void main(String[] args) {

        Pen pen = new Pen();
        pen.color = "red";
        pen.type = "ballpen";
        pen.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpen";
        pen2.write();

        pen.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Ishan";
        s1.age = 18;
        s1.printInfo();
    }
}
