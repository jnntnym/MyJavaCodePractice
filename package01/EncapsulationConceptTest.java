package package01;

public class EncapsulationConceptTest {

	public static void main(String[] args) {
		// To access private value
		
		EncapsulationConcept obj = new EncapsulationConcept();
		
		// Value is given
		obj.getA();
		obj.getB();
		System.out.println(obj.getA());	// we got the private value
		System.out.println(obj.getB());	

/*		
		// value is not give, we passing the value
		obj.setA(300);	// if their has no  value, we can also set the get value
		obj.setB(400);	// here the value is given: A=100; B=150.
		System.out.println(obj.getA());	// we got the private value
		System.out.println(obj.getB());
		
*/
	}
}
