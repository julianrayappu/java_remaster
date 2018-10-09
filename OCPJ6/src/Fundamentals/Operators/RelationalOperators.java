
package Fundamentals.Operators;

public class RelationalOperators {
	
	public static void main(String[] args) {
		// 4 Relational operators are <, <= , =>, >
		// can only be performed on numeric types, including chars
		// result is always boolean
		// arithmetic operation applies -> smaller type operand promoted to larger type operand and then operation takes place
		// the boolean type is NOT COMPATIBLE with any numeric type
			// boolean is true or false, not 1 or 0, unlike C/C++


		int x = 10, y = 20, z = 10;

		System.out.println(x < y);  // true
		System.out.println(z >= x); // true
		System.out.println(y < z);  // false

		// int result = (x < y); ; // compiler error - cannot assign INT result to boolean 
	}
}