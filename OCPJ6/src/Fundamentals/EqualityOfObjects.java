
package Fundamentals;

public class EqualityOfObjects {
	
	interface InnerInterface {
		// This method must be overriden to check for object equality
		// The method equals() is used, instead of "==" (which checks if 2 references refer to the same location in memory)
		// If the equals() method is not overriden, Java provides a default equals in java.land.Object 
		// 		which checks for reference equality (not object content equality)
		@Override
		public boolean equals(Object obj);
		
		// The hashCode() method must be implemented in tandem with equals() for ordering in Collections
		// equals() and hashCode() are related - if 2 objects are equal then they return the same hashCode()
		@Override
		public int hashCode();
	}

	static class InnerClass implements InnerInterface {
		private String  m_obj;
		private double  m_primitive;
		
		@Override
		public boolean equals(Object obj) {
			// provide short-cut if comparing the same object in memory
			if (this == obj) { 
				// this and obj refer to same location in memory, so must be the same object
				return true;
			}

			// compare object types
			if ( obj instanceof InnerClass ) {
				// check for same object type first, then cast to known type
				InnerClass icObj = (InnerClass) obj;

				// compare object member values
				if ( m_obj.equals(icObj.m_obj) &&			// use ref.equals() for non-primitive types
					 (m_primitive == icObj.m_primitive) )	// use == for primitive types
				{
					return true;
				}
			}

			return false;
		}

		@Override
		public int hashCode() {
			return m_obj.hashCode()			// for object members calculate their hashCode and add them using +
					+ (int) m_primitive;	// for primitive members, cast to int (where required) and add using +
		}

		public String toString() {
			return "[m_obj=" + m_obj + ", m_prim=" + m_primitive + "]";
		}

		public InnerClass(String obj, double primitive) {
			this.m_obj = obj;
			this.m_primitive = primitive;
		}
	}

	public static void main(String[] args) {

		InnerClass ic = new InnerClass("MyInnerClass", 123456.789);
		InnerClass icSame = new InnerClass("MyInnerClass", 123456.789);
		InnerClass icDifferent = new InnerClass("DiffInnerClass", 987654.321); 
		
		InnerClass sameRef = ic;
		InnerInterface anotherRef = ic;

		log(ic, icSame);
		log(ic, icDifferent);
		log(ic, sameRef);
		log(sameRef, anotherRef);
	}

	private static void log(Object left, Object right) {
		System.out.println("EqualityOfObjects: (" + left + ".equals(" + right + ") = " + (left.equals(right)) );
		System.out.println("EqualityOfObjects: (" + left + ".hashCode() = " + left.hashCode() + ", right.hashCode() = " + right.hashCode() );	
	}

}