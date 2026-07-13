# Constructors in Java

# What is a Constructor?

A constructor is a special method that is automatically called when an object is created.

Its main purpose is:

```text
Initialize object data.
```

Example:

```java
Student s1 = new Student();
```

When `new Student()` executes, Java automatically calls the constructor.

---

# Why Constructors are Needed?

Without constructors:

```java
Student s1 = new Student();

s1.name = "Ishan";
s1.age = 18;
```

With constructors:

```java
Student s1 = new Student("Ishan", 18);
```

Initialization becomes easier.

---

# Constructor Syntax

```java
class ClassName {

    ClassName() {
        // initialization code
    }
}
```

Example:

```java
class Student {

    Student() {
        System.out.println("Constructor Called");
    }
}
```

---

# Important Properties of Constructors

### 1. Constructor name must be same as class name.

```java
class Student {

    Student() {
    }
}
```

---

### 2. Constructors have NO return type.

❌ Wrong

```java
void Student() {
}
```

✅ Correct

```java
Student() {
}
```

---

### 3. Constructor executes automatically.

```java
Student s1 = new Student();
```

Output:

```text
Constructor Called
```

---

# Default Constructor

If you do not create any constructor, Java automatically creates one.

Example:

```java
class Student {

    String name;
    int age;
}
```

Java internally creates:

```java
Student() {
}
```

This is called the **Default Constructor**.

---

# User Defined Constructor

```java
class Student {

    Student() {
        System.out.println("Object Created");
    }
}
```

---

# Example

```java
class Student {

    String name;

    Student() {
        name = "Unknown";
    }
}
```

---

# Parameterized Constructor

Constructor with parameters.

```java
class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;
    }
}
```

Creating object:

```java
Student s1 =
        new Student("Ishan", 18);
```

Memory:

```text
STACK

s1
 |
 |
 v

HEAP
--------------------
name = "Ishan"
age  = 18
--------------------
```

---

# Constructor Overloading

Multiple constructors with different parameters.

```java
class Student {

    Student() {
    }

    Student(String name) {
    }

    Student(String name, int age) {
    }
}
```

Java chooses constructor according to arguments.

---

# Example

```java
class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String n) {
        name = n;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }
}
```

---

# `this` Keyword in Constructor

Problem:

```java
class Student {

    String name;

    Student(String name) {

        name = name;
    }
}
```

Both `name` refer to parameter.

Solution:

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;
    }
}
```

Meaning:

```text
this.name
↓
Object variable

name
↓
Parameter
```

---

# Constructor Chaining using `this()`

One constructor calling another constructor.

Example:

```java
class Student {

    Student() {

        System.out.println("Default");
    }

    Student(String name) {

        this();

        System.out.println(name);
    }
}
```

Output:

```text
Default
Ishan
```

---

# Rules of `this()`

1. `this()` must be the first statement.

✅ Correct

```java
Student() {

    this(10);
}
```

❌ Wrong

```java
Student() {

    System.out.println();

    this(10);
}
```

---

# Constructor Execution Order

Example:

```java
Student s1 =
        new Student("Ishan");
```

Flow:

```text
new
↓
Memory Allocation
↓
Default Initialization
↓
Constructor Execution
↓
Object Ready
```

---

# Memory Example

```java
Student s1 =
        new Student();
```

Memory:

```text
STACK                         HEAP
------                        ----------------
s1 -------------------------> Student Object
                               name = null
                               age = 0
```

Constructor modifies values.

---

# Copy Constructor in Java

Java does not provide a built-in copy constructor like C++.

We create it manually.

Example:

```java
class Student {

    String name;
    int age;

    Student(Student other) {

        this.name = other.name;
        this.age = other.age;
    }
}
```

Usage:

```java
Student s2 =
        new Student(s1);
```

---

# Difference from C++

### C++

```cpp
Student s2 = s1;
```

Copy constructor automatically called.

---

### Java

```java
Student s2 = s1;
```

This only copies reference.

Memory:

```text
s1 ----\
         \
          -----> Object
         /
s2 ----/
```

Both refer to same object.

To create a true copy:

```java
Student s2 =
        new Student(s1);
```

---

# Constructor vs Method

| Feature              | Constructor       | Method             |
| -------------------- | ----------------- | ------------------ |
| Name                 | Same as class     | Any name           |
| Return Type          | No                | Required           |
| Called Automatically | Yes               | No                 |
| Purpose              | Initialize object | Perform operations |

---

# Complete Example

```java
class Student {

    String name;
    int age;

    Student() {

        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 =
                new Student();

        Student s2 =
                new Student("Ishan",18);

        s1.display();
        s2.display();
    }
}
```

---

# Summary

```text
Constructor
↓
Special method used to initialize objects.
```

### Types

```text
1. Default Constructor
2. User Defined Constructor
3. Parameterized Constructor
4. Constructor Overloading
5. Copy Constructor (Manual)
6. Constructor Chaining
```

---

# Important Rules

```text
✓ Name must match class name.
✓ No return type.
✓ Called automatically.
✓ Executes when object is created.
✓ Can be overloaded.
✓ Java does not have automatic copy constructor.
```

---

# Easy Formula

```text
new Object()
↓
Memory Allocation
↓
Constructor Call
↓
Object Initialized
```
