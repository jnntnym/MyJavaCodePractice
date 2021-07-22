package package01;

public class ThisConceptInParameterizedMethod {
	
	int a;		// Global or Class level variable 

	public static void main(String[] args) {
		ThisConceptInParameterizedMethod obj = new ThisConceptInParameterizedMethod();
		obj.test(500);	// called non static method by object and passing value
		
	}
	public void test(int a) {
		this.a = a;				// made relation between local and global variable
		System.out.println(a);
	}
}