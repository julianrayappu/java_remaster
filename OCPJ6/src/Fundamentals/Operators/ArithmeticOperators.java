
package Fundamentals.Operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		CompoundAssignment();
		Rounding();
		ImplicitCast();
		DecimalLiteral();
		ArithmeticPromotion();
		AdditiveOperators();
	}

	private static void CompoundAssignment() {
		int x = 10;
		float y = 9.0f;

		// x = x * y ;	// COMPILER ERROR : Incompatible type. 
						// 					|-> Lossy conversion: Float -> Int

		x *= y; // compund assignment allows for 
				// AUTOMATIC DOWNCAST to LHS type
		System.out.println("x is " + x);

		int a = 90 ;
		double b = 20.0;

		a /= b ;	// automatic downcast to int, since "int a" on LHS
		System.out.println("a is " + a);


		int c = 5;
		double d = 12;
		d /= c;		// no need for cast since "double d" on LHS
		System.out.println("d is " + d);
	}

	private static void Rounding() {
		int x = 90;
		int y =  8;

		// Loss of value casting
		float z = x / y ; // expect 11.25, but get 11.0 
						  // since x,y have type INT, therefore result is INT
		System.out.println("z = " + z); // 11.0

		// Loss of value casting
		z = (float) (x/y);  // 11.0 since (x/y) is still int
		System.out.println("z = " + z);

		// Correct casting
		z = (float) x / y;  // expected value achieved by casting one var to float
		System.out.println("z = " + z); // 11.25

		// Correct casting
		z = x / (float) y; // 11.25
		System.out.println("z = " + z);		
	}

	private static void ImplicitCast() {
		float a = 12;
		int b   = 10;

		float c = 0.0f ; // numeric literal has auto type of double
						 // (float) 0.0 or 0.0f is an equivalent cast to float
 		c = a / b;		 // a/b results in FLOAT type, so OK, and value = 1.2

		System.out.println("c = " + c);
	}

	private static void DecimalLiteral() {
		double d = 36.0;
		float f = 11.0f;	// numeric literal with decimal places 
							// have type double. For compiler correctness 
							// cast to float by appending 'f' or prepend with '(float)'
		System.out.println("d = " + d);
		System.out.println("f = " + f);
	}

	private static void ArithmeticPromotion() {
		// When arithmetic operations are acted on primitive types smaller than INT
		// (ie. char, byte, short)
		// the result will be promoted to an INT type
		// This notion is known as Arithmetic Promotion

		ArithmeticPromotionForChar();
		ArithmeticPromotionForByte();
		ArithmeticPromotionForShort();
	}

	private static void ArithmeticPromotionForChar() {
		// CHAR
		char aChar, bChar, cChar, dChar;
		aChar = 'a';
		bChar = 'b';
		// dChar = (char) (bChar + bChar) ;
		System.out.println("aChar = " + aChar);
		System.out.println("bChar = " + bChar);
		
		int x = bChar - aChar;
		System.out.println("x = " + x );

		int a = (int) aChar;
		int z = (int) 'z';
		System.out.println("a = " + a + " :: z = " + z);

		int A = (int) 'A';
		int Z = (int) 'Z';
		System.out.println("A = " + A + " :: Z = " + Z);
	}

	private static void ArithmeticPromotionForByte() {
		
	}

	private static void ArithmeticPromotionForShort() {
		// SHORT
		short a, b, c;
		a = 21;
		b = 10;

		// applies to +, -, * and /
		// all types smaller than int are promoted to int

		// c = a + b; // compiler lossy conversion error 
		c = (short) (a+b) ;
		System.out.println("c is " + c);

		// c = a - b; // compiler lossy conversion error 
		int d = a - b;
		System.out.println("d is " + d);

		// c = (short) a - b; // cast to int applies to 'a' only, not to "a - b" 
		// c = ((short) a - (short) b); // this does not help
		c = (short) (a-b); // cast the result / full expression
		System.out.println("c is " + c);

		// c = a * b; // compiler downcast error
		c = (short) (a * b);
		System.out.println("c is " + c);

		c = (short) (a / b)	 ;
		System.out.println("c is " + c);


	}

	private static void AdditiveOperators() {
		// Additive operators are + and -
		// They work on all primitive types (except booleans).
		// Additionally, the + operator works for the String type, enabling String concatenation

		AdditiveOperatorsForBooleans();
		AdditiveOperatorsForStrings();

		// arithmetic promotion applies to additive operators

	}

	static void AdditiveOperatorsForBooleans() {
		// additive operators (+,-) does not apply to booleans
		boolean a, b;
		a = true;
		b = true;

		int x = 1;
		int c = 0;

		// c = (a + b); // compiler error, since arithmetic operators do not any accept boolean operand
		// c = (x - a); // compiler error, since arithmetic operators do not any accept boolean operand
		System.out.println("c is " + c);
	}

	private static void AdditiveOperatorsForStrings() {
		short a = 12;
		short b = 10;
		String c = "Hello";

		String d = a + b + c; // "22Hello"
		System.out.println("d = " + d);

		String s1, s2, s3;
		s1 = "Hello,";
		s2 = "World!";
		s3 = s1 + " " + s2;	 // addition operator 
		String x = s1 + s2 + " ... an introductory program";
		System.out.println("x is " + x);
	}

	private static void MulticlativeOperators() {

	}


}