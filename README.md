# java_exercise
This repo is basically based on the exercises given in the book - The Java Programming Language, Ken Arnold, David Holmes, James Gosling, Prakash Goteti, 3rd Edition, Pearson 

## Notes 
Going through the introduction and sumarry, below are my ramblings , session 1 - 10_11_2024

- JAVA Terminology
- Main features of JAVA
- Character set
- Constants and Variables
- Structure of a JAVA program
- Datatypes in JAVA

Java was created via Sun Microsystems in 1991 by James Gosling and Patrick Naughton.
It was later acquired by Oracle. It is an OOPs paradigm based language which supports readability , reusability and modularization. 

Write -> Compile -> Run 

Write in Java 
// Execution phase 
JAVAC is present in JDK , which compiles and converts to Bytecode - which makes a .class file.
JVM takes the Bytecode and provide the needed output by running the Bytecode.

Why is JAVA a platform independent language ? 
Because of JVM being available for download for MAC, Windows and Unix / Linux ( kernel ) , so Java programs can be executed in any platform. 

Components necessary for JAVA - 

	1. JDK ( java development kit ) - this includes JRE , Debugger and other tools related to JAVA ex - JavaDoc ( used for documenting code entities ). 
	2. JRE ( Java Runtime Environment ) - this includes JVM , browser plugins , applets support.
	3. JVM ( Java Virtual Machine ) - this is used to run the .class file ( bytecode after compilation )

![image](https://github.com/user-attachments/assets/f22d8327-e4a0-4907-a684-053b035f71b4)

## Features of JAVA 
PS - No support for pointers

Features of JAVA 
PS - No support for pointers
1. Simple
2. Secure - because of encapsulation and no use of pointers 
3. Robust 
4. Platform independent / Architectural Neutral 
5. Object Oriented 
	a. Inheritance ( Child class / Parent class )
	b. Polymorphism ( Many forms , a guy is a father , employee and a husband )
	c. Abstraction ( Having a bigger picture with no insights, but once extended , we make the plan )
	d. Encapsulation ( Hiding data from MFs )
6. Performance - has garbage collection activity, enabled by Built - in class GC, which helps in improving the overall runtime of the program. 
7. Distributed - Supports RMI ( Remote Method Invocation ) for ex - lets say in your Enterprise landscape you have 2 systems one is RM other MR , from a program written in system - RM, you can call a program written in MR using RMI, if you are an ABAPer it is just like RFC :)
8. Multithreaded - Basically we have this built in class called Thread which we extend and then each thread becomes an independent piece of code which can be executed simultaneously, 
9. Extensibility and Dynamic - Extensibility is via using your own class and methods, extensions. Dynamic is with the help of native functions , native functions are functions written in C / C++ which can be called by Java program .

## Java Character Set 

The character set is a set of alphabets, letters and some special characters that are valid in Java language.
The smallest unit of Java language is the characters needed to write java tokens.
These characters are defined by Unicode character set.

## Tokens in Java  

The Java compiler breaks the line of code into text (words) is called Java tokens. 
These are the smallest element of the Java program. The Java compiler identifies these words as tokens. 

![image](https://github.com/user-attachments/assets/ec7a7352-72e9-418c-9cd2-3c0ff881966d)

## Constants in Java 

Two type of contants - 
1. Numeric constants which further are divided into
   a. Integer ( positive and negative numbers )
   b. Real    ( float and double , basically fractionals )

2. Non Numeric constants , these are further divided into
   a. Characters - max length is 1, and values are enclosed within single 
      apostrophe
   b. Strings - values are enclose within double quotes

![image](https://github.com/user-attachments/assets/23785a34-117a-4208-9abb-b477120b6fc1)


Integer constants - are values that won't change and it will always be negative or positive number values. 

Example - 
1. Decimal - contains numbers from 0 to 9
2. Octal - contains numbers from 0 to 7
3. Hexadecimal - alphanumeric contains numbers from 0 to 9 and characters / alphabets from A to F 

An integer constant , can be negative or positive, if there is no sign specified then it is treated as positive. It can never have a fractional value like ( 0.5 , 0.7, 1.17, etc )

![image](https://github.com/user-attachments/assets/a9d6e968-f4bb-4b3d-887f-ce41c774236d)


