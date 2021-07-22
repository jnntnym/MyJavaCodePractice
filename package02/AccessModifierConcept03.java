package package02;

import package01.AccessModifierConcept01;

public class AccessModifierConcept03 extends AccessModifierConcept01 {

	public static void main(String[] args) {
	
		System.out.println("Access Modifier concept");
		
		 test1();	// Public > Same Project
	//	 test2();	// Private > same Class
		 test3();	// Protected > Same Package, but works when extends
	//	 test4();	// Default > Same package, but Not works  when extends
		 AccessModifierConcept01 obj= new AccessModifierConcept01();
	//	 obj.test2();	// Private > Same Class; here error
	//	 obj.test4(); 	// Default > Same package, but Not works  when extends or creating object
				
	
	
	
	}

}
