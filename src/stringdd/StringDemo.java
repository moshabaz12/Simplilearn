package stringdd;

public class StringDemo {

	public static void main(String[] args) {
		String A1 = new String(); //M T String  create and no arg ment constructor
		System.out.println(A1.length());
		
		String A2 = new String("shabaz");  //arg ment construtor
		System.out.println(A2.length());
		
//		StringBuffer A3= new StringBuffer("roman");// mutible object create karta hai
//		String A4 = new String(A3);// immutible object create karta hai
//		System.out.println(A4);
		
		byte [] A5 = {101,102,103};//byte ka array char
		String A6 = new String(A5);
		System.out.println(A6);
		
		char  [] A7 = {101,102,103};
		String A8 = new String(A7);
		System.out.println(A8);
		
	}

}
