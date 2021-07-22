package package01;

public class SubStringConcept {

	public static void main(String[] args) {

		String st= "This is java first class";
		System.out.println(st.length()); // Including space total length
		
		System.out.println(st.substring(13)); // first class
		System.out.println(st.substring(8, 12));// java, end+1
		System.out.println(st.substring(13, 18));//first
		
		// when we want to store multiple value in one variable, we need Array
		
		int[] num = {11,22,33};
		System.out.println(num);
		
		String[] str= {"java","class"};
		System.out.println(str);
		
		String[] sp = st.split(" "); // split by space and store in sp variable
		System.out.println(sp[0]+" "+sp[1]+" "+sp[2]+" "+sp[3]+" "+sp[4]);
		
		String[] cc = st.split("a"); // when split by letter, it will vanish
		System.out.println(cc[0]+" "+cc[1]+" "+cc[2]+" "+cc[3]);
		
		
		
	}

}
