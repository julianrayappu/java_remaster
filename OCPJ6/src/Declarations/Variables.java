
package Declarations;

public class Variables {

	public static void main(String[] args) {
		ValidIdentifiers();
		Initialisation();
		StaticVariablesUsageExample();
		// Static Import - see StaticImport.java class
		LocalVariables();
	}

	protected static int s_classCounter;	// used by class below - StaticVariablesUsage

	// all class (static) and instance/member (non-static) variables are automatically initalised to 0-like values
	// These values are false, '\u0000' (unicode null), 0, and 0.0 
	// 		for boolean, char, integer types (byte, short, int, long) and decimal types (float and double)

	static boolean  s_classBoolean; // initialised to false
	static int s_classInt;					// initialised t0 0
	static double s_classDouble;			// initialised to 0.0

	char m_instanceChar;	// initialised to '\u0000' (unicode null)
	short m_instanceShort;	// initialised to 0
	long  m_instanceLong;	// initialised to 0
	float m_instanceFloat; 	// initialised to 0.0

	byte m_instanceByte = (byte) 127; 	// EXPLICIT-INITIALISATION to value 127
										// otherwise would be initialised to 0

	public Variables() {
		s_classCounter++;
	}

	public String toString() {
		return "{ s_classCounter=" + s_classCounter +
			   ", s_classBoolean=" + s_classBoolean + 
			   ", s_classInt=" + s_classInt +
			   ", s_classDouble=" + s_classDouble +
			   ", m_instanceChar=" + m_instanceChar +
			   ", m_instanceShort=" + m_instanceShort +
			   ", m_instanceLong=" + m_instanceLong + 
			   ", m_instanceByte=" + m_instanceByte + 
			   "}";
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
		Variables vars = new Variables(); // allocate memory for object, which automatically initialises the class and instance variables
		System.out.println("Initialisation of Variables type:\n\tvars=" + vars);

		// double d;
		// System.out.println("Cannot use local variable without initialisation - compiler error. d=" + d);
	}

	static void StaticVariablesUsageExample() {
		final byte loop_count = (byte) 5;

		StaticVariablesUsage svu;
		for(int i = 0; i < loop_count ; i++) {
			svu = new StaticVariablesUsage();
		}
	}

	static void LocalVariables() {
		int localInt;	// declaration of local variable (i.e. inside a method, class function or initialiser)
						// 		The JVM will create some space on the stack for the local variable
		localInt = 25;	// local variables require EXPLICIT initialisation by the programmer
						// 		This is because the JVM does not zero out the memory in the stack 
		System.out.println("LocalVariables: localInt=" + localInt);

		String localStr = "Hello!"; // declaration and initialisation in 1 statement 
		System.out.println("LocalVariables: localStr=" + localStr);
	}
}

class StaticVariablesUsage {

	public StaticVariablesUsage() {
		// access the class variable
		System.out.println("StaticVariablesUsage()\n\t->(class variable) Variables.s_classCounter=" + Variables.s_classCounter);

		// increment counter from Variables class
		Variables.s_classCounter++ ;
	}

	public int getClassCounter() {
		// access the class variable
		return Variables.s_classCounter;
	}

}