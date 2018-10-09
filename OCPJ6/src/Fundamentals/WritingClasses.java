
// group classes, interfaces, enumerations & annotated types under 1 package
// group based on relationship and usage
// package creates a namespace, and puts the declared classes into a namespace
package Fundamentals;

// import statements are between package and class definitions

import java.io.File; 	// import File IO class ONLY, from IO package
import java.io.*;		// import entire IO package
						// avoid whole packages as this is against best-practice

public class WritingClasses {
	// A maximum of 1 public class per .java file is permitted
	// It

	public static void main(String[] args) {
		System.out.println("This is our first class!");
	}

}

class OtherClassesInWritingClassesJavaFile {
	// must have default level access (i.e not public, protected or private)
	// default level access is package level
}