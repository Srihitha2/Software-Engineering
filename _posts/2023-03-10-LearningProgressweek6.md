---
title: "Weekly Progress"
date: 2023-03-10
---
For this week of my preparation, I have continued my learning with java inheritance, polymorphism and practiced some codes related to control statements.
Here is the example code for java inheritance.[VehicleInheritance](https://github.com/Srihitha2/Software-Engineering/blob/main/codes/InheritanceExample.java)
In this code it defines a Vehicle class with a start() and stop() method and a Car class which inherits from Vehicle. The Car class has an additional honk() method and a numDoors. The Main class creates an instance of Car and calls methods from both the Vehicle and Car classes.
#The output of the above code is:
Make: Toyota
Model: Camry
Year: 2021
The vehicle is starting.
The vehicle is stopping.
Number of doors: 4
The car is honking.

*POLYMORPHISM:*
Polymorphism in Java is the ability of an object to take on multiple forms. It occurs when we have many classes that are related to each other by inheritance. In Java, inheritance allows a subclass to inherit attributes and methods from its superclass. Polymorphism, on the other hand, allows an object to take on multiple forms and use those inherited methods to perform different tasks. As a result, we can perform a single action in different ways depending on the context, which makes code more flexible and reusable.
There are two types of polymorphism in Java:
1. Compile-time polymorphism
Compile-time polymorphism is achieved using "method overloading". Method overloading allows a class to have multiple methods with the same name, but with different parameters. The Java compiler determines which method to call based on the arguments passed to the method at compile time.
Here is an example code for compile-time polymorphism. [Compile-time-Polymorphism](https://github.com/Srihitha2/SoftwareEngineering/blob/main/codes/Compiletime_poly.java). This code defines a MathOperations class with two add() methods: one that takes two int arguments and returns an int, and another that takes two double arguments and returns a double. In the Main class, we create an instance of MathOperations and call both methods with different arguments.
#The respected output is as follows:
Sum of integers: 7
Sum of doubles: 7.7

2. Runtime polymorphism:
