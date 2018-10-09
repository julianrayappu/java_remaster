package Fundamentals;

import java.lang.System;

class ReferenceType {
	int m_value = 999;

	String getValue() { return new Double(m_value).toString(); }
}

public class Types {

	public static void main(String[] args) {
		String[] primitiveTypes = {	"1 boolean 	-  x",  
									"2 byte 	-  8", 
									"3 char 	- 16", 
									"4 short 	- 16", 
									"5 int 		- 32", 
									"6 long 	- 64",
									"7 float 	- 32",
									"8 double 	- 64" };

		System.out.println("Primitive types are: ");
		for(String s: primitiveTypes) {
			System.out.println(s + ", ");	
		}
		System.out.println("]");

		// primitive types are stored on the stack
		int number = 990087614;
		System.out.println("Variable number has value " + number); 
		System.out.println("We cannot find out the primitive type's address!");

		System.out.println();

		// non-primitive (reference) objects are stored on the heap
		ReferenceType reference = new ReferenceType();
		System.out.println("reference is stored @ " + reference);
		System.out.println("reference has value " + reference.getValue());

		ReferenceType nullRef = null;
		System.out.println("nullRef is stored @ " + nullRef);
		
		// NullPointerException thrown when 
		// getValue() is called on a null reference
		System.out.println("nullRef has value " + nullRef.getValue()); 
	}
}