# Dynamic Objects in C++ OOP

# Introduction

In C++, objects can be created in two ways:

1. **Static Object Creation (Stack Memory)**
2. **Dynamic Object Creation (Heap Memory)**

Unlike Java, C++ gives us both options.

---

# 1. Static Object Creation

```cpp
Student s1;
```

Memory:

```text
STACK
-----------------
name
age
-----------------
```

The entire object is stored directly in the stack.

Access members using:

```cpp
s1.name = "Ishan";
s1.study();
```

Dot (`.`) operator is used.

---

# 2. Dynamic Object Creation

Syntax:

```cpp
ClassName* ptr = new ClassName();
```

Example:

```cpp
Student* s1 = new Student();
```

Memory:

```text
STACK                          HEAP
------                         ----------------
s1 ------------------------->  Student Object
                                name
                                age
                               ----------------
```

### Important

```text
Pointer variable → Stack
Actual Object → Heap
```

---

# Accessing Members

Since `s1` is a pointer:

```cpp
s1->name = "Ishan";

s1->study();
```

---

# Arrow Operator (`->`)

This:

```cpp
s1->name
```

is actually shorthand for:

```cpp
(*s1).name
```

Example:

```cpp
(*s1).age = 18;
```

Both are equivalent.

---

# Complete Example

```cpp
#include<iostream>
using namespace std;

class Student {

public:

    string name;
    int age;

    void study() {
        cout << name << " is studying";
    }
};

int main() {

    Student* s1 = new Student();

    s1->name = "Ishan";
    s1->age = 18;

    s1->study();

    delete s1;

    return 0;
}
```

---

# Why Use Dynamic Objects?

Dynamic objects are useful when:

* Object size is large.
* Number of objects is decided at runtime.
* Objects need to live beyond function scope.
* Dynamic data structures are required.

Examples:

```text
Linked List
Tree
Graph
Trie
Game Objects
Database Records
```

---

# Multiple Dynamic Objects

```cpp
Student* s1 = new Student();
Student* s2 = new Student();
```

Memory:

```text
STACK

s1 --------\
             \
              -----> Object1
             /
s2 --------> Object2
```

Each pointer points to a separate heap object.

---

# Dynamic Arrays of Objects

```cpp
Student* arr = new Student[5];
```

Memory:

```text
STACK

arr -------------------->

HEAP
-------------------------------------
Student0
Student1
Student2
Student3
Student4
-------------------------------------
```

Access:

```cpp
arr[0].name = "Ishan";

arr[1].name = "Rahul";
```

---

# Object References

```cpp
Student* s1 = new Student();

Student* s2 = s1;
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

Both pointers point to the same object.

Example:

```cpp
s2->name = "Rahul";

cout << s1->name;
```

Output:

```text
Rahul
```

because both pointers refer to the same object.

---

# Memory Leak

```cpp
Student* s1 = new Student();
```

If we forget:

```cpp
delete s1;
```

the heap memory remains occupied.

This is called a:

```text
Memory Leak
```

---

# Deleting Dynamic Objects

```cpp
delete s1;
```

For arrays:

```cpp
delete[] arr;
```

---

# Dangling Pointer

```cpp
Student* s1 = new Student();

delete s1;
```

Now:

```cpp
s1
```

still stores the old address.

This is called a:

```text
Dangling Pointer
```

Solution:

```cpp
delete s1;

s1 = nullptr;
```

---

# nullptr

```cpp
Student* s1 = nullptr;
```

Means:

```text
Pointer points to nothing.
```

---

# Comparison with Java

### C++

```cpp
Student* s1 = new Student();
```

Memory:

```text
STACK
s1 (Pointer)

HEAP
Student Object
```

---

### Java

```java
Student s1 = new Student();
```

Memory:

```text
STACK
s1 (Reference)

HEAP
Student Object
```

Java internally behaves similarly to dynamic C++ objects.

---

# Main Differences

| Feature               | Dynamic C++ | Java     |
| --------------------- | ----------- | -------- |
| Uses pointers         | ✅ Yes       | ❌ Hidden |
| Uses `new`            | ✅ Yes       | ✅ Yes    |
| Need `delete`         | ✅ Yes       | ❌ No     |
| Garbage Collection    | ❌ No        | ✅ Yes    |
| Memory Leaks possible | ✅ Yes       | Rare     |
| Arrow operator (`->`) | ✅ Yes       | ❌ No     |

---

# Visualization

```cpp
Student* s1 = new Student();
```

Memory:

```text
STACK

s1
 |
 |
 v

HEAP
------------------
name = "Ishan"
age  = 18
------------------
```

---

# Summary

```text
Static Object
↓
Stored directly in Stack

Dynamic Object
↓
Stored in Heap

Pointer
↓
Stored in Stack

Pointer + new
↓
Creates Heap Object

delete
↓
Frees Heap Memory
```

---

# Easy Formula

```text
Student s1;
↓
Object in Stack


Student* s1 = new Student();
↓
Pointer in Stack
Object in Heap
```

---

# Relation with Java

```text
Dynamic C++ Object
≈
Java Object Creation
```

Because Java objects are always created in Heap and variables store references, similar to:

```cpp
Student* s1 = new Student();
```
