
package Declarations.Arrays;

import java.util.Random;

public class Array {
	
	// ARRAY PROPERTIES
	// Arrays are allocated as CONTIGUOUS block of memory on the HEAP
	// An array is an Object type
	// An array is a homogenous container type
	//		However an array of Objects (ie. Object[] objects;) can refer to any object type
	// 
	// Array objects have a fixed size, once created on the heap
	// Array indexing is ZERO-based - i.e. first element is array_name[0] 
	//

	public static void main(String[] args) {
		// 1 DECLARE ARRAY
		//		See Class-scope (static) arrays declared in this class
		
		// 2 ASSIGN ARRAY OBJECT TO ARRAY by 1 of 2 methods
		// 2.1 INSTANTIATE THE ARRAY
		//		That is, create the array content using 'new'
		InstantiateArrayUsingNew();
		InstantiatedArraysAreDefaultInitialised();
		int x = 4, y = 6;
		InstantiateArrayWithRuntimeSpecifiedDimensions(x, y);
		
		// 2.2 ASSIGN ARRAY REFERENCE to an array object (already created), via another reference
		AssignToArrayReference();

		// 3 ACCESS THE ARRAY
		// 3.1 Using Foreach loop
		TraverseArrayContentsUsingForEach();
		// 3.2 Using For loop with indexing
		UseArrayLength();
		TraverseArrayContentsUsingForLoopWithIndex();
		// 3.3 Access an array element by index
		int index = new Random().nextInt(10);	// generate number from 0 to 9
		AccessArrayElement(index);
		// 3.4 Multiple references referring to same array object
		ArrayObjectsCanBeAssignedToMultipleReferences();
	}

	// DECLARING AN ARRAY 
	// This is how you declare an array (multiple examples). 
	// The same syntax and method applies to array references of class (prepend with static), 
	// 															 instance (non-static), and
	//															 local scope.

	static int[] s_ages;	// a reference to an array of type int
	static int s_alt_ages[];	// an alternative declaration style, where the [] appears AFTER the variable name

	static String[] s_names = new String[5];	// a reference to an array of type String
										// declaration and instantiation (creation) combined
	
	static Object s_objects[];	// a reference to an array of type Object

	// String[20] twentys_names;		// COMPILER error as the size specifier is not valid during declaration

	static void InstantiateArrayUsingNew() {
		s_ages = new int[10];	// instantiation of array to an array of int of size 20
								// instantiation will automatically initialise the default values
	}

	static void InstantiatedArraysAreDefaultInitialised() {
		// An array is automatically initialised to default values when it is instantiated with 'new'
		//		Since arrays are created on the heap
		// 		Here is the proof
		System.out.print("InstantiatedArraysAreDefaultInitialised: int[] s_ages initialised with the following\n\t-> ");
		for (int age : s_ages)
		{
			System.out.print(age + ", "); // EXPECT 0
		}
		System.out.println();

		System.out.print("InstantiatedArraysAreDefaultInitialised: String[] s_names initialised with the following\n\t-> ");
		for (String name : s_names)
		{
			System.out.print(name + ", "); // EXPECT null
		}
		System.out.println();
	}

	static void InstantiateArrayWithRuntimeSpecifiedDimensions(int xDim, int yDim) {
		int[]   localArray = new int[xDim];			// can instantiate an array using variables, and not only numeric literals
		int[][] localTable = new int[xDim][yDim];  	// same applies to multidimensional arrays
	}

	static void AssignToArrayReference() {
		// array references must be assigned to via instantiation OR assignment
		s_alt_ages = s_ages;

		System.out.print("AssignToArrayReference: s_alt_ages has following contents\n\t-> ");
		for (int age : s_ages)
		{
			System.out.print(age + ", "); // EXPECT 0
		}
		System.out.println();

		// 
		s_objects = s_names;
		System.out.print("AssignToArrayReference: s_objects has following contents\n\t-> ");
		for (Object obj : s_objects)
		{
			System.out.print(obj + ", "); // EXPECT null, from String[]
		}
		System.out.println();
	}

	static void UseArrayLength() {
		// every array has a "length" attribute
		int length = s_ages.length;
		System.out.println("UseArrayLength: s_ages.length=" + length);
	}

	static void TraverseArrayContentsUsingForEach() {
		System.out.print("TraverseArrayContentsUsingForEach: using for (each) loop : s_ages=[");
		for (int age : s_ages)
			System.out.print(age + ", ");
		System.out.println("]");
	}

	static void TraverseArrayContentsUsingForLoopWithIndex() {
		System.out.println("TraverseArrayContentsUsingForLoopWithIndex : using for loop with indexes :");
		for (int index = 0; index < s_alt_ages.length; index++) {
			System.out.println("\t s_alt_ages[" + index + "]=" + s_alt_ages[index]);
		}
	}

	static void AccessArrayElement(int index) {
		// access a single element of the array by INDEX
		index = index % s_ages.length;
		System.out.print("AccessArrayElement: s_ages[" + index + "]=" + s_ages[index]);
	}

	static void ArrayObjectsCanBeAssignedToMultipleReferences() {
		System.out.println("ArrayObjectsCanBeAssignedToMultipleReferences");

		s_alt_ages = s_ages; 

		// modify array through one reference, other reference sees changes
		int index = new Random().nextInt(s_alt_ages.length);
		int value = new Random().nextInt(); 
		s_alt_ages[index] = value;

		System.out.println("\tgenerated (index, value)=(" + index + ", " + value +")");
		TraverseArrayContentsUsingForEach();
		TraverseArrayContentsUsingForLoopWithIndex();
	}
}