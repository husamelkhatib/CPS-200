<h1>Handbook on Programming in Java </h1>

**CPS-200 UW-Whitewater 2025**

Husam El-Khatib

<!-- This is a comment (which will not be displayed in the live file);
replace all "???" with your own text. -->




___





<h1>Table of Contents</h1>

- [1. Compiling and Running](#1-compiling-and-running)
- [2. Data Types](#2-data-types)
- [3. Console I/O](#3-console-io)
- [4. Arithmetic Operations](#4-arithmetic-operations)
- [5. Assignment Operations](#5-assignment-operations)
- [6. Comments](#6-comments)
- [7. Decision Structures](#7-decision-structures)
- [8. Conditional Operators](#8-conditional-operators)
- [9. Logic Operators](#9-logic-operators)
- [10. Advanced Decision Structures](#10-advanced-decision-structures)
- [11. String Methods](#11-string-methods)
- [12. Random Generation](#12-random-generation)
- [13. Looping Structures](#13-looping-structures)
- [14. Functions/Methods](#14-functionsmethods)
- [15. Elementary Data Structures](#15-elementary-data-structures)
    - [15.1 Arrays/Lists](#151-arrayslists)
    - [15.2 Matrices](#152-matrices)
- [References](#references)

<!-- 
- [16. Major Keywords](#16-major-keywords)
- [17. Error Handling](#17-error-handling)
- [18. Working with Files](#18-working-with-files)
- [19. Major Language Features](#19-major-language-features)
  - [19.1 Classes](#191-classes)
  - [19.2 Inheritance](#192-inheritance)
  - [19.3 Generic Typing (Templates)](#193-generic-typing-templates)
  - [19.4 Pointers](#194-pointers)
- [20. Importing Local Libraries](#20-importing-local-libraries)
- [21. Working with Time](#21-working-with-time)
- [22. Importing Libaries from Package managers](#22-importing-libaries-from-package-managers)
- [23. Bitwise Operators](#23-bitwise-operators)
- [24. Common Data Structures](#24-common-data-structures)
- [25. Advanced Language Features](#25-advanced-language-features)
-->




___





# Compiling and Running Java Programs

## 1.1 Compiling a Java Program

Java programs are written in plain text files with a `.java` extension. Before executing a Java
program, it must be compiled into bytecode, a Java Virtual Machine (JVM) can do this for you.

### Steps to Compile a Java Program:

1. **Write the Java Code**
    - Create a file named `HelloWorld.java` and input the following:
      ```java
      public class HelloWorld {
          public static void main(String[] args) {
              System.out.println("Hello, World!");
          }
      }
      ```
2. **Open a Terminal or Command Prompt**
    - Navigate to the directory containing `HelloWorld.java`.
3. **Compile the Java File**
    - Run the following command:
      ```sh
      javac HelloWorld.java
      ```
    - This will generate a `HelloWorld.class` file, which contains bytecode.
   (in most cases you can just find the run button and click that instead, but there are a few cases
   where using shell may help you and make things easier)

## 1.2 Understanding Compilation Errors

When compiling a Java program, errors may occur due to syntax mistakes or incorrect usage of different 
things in the Java language.

### Common Compilation Errors:

- **Syntax Errors**: Missing semicolons, unmatched braces, or incorrect keywords.
- **Type Errors**: Assigning values of the wrong type.
- **Undefined Variables**: Using variables before declaring them.
- **Method Errors**: Calling a method that doesn't exist or passing incorrect arguments.
- **Access Modifiers**: Trying to access private methods or fields from outside the class.

### Example Error:

```java
public class Example {
    public static void main(String[] args) {
        System.out.println("Hello World") // Missing semicolon
    }
}
```

#### Output:

```
Example.java:3: error: ';' expected
        System.out.println("Hello World")
                                      ^
1 error
```

## 1.3 Running a Java Program

Once a Java program is compiled successfully, it can be executed using the Java
interpreter.

### Steps to Run a Java Program:

1. **Ensure Compilation is Successful**
    - The `javac` command should not return errors.
2. **Run the Program Using the Java Interpreter**
    - Execute the following command:
      ```sh
      java HelloWorld
      ```
    - This will output:
      ```
      Hello, World!
      ```

### Common Runtime Errors:

- **Exception Handling**: Runtime exceptions such as `NullPointerException` 
and `ArrayIndexOutOfBoundsException`.
- **File Not Found**: Trying to read a file that doesn’t exist.
- **Memory Errors**: Running out of memory due to large data structures or 
infinite loops.

## 1.4 IDEs (Integrated Development Environments)

IDEs provide an efficient environment for Java development, offering features 
such as syntax highlighting, debugging tools, and code suggestions.

### Popular Java IDEs:

1. **Eclipse**
    - Free and widely used.
    - Supports plugins for advanced development.
2. **IntelliJ IDEA**
    - Preferred for enterprise-level development.
    - Has a free Community Edition and a paid Ultimate Edition.
3. **NetBeans**
    - Good for beginners.
    - Supports a variety of languages besides Java.
4. **VS Code with Java Extensions**
    - Lightweight alternative.
    - Requires Java extensions for full functionality.

### Benefits of Using an IDE:

- **Code Completion**: Helps write code faster with intelligent suggestions.
- **Debugging Tools**: Allows setting breakpoints and inspecting variables.
- **Project Management**: Organizes files and dependencies efficiently.
- **Integrated Compilation & Execution**: Simplifies the process of running 
Java programs.

Using an IDE can significantly improve productivity and reduce errors in Java 
development.



# 2. Data Types

Data types in Java are essential for defining the kind of data that variables can
hold. Java provides a lot of built-in data types, each designed to store 
specific types of information. Understanding data types is fundamental to writing
Java programs effectively.

## 2.1 Common Data Types

### 2.1.1 `int`: Integer
The `int` data type is used to store signed 32-bit integer values. It can represent
both positive and negative whole numbers.

Example:
```java
int age = 25;

```
### 2.1.2 `double`: Double-Precision Floating-Point
The `double` data type is used to store double-precision floating-point numbers, 
which are decimal numbers with high precision.

Example:
```java
double pi = 3.14159265358979;

```
### 2.1.3 `float`: Floating-Point
The `float` data type is used to store numbers that don't require extreme precision,
when you need to save on storage, or you are bound by processing power, you can use 
`float` rather than `double`.
```java
float pi = 3.1415926;

```
### 2.1.4 `String`: String
The `String` data type is used to store sequences of characters, such as text. 
Strings are enclosed in double quotes.

Example:
```java
String greeting = "Hello, World!";

```
### 2.1.5 `boolean`: Boolean
The `boolean` data type represents Boolean values, which can be either `true` or 
`false`. Booleans are used for logical operations and conditional statements.

Example:
```java
boolean isRaining = true;

```
### 2.1.6 `char`: Character
The `char` data type is used to store a single Unicode character. Characters are 
enclosed in single quotes.

Example:
```java
char grade = 'A';

```
### 2.1.7 `BigDecimal`: Decimal
The `BigDecimal` data type is used to store decimal numbers with high precision. It 
is often used in financial calculations where accuracy is crucial.

Example:

```java
import java.math.BigDecimal;

BigDecimal price = 19.99;

```
### 2.1.8 `byte`: Byte
The `byte` data type is used to store unsigned 8-bit integer values, ranging from 
0 to 255.

Example:
```java
byte redValue = 255;

```
## 2.2 Declaring Variables
To declare a variable, you specify the data type followed by the variable name. 
Variables can hold data of the declared type.

Example:
```java
int numberOfApples;
String playerName;
double temperature;

```
## 2.3 Type Inference (`var` Keyword)
Java allows type inference using the `var` keyword. The compiler determines the 
data type based on the assigned value.

Example:
```java
var itemCount = 10; // Compiler infers that itemCount is of type int

```
## 2.4 Summary
Understanding and choosing the appropriate data types is essential for efficient
and error-free Java programming. Java provides a range of data types to 
accommodate various types of data, from integers and floating-point numbers to 
String and Boolean values.

