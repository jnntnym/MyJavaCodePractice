package package01;

public class ReturnTypeMethod {

	public static void main(String[] args) {
		
		test5(50, 100, 150);
		System.out.println(test5(50, 100, 150)); // old way to print
		
		int re = test5(50, 100, 150);	// Smart way : Store value in a another variable then print
		System.out.println(re);

	}
	public static int test5(int a, int b, int c) {	// it should not be void, it will same as data type
		int result = a+b+c;
		return result;			// No loop allowed
		
	}

}
