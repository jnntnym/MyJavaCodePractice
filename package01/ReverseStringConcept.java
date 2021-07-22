package package01;

public class ReverseStringConcept {

	public static void main(String[] args) {
		
		String str = "All learning has an emotional base";

		// Spilt method
		String[] sp = str.split(" "); // split by space and store in sp variable ; Sub string concept
		System.out.println(sp[0]+" "+sp[1]+" "+sp[2]+" "+sp[3]+" "+sp[4]+" "+sp[5]);	// print as A-Z
		System.out.println(sp[5] + " " + sp[4] + " " + sp[3] + " " + sp[2] + " " + sp[1] + " " + sp[0]); // print Reverse

		// CharAt() method
		System.out.println(str.charAt(5));	// Ans: e
		
		for(int i=0; i<=str.length()-1; i++) {
			System.out.print(str.charAt(i));
		} System.out.println(" ");
		
		// Reverse for loop
		for(int i=str.length()-1; i>=0;  i--) {
			System.out.print(str.charAt(i));
		}
		
		
		

	}

}
