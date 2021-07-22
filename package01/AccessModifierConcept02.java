package package01;


public class AccessModifierConcept02 extends AccessModifierConcept01{

	public static void main(String[] args) {
		// When we extends the class, we can able to call all methods except Private, 
		// because Private works only same class

		test1();		// Public > Same Project
	//	test2();		// Private > Same Class; here error
		test3();		// Protected > Same Package
		test4();		// Default	> Same Package
		
		// 
		AccessModifierConcept01 prv = new AccessModifierConcept01();
	//	prv.test2();	// Private > Same Class; here error
		
		
	}

}
