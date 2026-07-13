# Classes and Objects in Java

# Introduction to OOP

Java is an **Object-Oriented Programming (OOP)** language.

OOP organizes programs using:

```text
Classes + Objects
```

Everything in Java revolves around classes and objects.

---

# What is a Class?

A class is a **blueprint/template** used to create objects.

A class defines:

* Variables (Properties)
* Methods (Behaviors)

### Real Life Example

```text
Class → Student

Properties:
- name
- age
- rollNo

Behaviors:
- study()
- eat()
- sleep()
```

The class itself is not a real object.

It is only a template.

---

# Syntax of a Class

```java
class ClassName {

    // Variables (Fields)

    // Methods
}
```

Example:

```java
class Student {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}
```

---

# What is an Object?

An object is a **real instance of a class**.

Example:

```text
Class:
Student

Objects:
Ishan
Rahul
Priya
```

All these students are objects of the `Student` class.

---

# Creating an Object

Syntax:

```java
ClassName objectName = new ClassName();
```

Example:

```java
Student s1 = new Student();
```

---

# Understanding This Statement

```java
Student s1 = new Student();
```

| Part      | Meaning                |
| --------- | ---------------------- |
| Student   | Class Type             |
| s1        | Reference Variable     |
| new       | Creates object in heap |
| Student() | Constructor            |

---

# Complete Example

```java
class Student {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ishan";
        s1.age = 18;

        s1.study();
    }
}
```

Output:

```text
Ishan is studying
```

---

# Accessing Members using Dot Operator

```java
object.variable
object.method()
```

Example:

```java
s1.name = "Ishan";

s1.study();
```

`.` is called the **dot operator**.

---

# Memory Representation

Example:

```java
Student s1 = new Student();
```

Memory:

```text
STACK                     HEAP
------                    ----------------
s1 ---------------------> Student Object
                           name = null
                           age = 0
```

### Important

```text
Reference variable → Stack
Actual object → Heap
```

---

# Adding Values

```java
s1.name = "Ishan";
s1.age = 18;
```

Memory:

```text
STACK

s1 -----------\
               \
                ------> HEAP
                         -----------------
                         name → "Ishan"
                         age  → 18
                         -----------------
```

---

# Multiple Objects

```java
Student s1 = new Student();
Student s2 = new Student();
```

Memory:

```text
STACK

s1 ---------> Object1
s2 ---------> Object2
```

Each object has its own data.

---

# Example

```java
s1.name = "Ishan";

s2.name = "Rahul";
```

Objects are independent.

---

# Object Reference

```java
Student s1 = new Student();

Student s2 = s1;
```

Memory:

```text
STACK

s1 --------\
            \
             -----> Student Object
            /
s2 --------/
```

Both references point to the same object.

---

# Example

```java
s2.name = "Rahul";

System.out.println(s1.name);
```

Output:

```text
Rahul
```

because both variables refer to the same object.

---

# Null Reference

```java
Student s1 = null;
```

Memory:

```text
STACK

s1 -----> null
```

No object exists.

---

# NullPointerException

```java
Student s1 = null;

s1.study();
```

Output:

```text
NullPointerException
```

because no object exists in heap.

---

# Anonymous Objects

Objects without references.

```java
new Student();
```

Example:

```java
new Student().study();
```

The object becomes eligible for Garbage Collection after use.

---

# Class Variables (Fields)

Variables declared inside a class.

Example:

```java
class Student {

    String name;
    int age;
}
```

These are called:

```text
Instance Variables
Fields
Properties
Attributes
```

All mean the same thing.

---

# Methods in a Class

```java
class Student {

    void study() {
        System.out.println("Studying");
    }
}
```

Methods define object behavior.

---

# Object Initialization

### Method 1

```java
Student s = new Student();

s.name = "Ishan";
s.age = 18;
```

### Method 2

Using Constructor (learn later).

---

# Default Values of Object Fields

```java
class Student {

    String name;
    int age;
    boolean placed;
}
```

Default values:

| Type           | Default Value |
| -------------- | ------------- |
| byte           | 0             |
| short          | 0             |
| int            | 0             |
| long           | 0L            |
| float          | 0.0f          |
| double         | 0.0           |
| char           | '\u0000'      |
| boolean        | false         |
| Objects/String | null          |

---

# Difference Between Class and Object

| Class                       | Object                    |
| --------------------------- | ------------------------- |
| Blueprint                   | Real entity               |
| No memory for instance data | Occupies memory           |
| Logical entity              | Physical entity           |
| Created once                | Multiple objects possible |

---

# Real Life Examples

| Class   | Objects         |
| ------- | --------------- |
| Student | Ishan, Rahul    |
| Car     | BMW, Audi       |
| Mobile  | Samsung, iPhone |
| Animal  | Dog, Cat        |

---

# Important Interview Questions

### Is class stored in heap?

No.

The class definition is loaded by JVM in a special memory area called **Method Area (Metaspace)**.

Objects created from that class are stored in Heap.

---

### Where are objects stored?

```text
Heap Memory
```

---

### Where are reference variables stored?

```text
Stack Memory
```

---

### Does object variable store actual object?

No.

It stores a **reference/address** of the object.

---

# Visualization

```java
Student s1 = new Student();
```

Memory:

```text
STACK

s1
 |
 |
 v

HEAP
-------------------
name = null
age  = 0
-------------------
```

---

# Summary

```text
Class
↓
Blueprint/Template

Object
↓
Instance of a class

Reference Variable
↓
Stores address of object

Object
↓
Stored in Heap

Reference
↓
Stored in Stack
```

---

# Easy Formula

```text
Class + new Keyword
↓
Creates Object

Object + Dot Operator
↓
Access Variables and Methods
```

---

# Most Important Syntax

```java
ClassName obj = new ClassName();

obj.variable;

obj.method();
```
