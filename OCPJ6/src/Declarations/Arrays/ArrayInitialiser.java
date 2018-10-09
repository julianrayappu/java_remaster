
package Declarations.Arrays;

public class ArrayInitialiser {
	
	// ARRAY INITIALISER THEORY
	// 		When using array initialisers, both new instantiation and a size specifier is not required,

	public static void main(String[] args) {
		SingleDimensionalArrayInitialiser();
		MultiDimensionalArrayInitialiser();
	}

	static void SingleDimensionalArrayInitialiser() {

		// array initialisers MUST be used within the SAME STATEMENT as the array variable declaration
		// not
		String[] names = {"Bob", "Ivan", "Henry", "Harriet", "Livi", "ArjBaj"} ;
		System.out.println("Names is " + names); // prints object address
		
		// String[] suburbs;
		// suburbs = { "Balmain", "Rozelle", "Gladesville" };  // COMPILER ERROR: declaration and array initialiser must be 1 single statement
	}

	static void MultiDimensionalArrayInitialiser() {

		// multidimensional array initialiser can use differing length arrays
		String[][] guestListByTable = {
			{"Joseph", "Mary", "Lazarus", "Peter", "Paul", "John", "Simon", "Aboud"},
			{"Mikhel", "Maurice", "Yousef", "Lawrence", "Patrick"},	 // OK to have trailing comma ,
		};

		for (String[] table : guestListByTable) {
			System.out.print("table: ");
			for(String guest : table) {
				System.out.print(guest + ", ");
			}
			System.out.println();
		}
	}

}