package package01;

public class EncapsulationConcept {

	// Create Getter and Setter method: Select Variables> right click> Source>
	// then click > Generate Getter and Setter
	
	private int a =100;		// value is given
//	private int a;			// value is not given
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	private int b =150;	// value is given
//	private int b;		// value is not given
}
