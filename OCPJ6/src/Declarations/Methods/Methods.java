
package Declarations.Methods;

public class Methods {
	
	public static void main(String[] args) {
		CallingInstanceMethods();
		CallingStaticMethods();
	}

	// instance variables
	int m_id;
	String m_name;
	
	// static class variables
	static int m_counter;

	// This is an instance method. It can access static members too
	void setId() {
		m_id = m_counter++;
	}

	// this is an instance method too
	int getId() {
		return m_id;
	}

	// This is a static (class) method. There is no access to *this* or this.member
	static int getCounter() {
		// int id = m_id ; // compiler error: static cannot access this/instance
		return m_counter;
	}



	static void CallingInstanceMethods() {
		// access to this or Method object is required

		Method m = new Method();
		m.setId();
		System.out.println("m.getId()=" + m.getId());
	}

	static void CallingStaticMethods() {
		// no instance to this or Method object required
		System.out.println("Counter=" + getCounter());
	}

	// variable length arguments
	static void CallingMethodWithVariableLengthArguments(String name, int... stats) {
		System.out.println("VariableLength: name=" + name);
		
		// access the variable length argument they 
		for (int a : stats) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}

	// variable length arguments
	static void CallingMethodWithVariableLengthArguments(String name, long... stats) {
		System.out.println("VariableLength: name=" + name);
		
		// access the variable length argument they 
		for (long a : stats) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}

	// variable length arguments
	static void CallingMethodWithVariableLengthArguments(String name, double... stats) {
		System.out.println("VariableLength: name=" + name);
		
		// access the variable length argument they 
		for (double a : stats) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}




}