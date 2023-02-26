class Example{
 public static void main(String args[]){
 
   String s1="Srihitha";
   String s2="Srihitha";
   String s3=new String("Srihitha");
   String s4="Koneti";

   System.out.println(s1.equals(s2));                 //true
   System.out.println(s1.equals(s3));                 //true
   System.out.println(s1.equals(s4));                 //false
 }
}
