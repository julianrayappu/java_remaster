
package Declarations.Classes;

class Parent {

	String m_parent = "Parent-Default";
	static String m_parentClass = "Parent-Class";
	double m_double;

	// instance initialiser - must be placed after any members that is accesses
	{
		System.out.println("First Parent() instance initialiser: m_parent=" + m_parent + 
															  ", m_parentClass=" + m_parentClass +
															  ", m_double=" + m_double);
	}

	// static initialiser - only called when the Parent class is invoked in the main program
	static {
		m_parentClass = "Parent-Class-Static";
		System.out.println("First Parent() static instance initialiser: m_parentClass=" + m_parentClass);
	}

	Parent() {
		this("Parent-Constructor");
		System.out.println("Parent() constructor : m_parent=" + m_parent);
	}

	Parent(String parent) {
		m_parent = parent;
		System.out.println("Parent(String) constructor : m_parent=" + m_parent);
	}
}

class Child extends Parent {
	String m_child = "Child-Default";

	// instance initialiser
	{
		System.out.println("First Child() instance initialiser: m_parent=" + m_parent +
															 ", m_child=" + m_child);
	}

	// static initialiser 
	static {
		System.out.println("First Child() static instance initialiser"); //: m_parentClass=" + m_parentClass);
	}

	Child() {
		this("Child-Constructor");
		System.out.println("Child() constructor : m_parent=" + m_parent + 
											   ", m_child=" + m_child);
	}

	Child(String child) {
		// super() is implicitly called here.
		//		As there is no explicit call to this(), this(...), or super(...) 
		// 		This means that a Parent() constructor is called. 
		//		If constructor Parent() is not defined then a compiler error 'Cannot find symbol' will occur.
		//			Resolve by providing a no-arg constructor OR explicitly calling this(), this(...) or super(...)
		m_child = child;
		System.out.println("Child(String) constructor : m_parent=" + m_parent + 
											   		  ", m_child=" + m_child);
	}
}

public class Instantiation {
	public static void main(String[] args) {
		//System.out.println("Neither Parent nor Child classes are accessed in any form");

		//System.out.println("Child static is " + Child.m_parentClass);	// this does not invoke the Child static initialiser
		 																// since the static variable belongs to the Parent class

		
		//Parent p1 = new Parent();
		Child  c1 = new Child();
		System.out.println("\n\n");
		Child c2 = new Child("Billy");
		
	}
}