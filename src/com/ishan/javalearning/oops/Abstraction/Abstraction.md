# 13. Abstraction in Java

# What is Abstraction?

Abstraction means:

```text id="c3a9vm"
Showing only essential information
and hiding implementation details.
```

Example:

```text id="e4h2wo"
You drive a car.

You know:
✓ Steering
✓ Brake
✓ Accelerator

You do NOT know:
✗ Engine internals
✗ Gear mechanisms
✗ Fuel injection system
```

This is abstraction.

---

# Definition

```text id="k5x1ba"
Abstraction
=
Hide Implementation
+
Show Functionality
```

---

# Why is Abstraction Needed?

Without abstraction:

Users would need to understand every internal detail.

Abstraction provides:

```text id="2y0f5v"
✓ Simplicity
✓ Security
✓ Flexibility
✓ Loose Coupling
✓ Better Design
```

---

# Ways to Achieve Abstraction in Java

Java provides two ways:

```text id="1ctryv"
1. Abstract Classes
2. Interfaces
```

Interfaces are covered in the next topic.

---

# Abstract Class

A class declared using:

```java id="75owx4"
abstract
```

keyword.

Syntax:

```java id="i5f0g4"
abstract class Animal {

}
```

---

# Can We Create Objects?

❌ No.

```java id="m66jlwm"
Animal a = new Animal();
```

Compiler Error.

Because abstract classes are incomplete.

---

# Example

```java id="4sjr0z"
abstract class Animal {

    void eat() {
        System.out.println("Eating");
    }
}
```

Usage:

```java id="7i0v6k"
Animal a = new Dog();
```

Allowed.

---

# Abstract Methods

A method without implementation.

Syntax:

```java id="e2rquf"
abstract void sound();
```

No body:

```java id="g4r3zj"
abstract void sound();
```

---

# Example

```java id="skkv6q"
abstract class Animal {

    abstract void sound();
}
```

---

# Child Class Must Implement

```java id="xfb3ng"
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

---

# Complete Example

```java id="4tx5rw"
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
        a.eat();
    }
}
```

Output:

```text id="jlwmk4"
Bark
Eating
```

---

# Important Rules

---

## Rule 1

If a class contains an abstract method:

```java id="jlwm31"
abstract void sound();
```

Then class must also be abstract.

```java id="k1jlwm"
abstract class Animal {

}
```

---

## Rule 2

Abstract class can contain:

```text id="jq7lzm"
✓ Variables
✓ Constructors
✓ Normal methods
✓ Static methods
✓ Abstract methods
```

---

## Rule 3

Abstract methods cannot have body.

❌

```java id="hcr8py"
abstract void show() {

}
```

---

## Rule 4

Child class must override all abstract methods.

Otherwise child class also becomes abstract.

---

# Constructors in Abstract Classes

Abstract classes can have constructors.

Example:

```java id="jlwmf4"
abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}
```

When child object is created:

```java id="2m9g1x"
Animal a = new Dog();
```

Output:

```text id="y10v0r"
Animal Constructor
Dog Constructor
```

---

# Why Constructors?

Because parent part of object still exists.

---

# Memory Representation

```java id="jlwm83"
Animal a = new Dog();
```

Memory:

```text id="fyz8k4"
STACK

a
 |
 |
 v

HEAP
----------------------
Animal Members
Dog Members
----------------------
```

---

# Runtime Polymorphism with Abstraction

```java id="jlwm90"
Animal a = new Dog();

a.sound();
```

Output:

```text id="jlwm91"
Bark
```

This is:

```text id="6jlwm2"
Runtime Polymorphism
```

---

# Example

```java id="jlwm92"
Animal a;

a = new Dog();

a.sound();

a = new Cat();

a.sound();
```

Output:

```text id="jlwm93"
Bark
Meow
```

---

# Real Life Example

```text id="4jlwm1"
Payment System
```

Abstract class:

```java id="9jlwm2"
abstract class Payment {

    abstract void pay();
}
```

Children:

```java id="5jlwm3"
UPIPayment
CardPayment
NetBankingPayment
```

User only knows:

```java id="2jlwm4"
payment.pay();
```

Implementation remains hidden.

---

# Abstract Class vs Normal Class

| Feature                 | Normal Class | Abstract Class |
| ----------------------- | ------------ | -------------- |
| Object Creation         | ✅ Yes        | ❌ No           |
| Abstract Methods        | ❌ No         | ✅ Yes          |
| Complete Implementation | ✅ Yes        | ❌ Partial      |
| Inheritance Required    | ❌ No         | Usually Yes    |

---

# Abstract Method vs Normal Method

| Feature           | Abstract Method | Normal Method |
| ----------------- | --------------- | ------------- |
| Body              | ❌ No            | ✅ Yes         |
| Override Required | ✅ Yes           | ❌ No          |
| Ends with `;`     | ✅ Yes           | ❌ No          |

---

# Abstraction vs Encapsulation

| Abstraction                      | Encapsulation          |
| -------------------------------- | ---------------------- |
| Hides implementation             | Hides data             |
| Focus on what                    | Focus on security      |
| Uses abstract classes/interfaces | Uses private variables |

---

# Important Interview Questions

---

### Can abstract class have constructors?

✅ Yes.

---

### Can abstract class have static methods?

✅ Yes.

---

### Can abstract class have final methods?

✅ Yes.

---

### Can abstract class have normal methods?

✅ Yes.

---

### Can abstract method be private?

❌ No.

Because child class cannot override it.

---

### Can abstract method be static?

❌ No.

Static methods cannot be overridden.

---

### Can abstract class be final?

❌ No.

`final` prevents inheritance.

`abstract` requires inheritance.

Both are opposite concepts.

---

# Complete Example

```java id="1jlwm5"
abstract class Shape {

    abstract double area();

    void display() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {

    double radius = 5;

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s = new Circle();

        System.out.println(s.area());

        s.display();
    }
}
```

Output:

```text id="7jlwm6"
78.5
Shape
```

---

# Summary

```text id="8jlwm7"
Abstraction
↓
Hide implementation
Show functionality
```

---

# Achieved Using

```text id="9jlwm8"
1. Abstract Classes
2. Interfaces
```

---

# Abstract Class Can Have

```text id="0jlwm9"
✓ Variables
✓ Constructors
✓ Static Methods
✓ Normal Methods
✓ Abstract Methods
```

---

# Easy Formula

```text id="1jlwm0"
What to do
↓
Abstraction

How to do
↓
Implementation
```

---

# Real Meaning

```text id="2jlwm1"
User should know:

"What operation can be performed?"

User should NOT know:

"How internally it is implemented?"
```
