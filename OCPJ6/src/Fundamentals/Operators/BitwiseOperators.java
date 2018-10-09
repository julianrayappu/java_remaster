
package Fundamentals.Operators;

public class BitwiseOperators {
	// The 3 Bitwise operators are & | ^ - ie AND, OR and XOR
	// They are valid only when operating on NUMERIC INTEGER operands - i.e. byte, char, short, int, long
	// results are computed on the binary representation of each operand
	// @See LogicalOperators class - when & | ^ operators are used on boolean operands
	// Arithmetic promotion rules apply to numeric operands (i.e promoted to int, if byte, char or short)
	// Order of precedence - &,  ^ , then |	

	public static void main(String[] args) {
		int three = 3 ; // '011' is the bitwise binary representation
		int five  = 5 ; // '101'

		int result;

		result = BitwiseAND(three, five); // result = '001' => 1
		System.out.println("Bitwise: " + three + " & " + five + " = " + result);

		result = BitwiseXOR(three, five); // result = '110' => 6
		System.out.println("Bitwise: " + three + " ^ " + five + " = " + result);

		result = BitwiseOR(three, five); // result = '111' => 7
		System.out.println("Bitwise: " + three + " | " + five + " = " + result);
	}

	private static int BitwiseAND(int left, int right) {
		return left & right;
	}

	private static int BitwiseXOR(int left, int right) {
		return left ^ right;
	}

	private static int BitwiseOR(int left, int right) {
		return left | right;
	}
}