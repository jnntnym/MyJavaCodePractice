package package01;

public class InheritanceConcept02 extends InheritanceConcept01 {
	
	public static void main(String[] args) {
		InheritanceConcept01 in1 = new InheritanceConcept01();
		in1.test1();	// non static method: extends not working here, we need to create object by class name
		
		test2();		//static method: When we extends the class, we can call static method directly
		in1.test2();    // we can also called by object name
	
	}

}
