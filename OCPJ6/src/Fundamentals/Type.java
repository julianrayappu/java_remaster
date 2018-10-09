// Type.java

package Fundamentals;

interface Type {
	public String toString();
}

class Parent implements Type {
	private String m_value = "Parent";

	public Parent() {
		// m_value = "parent"
	}

	public Parent(String s) {
		this.m_value = s;
	}

	public String toString() {
		return m_value;
	}

	public void finalize() {
		System.out.println("cleaning up object of type Parent with value " + this);
	}
}

class Child extends Parent {
	public Child() {
		super("Child");
	}

	public Child(String s) {
		super(s);
	}

	public void finalize() {
		System.out.println("cleaning up object of type Child with value " + this);
	}

}