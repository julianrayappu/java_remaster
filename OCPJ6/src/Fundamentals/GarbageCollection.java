// GarbageCollection.java

package Fundamentals;

import Fundamentals.Type;

public class GarbageCollection {
	private String m_str = "default";

	public GarbageCollection(String s) {
		this.m_str = s;
	}

	public void finalize() {
		System.out.println("Garbage collecting the gc");
	}

	public static void main(String[] args) {
		Type t1 = new Parent("first");
		Type t2 = new Child("second");

		Parent p1 = new Parent("third");
		Child  c1 = (Child) t2;

		// to garbage collect the object must not have 
		// any references referring to it. 
		// So set the refs to "null"

		t1 = null;
		t2 = null;
		p1 = null;

		// ATTEMPT to force garbage collection.
		// gc() does not guarantee object cleanup, it is best effort
		System.gc();

		// since c1 refers to t2 that object is not eligible for GC.
		
		System.out.println("Programme mid-point");
		
		t1 = new Child("fourth");
		t2 = new Parent("fifth");
		p1 = (Child) t1;
		c1 = (Child) t1;

		System.out.println("t1 t2 p1 c1 are " + t1 + t2 + p1 + c1);
	}
}