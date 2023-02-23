---
title: "Week 4 Learning Progress"
date: 2023-02-22
---
In the fourth week of my preparation, I have started with learning Strings and Arrays. In Java, a string is an object that represents a sequence of characters. Strings are commonly used to represent and handle textual data, such as names, addresses, messages, and any other kind of information that can be expressed as a sequence of characters and are represented by the "String" class. Strings are "immutable", which means that once a string object is created, its value cannot be changed. If we want to modify a string then modifying will not actually change the original string, but instead create a new string object with that modified value.
Syntax: <String_Type> <string_variable> = "<sequence_of_string>"; For example, String str = "Hello World!"; This creates a new string object with the value "Hello World!" and assigns it to the variable str.
To create a string object we use 'java.lang.String' class.
There are two ways to create String object:
a. By string literal- String literal is created by using double quotes.
For example, String s="Hello!";  
b. By new keyword- String s = new String (“Hello!”);
This syntax creates a new string object using the String constructor and assigns it to the variable s.
In Java, the new keyword is used to create a new object of a class. When you use the new keyword, Java allocates memory for the object and returns a reference to it, which you can assign to a variable or use directly.
For example, Person person = new Person(); In this example, the new keyword creates a new Person object and assigns a reference to it to the variable person. You can then use this reference to access the properties and methods of the Person object.
In Java, the String class provides a rich set of methods for working with strings. Here are some commonly used String methods:
1.length(): returns the length of the string.
String str = "Hello";
int len = str.length(); 
output: len = 5
2.charAt(int index): returns the character at the specified index in the string.
String str = "Hello";
char ch = str.charAt(1);     //index=1
output: ch = 'e'
3.substring(int beginIndex, int endIndex): returns a new string that is a substring of the original string, starting from the beginIndex up to (but not including) the endIndex.
String str = "Hello";
String sub = str.substring(1, 4); 
output: sub = "ell"
4.toLowerCase(): returns a new string with all characters converted to lowercase.
String str = "Hello";
String lowerStr = str.toLowerCase();
output: lowerStr = "hello"
5.toUpperCase(): returns a new string with all characters converted to uppercase.
String str = "Hello";
String upperStr = str.toUpperCase();
output: upperStr = "HELLO"
6.replace(char oldChar, char newChar): returns a new string with all occurrences of oldChar replaced with newChar.
String str = "Hello";
String replacedStr = str.replace('l', 'w');
output: replacedStr = "Hewwo"
7.equals(String anotherString): returns true if the string is equal to anotherString, otherwise false.
String str = "Hello";
boolean isEqual = str.equals("Hello");
output: isEqual = true
8.Concatenating Strings
string1.concat(string2);  //This returns a new string that is string1 with string2 added to it at the end.
