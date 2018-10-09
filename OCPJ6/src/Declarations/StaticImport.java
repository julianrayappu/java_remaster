
package Declarations;

// Import class variable and function into the current namespace
// 		Note that public, protected and default members of any class in the same package 
// 		are accessible by ClassName.MemberName WITHOUT the need to perform static import

import static Declarations.Variables.s_classCounter;
// import static Declarations.Variables.s_classBoolean; // Compiler cannot find SYMBOL since private
import static Declarations.Variables.StaticVariablesUsageExample;

public class StaticImport {
	
	public static void main(String[] args) {
		UseStaticImport();
		
		IncrementStaticImportValue();
		UseStaticImport();

		StaticVariablesUsageExample();

		UseVariablesClassFromTheSamePackage();
		
		UpdateStaticImportValue(10);
		UseStaticImport();
	}

	private static void UseStaticImport() {
		int useStaticImport = s_classCounter;
		System.out.println("StaticImports::UseStaticImport()\n\t->useStaticImport=" + useStaticImport  +
							"\n\t->s_classCounter=" + s_classCounter );
	}

	private static void IncrementStaticImportValue() {
		s_classCounter++;
	}

	private static void UpdateStaticImportValue(int value) {
		s_classCounter = value;
	}

	static void UseVariablesClassFromTheSamePackage() {
		Variables v = new Variables();
		UseStaticImport();
		
		Variables.s_classDouble = 3.0;
		System.out.println("Can we update s_classDouble ? Lets see! v = " + v);
	}

}