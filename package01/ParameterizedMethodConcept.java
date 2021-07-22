package package01;

public class ParameterizedMethodConcept {

	public static void main(String[] args) {
		// Calling Method under main method
		
		test1(10);
		test2(20, "abc");
		test3(30, 40, 50);
		test4(50, 60, 70);
		

	}
	public static void test1(int a) {
		System.out.println("Value is: "+a);
		
	}
	public static void test2(int b, String c) {
		System.out.println("value is: "+b+","+c);
		
	}
	public static void test3(int x, int y, int z) {
		int sum = (x+y+z);
		System.out.println("value is: "+sum);
		
	}
	public static void test4(int i, int j, int k) {
		int result = i+j+k;
		if (result>150) {
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");

		}
		
	}

}
