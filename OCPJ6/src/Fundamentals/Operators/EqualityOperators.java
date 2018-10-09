
package Fundamentals.Operators;

public class EqualityOperators {

	// Operators are == and !=
	//
	// Applies to all operand types (i.e. primitive and references)
	//
	// For primitive operands it checks for VALUE equality
	//		For boolean operands a simple logical equality check is performed
	//		For numeric operands, arithmetic promotion will occur first if necessary
	//			then the values are compared
	//
	// For reference types it checks for REFERENCE equality, meaning that
	// 		it checks whether the references refer to the same object or not
	//
	// Returns boolean TRUE or FALSE 

	public static void main(String[] args) {

		boolean bTrue = true, bFalse = false;
		log("==", bTrue, bFalse, bTrue == bFalse);

		char a1 = 'a';
		char b1 = 'b';

		char a2 = 'a';
		char b2 = 'b';

		log("==", a1, a2, a1 == a2);
		log("!=", a1, a2, a1 != a2);
		log("==", a1, b1, a1 == b1);
		log("!=", a1, b1, a1 != b1);

		int one = 1;
		int two = 2;
		int inta = 97;
		log("==", one, two, one == two);
		log("!=", inta, a1, inta != a1);

		double dOne = 1.0;
		double d97  = 97.0;
		log("==", one, dOne, one == dOne);
		log("==", a1, d97, a1 == d97);
		log("==", d97, inta, d97 == inta);

		String s1 = new String("newly created string"); // new String created
		String s2 = new String("newly created string"); // another new String. Different object from line above
		log("==", s1, s2, s1 == s2);
		log("!=", s1, s2, s1 != s2);

		String hello1 = "Hello"; // JVM creates String object from literal
		String hello2 = "Hello"; // JVM reuses same String object as above, since String literal
		log("==", hello1, hello2, hello1 == hello2); // expect TRUE since JVM allocates 
													 // the same string for hello1 and hello2
	}

	private static void log(String operation, Object left, Object right, boolean result) {
		System.out.println("Equality: (" + left + " " + operation + " " + right + ") = " + result);
	}

	/**
	 * The below log(..) methods are not needed for accurate log display of boolean, char values, integer or decimal operands
	 * This is because auto-boxing will convert the types to following Java object types (i.e. auto-boxing) :
	 * 		Boolean, Byte, Char, Short, Integer, Long, Float, Double, 
	 *		which all match the method signature using the Object parameter
	 *

	private static void log(String operation, boolean left, boolean right, boolean result) {
		System.out.println("Equality: (" + left + " " + operation + " " + right + ") = " + result);
	}

	private static void log(String operation, char left, char right, boolean result) {
		System.out.println("Equality: (" + left + " " + operation + " " + right + ") = " + result);
	}

	private static void log(String operation, long left, long right, boolean result) {
		System.out.println("Equality: (" + left + " " + operation + " " + right + ") = " + result);
	}

	private static void log(String operation, double left, double right, boolean result) {
		System.out.println("Equality: (" + left + " " + operation + " " + right + ") = " + result);
	}
	*/

}
