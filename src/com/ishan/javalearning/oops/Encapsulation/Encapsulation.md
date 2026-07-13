# 6. Encapsulation in Java

# What is Encapsulation?

Encapsulation means:

```text id="yjlwm8"
Wrapping data (variables) and methods
into a single unit (class)
+
Hiding sensitive data from outside access.
```

It is also called:

```text id="mxp9v6"
Data Hiding
```

---

# Real Life Example

Think of a **bank account**.

```text id="cf9pq1"
Balance → Private
Deposit() → Public
Withdraw() → Public
```

You cannot directly modify balance:

❌

```java id="3m0m2x"
account.balance = 1000000;
```

Instead:

✅

```java id="lyz9rz"
account.deposit(1000);
```

---

# Why Encapsulation?

Without encapsulation:

```java id="8q1hgi"
class Student {

    String name;
    int age;
}
```

Anyone can do:

```java id="uv5i3j"
s.age = -100;
```

Invalid data.

Encapsulation protects data.

---

# How to Achieve Encapsulation?

### Step 1

Make variables:

```java id="6nqv26"
private
```

### Step 2

Provide public methods:

```java id="q0cmqf"
getters
setters
```

---

# Example

```java id="7pq6y6"
class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if(age > 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

---

# Usage

```java id="ywm8u3"
Student s = new Student();

s.setName("Ishan");

s.setAge(18);

System.out.println(s.getName());

System.out.println(s.getAge());
```

Output:

```text id="t2wfjw"
Ishan
18
```

---

# Memory Representation

```text id="jlwm8r"
STACK

s
 |
 |
 v

HEAP
---------------------------------
private name = "Ishan"
private age  = 18
---------------------------------
```

Outside code cannot directly access private data.

---

# Getters

Getter methods are used to read private data.

Example:

```java id="w5vlce"
public String getName() {
    return name;
}
```

Naming convention:

```text id="m0v4ut"
getVariableName()
```

Examples:

```java id="s4qgll"
getName()

getAge()

getSalary()
```

---

# Setters

Setter methods are used to modify private data.

Example:

```java id="u5sw3k"
public void setAge(int age) {
    this.age = age;
}
```

Naming convention:

```text id="xenpnn"
setVariableName()
```

Examples:

```java id="8jlwm8"
setName()

setAge()

setSalary()
```

---

# Validation using Setters

Big advantage of encapsulation.

Example:

```java id="2g5d53"
public void setAge(int age) {

    if(age >= 0)
        this.age = age;
}
```

Invalid values can be prevented.

---

# Another Example

```java id="jws0wx"
class BankAccount {

    private double balance;

    public void deposit(double amount) {

        if(amount > 0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

---

# Benefits of Encapsulation

## 1. Data Hiding

Sensitive data remains protected.

---

## 2. Better Security

Users cannot directly modify data.

---

## 3. Validation

Invalid values can be prevented.

---

## 4. Flexibility

Internal implementation can change without affecting users.

---

## 5. Maintainability

Code becomes easier to manage.

---

# Fully Encapsulated Class

A class is fully encapsulated if:

```text id="6bl4qf"
✓ All variables are private.
✓ Access through getters/setters.
```

Example:

```java id="ahkhhz"
class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

---

# Read Only Class

Only getters.

```java id="z0iij0"
private int id;

public int getId() {
    return id;
}
```

Data cannot be modified.

---

# Write Only Class

Only setters.

```java id="wbj8x1"
private String password;

public void setPassword(String password) {
    this.password = password;
}
```

Data cannot be read.

---

# Encapsulation vs Abstraction

| Encapsulation          | Abstraction                      |
| ---------------------- | -------------------------------- |
| Hides data             | Hides implementation             |
| Uses private variables | Uses abstract classes/interfaces |
| Focus on security      | Focus on simplicity              |

---

# Example Without Encapsulation

```java id="q1khl1"
class Student {

    public int age;
}
```

Problem:

```java id="q8u4f3"
s.age = -100;
```

Invalid.

---

# Example With Encapsulation

```java id="m6gm6h"
class Student {

    private int age;

    public void setAge(int age) {

        if(age >= 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

Protected from invalid data.

---

# Java Beans Convention

A Java Bean class:

```text id="ev1jmx"
✓ Private variables
✓ Public getters/setters
✓ Public constructor
```

Example:

```java id="zy79yl"
class Employee {

    private String name;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

Frameworks like Spring and Hibernate use this heavily.

---

# Complete Example

```java id="3a0g3f"
class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        if(age > 0)
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Ishan");
        s.setAge(18);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
```

Output:

```text id="0uhx4r"
Ishan
18
```

---

# Summary

```text id="9mlgmx"
Encapsulation
↓
Data Hiding
↓
private variables
+
public methods
```

---

# Steps to Implement

```text id="sxm6b7"
1. Make variables private.
2. Create public getters.
3. Create public setters.
4. Add validation if needed.
```

---

# Advantages

```text id="33xibg"
✓ Security
✓ Validation
✓ Flexibility
✓ Maintainability
✓ Data Hiding
```

---

# Easy Formula

```text id="wrv3iv"
Private Data
+
Public Access Methods
=
Encapsulation
```
