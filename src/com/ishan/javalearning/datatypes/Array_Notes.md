# Arrays in Java - Memory, Stack, Heap Notes

## 1. Arrays are Reference Types

In Java, arrays are **non-primitive reference types**.

```java
int[] arr = new int[5];
```

This is similar to:

```java
ArrayObject arr = new ArrayObject();
```

The variable `arr` does not store the actual array values. It stores a **reference (memory address)** to the array object created in the Heap.

---

# 2. Stack and Heap Memory

## Example 1

```java
int[] arr = new int[5];
```

### Memory Representation

```text
STACK                          HEAP
------                         -------------------
arr -------------------------> [0, 0, 0, 0, 0]
```

### Important Points

* `arr` reference variable is stored in the **Stack**.
* Actual array object is stored in the **Heap**.
* Java automatically initializes array elements with default values.

---

# 3. Multiple References to the Same Array

## Example

```java
int[] a = {10, 20, 30};
int[] b = a;
```

### Memory Representation

```text
STACK

a --------\
           \
            ------> [10, 20, 30]
           /
b --------/
```

Both `a` and `b` point to the **same array object** in memory.

### Example

```java
b[0] = 100;

System.out.println(a[0]);
```

### Output

```text
100
```

### Reason

Since both references point to the same object, changing the array through one reference affects the other.

---

# 4. Default Values of Arrays

When an array is created using `new`, Java automatically initializes its elements.

```java
int[] a = new int[3];
double[] b = new double[3];
boolean[] c = new boolean[3];
String[] d = new String[3];
char[] e = new char[3];
```

| Data Type | Default Value |
| --------- | ------------- |
| byte      | 0             |
| short     | 0             |
| int       | 0             |
| long      | 0L            |
| float     | 0.0f          |
| double    | 0.0           |
| boolean   | false         |
| char      | '\u0000'      |
| String    | null          |

---

# 5. 2D Arrays in Java

## Example

```java
int[][] arr = new int[2][3];
```

### Memory Representation

```text
STACK

arr
 |
 v

HEAP
---------------------------------
Row0 --------> [0, 0, 0]
Row1 --------> [0, 0, 0]
---------------------------------
```

### Important Points

* Java does not create a true matrix internally.
* A 2D array is actually an **array of arrays**.
* Each row itself is a separate array object.

---

# 6. Array Indexing

## Example

```java
int[] arr = {10, 20, 30};
```

### Index Representation

```text
Value : 10   20   30
Index :  0    1    2
```

Accessing elements:

```java
arr[0]; // 10
arr[1]; // 20
arr[2]; // 30
```

---

# 7. Array Index Out Of Bounds

```java
arr[3];
```

### Exception

```text
ArrayIndexOutOfBoundsException
```

Reason:

The valid indexes are from:

```text
0 to arr.length - 1
```

---

# 8. Difference Between C++ and Java Arrays

## C++

```cpp
int arr[5];
```

Output:

```text
Garbage Values
```

because memory is not automatically initialized.

---

## Java

```java
int[] arr = new int[5];
```

Output:

```text
0 0 0 0 0
```

because Java automatically initializes array elements.

---

# 9. Memory Summary

## Stack

Stores:

* Local variables
* Method calls
* References (addresses)

Example:

```java
int[] arr = new int[5];
```

```text
STACK
------
arr → address
```

---

## Heap

Stores:

* Objects
* Arrays
* Collections
* Strings created using `new`

Example:

```text
HEAP
------
[0, 0, 0, 0, 0]
```

---

## String Pool

A special area inside the Heap used only for String literals.

Example:

```java
String s = "Hello";
```

```text
HEAP
│
├── Objects
├── Arrays
└── String Pool
      └── "Hello"
```

Purpose:

* Avoid duplicate strings.
* Save memory.
* Improve performance.

---

# Final Summary

```text
STACK
↓
Stores variables and references.

HEAP
↓
Stores actual objects and arrays.

STRING POOL
↓
Special area inside Heap for String literals.
```

### Example

```java
int[] arr = new int[5];
```

Memory:

```text
STACK                    HEAP
------                   ------------------
arr -------------------> [0,0,0,0,0]
```

Therefore:

* Arrays are objects.
* Array variables store references.
* Actual data is stored in the Heap.
* Multiple references can point to the same array object.

# Why Do We Pass Array Length in C++ but Not in Java?

## 1. C++ Arrays

### Example

```cpp
int arr[] = {10, 20, 30};

display(arr, 3);
```

Function:

```cpp
void display(int arr[], int n)
{
    for(int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}
```

Internally, this becomes:

```cpp
void display(int* arr, int n)
```

### Important Point

In C++, when an array is passed to a function, it **decays into a pointer**.

The pointer only stores the address of the first element.

### Memory Representation

```text
arr
 ↓
+----+----+----+
| 10 | 20 | 30 |
+----+----+----+
```

The pointer does **not know**:

* How many elements exist.
* Where the array ends.

Therefore, we must pass the size separately.

```cpp
display(arr, 3);
```

---

## sizeof Problem

```cpp
void display(int arr[])
{
    cout << sizeof(arr);
}
```

Output:

```text
8
```

(Usually 8 bytes on a 64-bit system.)

Reason:

`arr` is treated as:

```cpp
int* arr
```

So `sizeof(arr)` gives the size of the pointer, not the entire array.

---

# 2. Java Arrays

### Example

```java
int[] arr = {10, 20, 30};

display(arr);
```

Function:

```java
static void display(int[] arr)
{
    for(int i = 0; i < arr.length; i++)
    {
        System.out.println(arr[i]);
    }
}
```

---

# Why does Java not need the size?

Because Java arrays are **objects**.

The array object itself stores:

1. Elements
2. Length information
3. JVM metadata

---

## Memory Representation

```text
STACK                           HEAP
------                          ------------------------
arr --------------------------> Array Object
                                ------------------------
                                length = 3
                                data = [10,20,30]
                                ------------------------
```

Thus:

```java
arr.length
```

works because the length is stored inside the array object.

---

# Conceptual Representation

Java internally behaves somewhat like:

```java
class ArrayObject
{
    int length;
    int[] data;
}
```

This is not actual JVM code, but it helps in understanding.

---

# C++ vs Java Memory

## C++

```cpp
int arr[5];
```

Memory:

```text
+----+----+----+----+----+
|    |    |    |    |    |
+----+----+----+----+----+
```

When passed to a function:

```cpp
int* arr
```

Only the address of the first element is passed.

No size information is available.

---

## Java

```java
int[] arr = new int[5];
```

Memory:

```text
Array Object
---------------------------------
length = 5
data = [0,0,0,0,0]
---------------------------------
```

The length is stored together with the array.

---

# Comparison Table

| Feature                         | C++ Array | Java Array     |
| ------------------------------- | --------- | -------------- |
| Array is an object              | ❌ No      | ✅ Yes          |
| Stores length information       | ❌ No      | ✅ Yes          |
| Passed to function as           | Pointer   | Reference      |
| Need separate size parameter    | ✅ Yes     | ❌ No           |
| `sizeof(arr)` works in function | ❌ No      | Not required   |
| Built-in length property        | ❌ No      | ✅ `arr.length` |

---

# Function Comparison

## C++

```cpp
void display(int arr[], int n)
{
    for(int i = 0; i < n; i++)
    {
        cout << arr[i];
    }
}
```

---

## Java

```java
static void display(int[] arr)
{
    for(int i = 0; i < arr.length; i++)
    {
        System.out.println(arr[i]);
    }
}
```

---

# Final Summary

```text
C++
↓

Array → Pointer → No size information
Therefore, size must be passed separately.


Java
↓

Array → Object → Stores its own length
Therefore, arr.length can be used directly.
```

### Easy Way to Remember

```text
C++ Arrays
= Low-level memory blocks.

Java Arrays
= Objects with extra information (length + metadata).
```
