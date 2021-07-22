package package01;

public class ReturnTypeMethodWithIfelse {

	public static void main(String[] args) {

		test6(30, 40, 50);
		
		int result=test6(30, 40, 50);
		
		if (result>100) {
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");

		}
	
	}
	public static int test6(int a, int b , int c) {	// Parameterized return type method
		int result = a+b+c;
		return result;						// No loop allowed
		
	}

}
