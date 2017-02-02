/*Java uses primitive types such as int, double or float to hold the basic data types for the sake 
of performance. Despite the performance benefits offered by the primitive types, there are 
situation when you will need an object representation. For example, many data structures in 
Java operate on objects, so you cannot use primitive types with those data structures. 
To handle these situations Java provides type Wrappers which provide classes that encapsulate a
primitive type within an object.

Whenever we use object of Wrapper class in an expression, automatic unboxing and boxing is 
done by JVM.


Autoboxing and Unboxing features was added in Java5.
Autoboxing is a process by which primitive type is automatically encapsulated(boxed) into
its equivalent type wrapper
Auto-Unboxing is a process by which the value of object is automatically extracted from a 
type wrapper.*/

public class AutoboxingUnboxing {
		 public static void main(String[] args)
		 {
		  Integer iob = 100;      //Autoboxing of int
		  int i = iob;          //unboxing of Integer
		  System.out.println(i+" "+iob);

		  Character cob = 'a';       //Autoboxing of char
		  char ch = cob;            //Auto-unboxing of Character
		  System.out.println(cob+" "+ch);
		 }
}
