class Teststringcomparision{
 public static void main(String args[]){
 String str1 = "apple";
 String str2 = "banana";
 String str3 = "apple";

 int result1 = str1.compareTo(str2);
 int result2 = str1.compareTo(str3);

 System.out.println(result1); // prints a negative integer, since "apple" comes before "banana" lexicographically
 System.out.println(result2); // prints 0, since "apple" is equal to "apple"
}}
