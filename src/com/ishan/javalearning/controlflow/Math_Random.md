# Math Class and Random Class in Java

Java provides two important utilities:

1. **Math Class** → Used for mathematical operations.
2. **Random Class** → Used for generating random values.

---

# 1. Math Class

The `Math` class belongs to the `java.lang` package.

Therefore, no import statement is required.

```java id="qllbng"
double x = Math.sqrt(25);
```

---

# Important Math Methods

---

## Maximum Value

```java id="ntg1m4"
Math.max(10, 20);
```

### Output

```text id="bjh3yv"
20
```

---

## Minimum Value

```java id="z5v2in"
Math.min(10, 20);
```

### Output

```text id="gzvkzy"
10
```

---

## Power Function

```java id="bd2ytg"
Math.pow(2, 3);
```

### Output

```text id="0kto4m"
8.0
```

---

## Square Root

```java id="ebmxsz"
Math.sqrt(25);
```

### Output

```text id="x9l1fr"
5.0
```

---

## Absolute Value

Returns positive value.

```java id="f7j6hl"
Math.abs(-10);
```

### Output

```text id="4p7v3j"
10
```

---

## Ceiling Function

Returns the smallest integer greater than or equal to the number.

```java id="gsktv3"
Math.ceil(4.2);
```

### Output

```text id="7a9d5g"
5.0
```

---

## Floor Function

Returns the largest integer smaller than or equal to the number.

```java id="o2d0ad"
Math.floor(4.9);
```

### Output

```text id="6ckr64"
4.0
```

---

## Round Function

```java id="tz0c8r"
Math.round(4.6);
```

### Output

```text id="9g7tfh"
5
```

---

# Mathematical Constants

---

## PI

```java id="4l8z5h"
Math.PI
```

### Output

```text id="jqx4wb"
3.141592653589793
```

---

## Euler Number

```java id="4f0xwa"
Math.E
```

### Output

```text id="x1f8ly"
2.718281828459045
```

---

# Trigonometric Functions

---

## Sine

```java id="f7styo"
Math.sin(Math.toRadians(90));
```

### Output

```text id="30ghy8"
1.0
```

---

## Cosine

```java id="n0wx1m"
Math.cos(Math.toRadians(0));
```

### Output

```text id="6vhkkd"
1.0
```

---

## Tangent

```java id="g6uqtl"
Math.tan(Math.toRadians(45));
```

### Output

```text id="57v7ep"
1.0
```

---

# Logarithmic Functions

---

## Natural Log

```java id="6v2v3n"
Math.log(10);
```

---

## Base 10 Log

```java id="9ic7r0"
Math.log10(100);
```

### Output

```text id="i1u03k"
2.0
```

---

# Math.random()

Generates a random decimal number.

```java id="m0cbl7"
double num = Math.random();
```

Range:

```text id="4m04tn"
0.0 <= value < 1.0
```

---

## Generate Random Number from 1 to 100

```java id="j2ol8n"
int num =
        (int)(Math.random() * 100) + 1;
```

---

# 2. Random Class

Package:

```java id="s6oxn6"
import java.util.Random;
```

---

## Creating Random Object

```java id="11cln7"
Random random = new Random();
```

---

# Random Methods

---

## Random Integer

```java id="m65ajw"
int num = random.nextInt();
```

Generates any integer.

---

## Integer from 0 to 99

```java id="g9fpm4"
int num = random.nextInt(100);
```

Range:

```text id="rhl6kk"
0 to 99
```

---

## Random Double

```java id="y7qkho"
double d = random.nextDouble();
```

Range:

```text id="f3h14x"
0.0 <= value < 1.0
```

---

## Random Float

```java id="mt93y8"
float f = random.nextFloat();
```

---

## Random Boolean

```java id="eq5a6f"
boolean b = random.nextBoolean();
```

Output:

```text id="3djg6s"
true or false
```

---

# Random Number in a Range

Formula:

```text id="mp5al2"
random.nextInt(max - min + 1) + min
```

---

## Example: 1 to 100

```java id="fg6f2j"
int num =
        random.nextInt(100) + 1;
```

---

## Example: 50 to 100

```java id="of3bpf"
int num =
        random.nextInt(100 - 50 + 1) + 50;
```

---

## Example: Dice Simulation

```java id="o1i3ub"
int dice =
        random.nextInt(6) + 1;
```

Range:

```text id="gh4s8v"
1 to 6
```

---

## Example: OTP Generation

```java id="67gn77"
int otp =
        random.nextInt(9000) + 1000;
```

Range:

```text id="5dh0rj"
1000 to 9999
```

---

## Example: 6 Digit Password

```java id="b4s6of"
int password =
        random.nextInt(900000) + 100000;
```

Range:

```text id="v4bh6n"
100000 to 999999
```

---

# Math Class vs Random Class

| Feature                    | Math Class  | Random Class |
| -------------------------- | ----------- | ------------ |
| Package                    | `java.lang` | `java.util`  |
| Import Required            | ❌ No        | ✅ Yes        |
| Mathematical Functions     | ✅ Yes       | ❌ No         |
| Random Numbers             | Limited     | ✅ Yes        |
| Generates Boolean          | ❌ No        | ✅ Yes        |
| Generates Integer Directly | ❌ No        | ✅ Yes        |

---

# Summary

## Math Class

Used for:

```text id="vvrlrl"
max()
min()
pow()
sqrt()
abs()
ceil()
floor()
round()
PI
E
sin()
cos()
tan()
log()
random()
```

---

## Random Class

Used for:

```text id="8yk2yi"
nextInt()
nextDouble()
nextFloat()
nextBoolean()
```

---

# Easy Formula to Remember

### Random Number in Range

```text id="w7v77h"
random.nextInt(max - min + 1) + min
```

Examples:

```text id="ls1f7w"
1 to 100
↓

random.nextInt(100) + 1


50 to 100
↓

random.nextInt(51) + 50
```
