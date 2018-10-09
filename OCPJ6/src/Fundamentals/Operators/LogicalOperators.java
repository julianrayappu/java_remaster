
package Fundamentals.Operators;

public class LogicalOperators {
	
	// The 5 Logical operators are & | ^ &&  ||
	// They are valid only when operating on BOOLEAN operands
	// @See BitwiseOperators class - when & | ^ operators are used on numeric operands
	// && and || are the logical short-circuit operators
	// 		short-circuit meaning that once a result can be inferred from first LHS operands 
	// 		then further expression evaluation is halted and a result returned
	//		short-circuit operators are great if you want to only evaluate the RHS operand/expression if the LHS is safe
	// 		e.g. if ((ref != null) && ref.IsSafeToDereference()) { ... }

	public static void main(String[] args) {
		boolean btrue = true;
		boolean bfalse = false;

		LogicalAND(btrue, bfalse);
		LogicalAND(btrue, btrue);
		LogicalAND(bfalse, bfalse);

		LogicalOR(btrue, bfalse);
		LogicalOR(btrue, btrue);
		LogicalOR(bfalse, bfalse);

		LogicalXOR(btrue, bfalse);
		LogicalXOR(btrue, btrue);
		LogicalXOR(bfalse, bfalse);

		LogicalANDShortCircuit(btrue, bfalse);
		LogicalANDShortCircuit(btrue, btrue);
		LogicalANDShortCircuit(bfalse, bfalse);
		LogicalANDShortCircuit(bfalse, btrue);

		LogicalORShortCircuit(btrue, bfalse);
		LogicalORShortCircuit(btrue, btrue);
		LogicalORShortCircuit(bfalse, bfalse);
		LogicalORShortCircuit(bfalse, btrue);
	}

	private static boolean LogicalAND(boolean left, boolean right)	{
		log("&", left, right, left & right);
		return left & right; // TRUE iff left and right are true
	}

	private static boolean LogicalOR(boolean left, boolean right)	{
		log("|", left, right, left | right);
		return left | right; // TRUE iff either left or right are true
	}

	private static boolean LogicalXOR(boolean left, boolean right)	{
		log("^", left, right, left ^ right);
		return left ^ right; // TRUE iff left and right are different
	}

	private static boolean LogicalANDShortCircuit(boolean left, boolean right)	{
		log("&&", left, right, left && right);
		return left && right; // TRUE iff left and right are true
							  // FALSE if left is false
							  // FALSE if left is true and right is false
	}

	private static boolean LogicalORShortCircuit(boolean left, boolean right)	{
		log("||", left, right, left || right);
		return left || right; // FALSE iff left and right are false
							  // TRUE if left is true
							  // TRUE if left is false and right is true
	}

	private static void log(String operation, boolean left, boolean right, boolean result) {
		System.out.println("Logical: (" + left + " " + operation + " " + right + ") = " + result);
	}
}