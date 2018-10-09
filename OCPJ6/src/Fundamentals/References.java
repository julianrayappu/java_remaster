
package Fundamentals;

import java.util.Date;
import Fundamentals.Type;

public class References {
	public static void main(String[] args) {
		Date now;	// reference variable of type Date
		now = new Date(); 	// Date object creation & 
							// date variable initialisation

		System.out.println("now is " + now);

		Parent parent; 			// reference variable (ref) of class Parent, 
								// without an object
		parent = new Parent();  // ref referrring to newly created object via 'new'
		
		Type type1;	// ref of Interface type
		type1 = parent;	// referring to object of type Parent
		Type type2 = new Child(); 		// ref of Interface type
										// referring to object of type Child

		int[] fibonnacci = { 0,1,1,2,3,5,8,13,21,34};	// ref of array type, 
														// specifically int array
		Object[] anyObjectArray1 = { type1, type2 };

		System.out.println("type1 has value " + type1);
		System.out.println("type2 has value " + type2);
		System.out.println("anyObjectArray1 has value " + anyObjectArray1);		

		type2 = new Parent("Parent object");

		Parent poly = new Child("Child object");
		System.out.println("type2 has value " + type2);
		System.out.println("poly has value " + poly);

		Object[] anyObjectArray2 = { type1, type2, poly, fibonnacci };
		System.out.println("anyObjectArray2 has value " + anyObjectArray2);
		System.out.print("\t->");
		for( Object o : anyObjectArray2 ) {
			System.out.print(o + ", ");
		}
		System.out.println();

		// can create an object without a reference, but cannot ref to it later
		System.out.println("creating a new Parent " + 
							(new Parent("temp Parent reference").toString()) );
	
		type1 = null;
		type2 = null;
		poly = null;
		System.gc();

		System.out.println("Programming mid-point");

		type1 = new Parent("Momma");
		type2 = new Child("Bubba");
		poly = new Child("Baby");
	}
}