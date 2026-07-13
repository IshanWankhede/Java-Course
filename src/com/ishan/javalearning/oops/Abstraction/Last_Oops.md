# 14. Interfaces in Java

# What is an Interface?

An interface is a blueprint of a class that contains behavior specifications.

It provides:

```text
100% abstraction (before Java 8)
```

Syntax:

```java
interface Animal {

    void sound();
}
```

Methods are automatically:

```text
public abstract
```

Internally:

```java
public abstract void sound();
```

---

# Implementing Interface

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
```

---

# Creating Objects

❌ Not Allowed

```java
Animal a = new Animal();
```

✅ Allowed

```java
Animal a = new Dog();
```

---

# Multiple Inheritance

Java supports multiple inheritance through interfaces.

```java
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {

    public void show() {}

    public void display() {}
}
```

---

# Interface Variables

All variables are automatically:

```text
public static final
```

Example:

```java
interface Test {

    int VALUE = 10;
}
```

Equivalent to:

```java
public static final int VALUE = 10;
```

---

# Java 8 Features

Interfaces can contain:

```text
✓ Default Methods
✓ Static Methods
```

Example:

```java
default void hello() {
    System.out.println("Hello");
}
```

---

# Summary

```text
Interface
↓
Contract/Blueprint
↓
Achieves abstraction and polymorphism.
```

---

# 15. final Keyword

`final` means:

```text
Cannot be modified.
```

---

# Final Variable

```java
final int AGE = 18;
```

❌

```java
AGE = 20;
```

Error.

---

# Final Method

```java
final void display() {

}
```

Cannot be overridden.

---

# Final Class

```java
final class Animal {

}
```

Cannot be inherited.

Example:

```java
String
```

is a final class.

---

# Blank Final Variable

```java
final int age;

age = 18;
```

Can be initialized once.

---

# Summary

```text
final variable → Constant

final method → Cannot override

final class → Cannot inherit
```

---

# 16. Object Class

`Object` is the parent of every class in Java.

Hierarchy:

```text
Object
   ↑
 Animal
   ↑
   Dog
```

Every class implicitly extends:

```java
class Student extends Object {

}
```

---

# Important Methods

### toString()

```java
System.out.println(obj);
```

Internally:

```java
obj.toString();
```

Default output:

```text
ClassName@HashCode
```

---

### equals()

Compares objects.

```java
obj1.equals(obj2);
```

---

### hashCode()

Returns hash value.

```java
obj.hashCode();
```

---

### getClass()

Returns runtime class information.

```java
obj.getClass();
```

---

### clone()

Creates copy of object.

---

# Example

```java
class Student {

    String name = "Ishan";
}

Student s = new Student();

System.out.println(s);
```

Output:

```text
Student@4eec7777
```

Unless `toString()` is overridden.

---

# 17. Packages in Java

# What is a Package?

A package is a collection of related classes and interfaces.

Purpose:

```text
✓ Organize code
✓ Avoid naming conflicts
✓ Access protection
```

---

# Syntax

```java
package com.ishan.java;
```

Must be first line.

---

# Importing Package

```java
import java.util.Scanner;
```

or

```java
import java.util.*;
```

---

# User Defined Package

```java
package com.ishan;

public class Test {

}
```

Folder structure:

```text
com
 └── ishan
      └── Test.java
```

---

# Important Packages

| Package   | Purpose              |
| --------- | -------------------- |
| java.lang | Core classes         |
| java.util | Collections, Scanner |
| java.io   | File handling        |
| java.time | Date & Time          |
| java.sql  | Database             |

---

# java.lang Package

Automatically imported.

Examples:

```java
String
Math
Object
System
Integer
```

No need:

```java
import java.lang.*;
```

---

# Access Levels in Packages

```text
private
default
protected
public
```

Package plays a major role in access modifiers.

---

# 18. Inner Classes

# What is an Inner Class?

A class defined inside another class.

Example:

```java
class Outer {

    class Inner {

    }
}
```

---

# Why Use Inner Classes?

```text
✓ Better organization
✓ Logical grouping
✓ Access outer members easily
```

---

# Creating Object

```java
Outer outer = new Outer();

Outer.Inner inner =
        outer.new Inner();
```

---

# Inner Class Access

```java
class Outer {

    int x = 10;

    class Inner {

        void display() {
            System.out.println(x);
        }
    }
}
```

Inner classes can directly access outer members.

---

# Types of Inner Classes

## 1. Regular Inner Class

```java
class Outer {

    class Inner {

    }
}
```

---

## 2. Static Nested Class

```java
class Outer {

    static class Inner {

    }
}
```

Creation:

```java
Outer.Inner obj =
        new Outer.Inner();
```

No outer object required.

---

## 3. Local Inner Class

Defined inside methods.

```java
void test() {

    class Local {

    }
}
```

---

## 4. Anonymous Inner Class

Class without name.

Example:

```java
Runnable r =
        new Runnable() {

            @Override
            public void run() {

                System.out.println("Running");
            }
        };
```

Used heavily in:

```text
Swing
Threads
Event Handling
```

---

# Memory Representation

```text
Outer Object
----------------
x = 10
----------------

Inner Object
----------------
Reference to Outer Object
----------------
```

Regular inner classes automatically maintain a reference to the outer object.

---

# Summary

## Interfaces

```text
Blueprint of behavior.

Uses:
✓ Abstraction
✓ Multiple Inheritance
✓ Polymorphism
```

---

## final Keyword

```text
final variable → Constant
final method   → Cannot override
final class    → Cannot inherit
```

---

## Object Class

```text
Root parent of every Java class.
```

Important methods:

```text
toString()
equals()
hashCode()
getClass()
clone()
```

---

## Packages

```text
Collection of related classes.
```

Benefits:

```text
✓ Organization
✓ Security
✓ Reusability
```

---

## Inner Classes

Types:

```text
1. Regular Inner Class
2. Static Nested Class
3. Local Inner Class
4. Anonymous Inner Class
```

Benefits:

```text
✓ Better grouping
✓ Encapsulation
✓ Cleaner code
```
