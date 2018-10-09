
package Declarations;

public class Variables {

	static int m_classVariable;
	static double m_classDouble = 123.456;

	short m_instanceShort;
	long  m_instanceLong = 98765431;

	public String toString() {
		return "{ m_classInt=" + m_classInt +
			   ", m_classDouble=" + m_classDouble +
			   ", m_instanceShort=" + m_instanceShort +
			   ", m_instanceLong=" + m_instanceLong + "}";
	}

	public static void main(String[] args) {
		ValidIdentifiers();
		Initialisation();
	}

	private static void ValidIdentifiers() {
		// Rules for variable names
		// Variable names cannot 
		// 		1. have a digit as the first letter
		//		2. be a Java keyword - e.g. true, null, class, 
		//		3. contain a Java OPERATOR - e.g. +, -, /, ==, etc
		//		4. contain a Java SPECIAL CHARACTER - e.g. @

		System.out.println("ValidIdentifiers");

		int $variable = 12;
		System.out.println("$variable = " + $variable);

		long _variable = 123456789;
		System.out.println("_variable = " + _variable);

		boolean visible = true;
		System.out.println("visible = " + visible);

		boolean vi$ible = false;
		System.out.println("vi$ible = " + vi$ible);
	}

	private static void Initialisation() {
		Variables vars = new Variables();
		System.out.println("Initialisation of Variables type:\n\tvars=" + vars);

		double d;
		System.out.println("Cannot use local variable without initialisation - compiler error. d=" + d);
	}
}