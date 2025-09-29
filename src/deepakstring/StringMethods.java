package deepakstring;

public class StringMethods {

	public static void main(String[] args) {
		String A1= "    huzaifa";
		
		System.out.println(A1.isEmpty());// is emty methods boolean return karta hai
		if(A1.isEmpty()==true) {
		
		}
String A2= "     a    huzaifa";
		
		System.out.println(A2.trim());// is emty methods boolean return karta hai
		
		if(A1.isEmpty()==true) { // empty methods 

	}
		String A3 = "       ";
		@SuppressWarnings("unused")
		int  i = A3.length();
		if(A3.trim().length()==0) { // lenth method;  
			System.out.println("name is empty");
		}else {
			System.out.println("in valid");
		}
		String A4 = "    a  zubair ";
		System.out.println(A4.trim()); // trim methods 
		
		
		
		
		String A5 = "zaid";
		String A6 = "Zaid";  // deffrent why se treat karta upper case and lower case ko 
		
		
		System.out.println(A5.equalsIgnoreCase(A6));
		System.out.println(A5.equals("")); //  ye false provide kare ga 
		
		String   A10= "a";
		String  A11 ="A";
		System.out.println(A10.compareTo(A11));
		
		
		
		String A12 = "shabaz";
		String A13= "roman";
		System.out.println(String.join("-",A13,A12));
		
		
		
		String A15= "shabazkhan and roman khan";
		System.out.println(A15.subSequence(3, 10));  // to arg ments provides 
		
		
		String A16= "shabazkhanandromankhan";
		System.out.println(A16.substring(10)); // one arg ments provides
		
		
		
//		Buffer and buffer ke under hota hai
//		replace()
//		replaceFirst()
//		replaceall()
		
		
		
		String A17= "this is car";
		System.out.println(A17.replace("is","hello"));
		System.out.println(A17.replaceFirst("is" ,"black"));
		System.out.println(A17.replaceAll("is" ,"black"));
		System.out.println(A17.replaceAll("is(.)" ,"was"));
		System.out.println(A17.replaceAll("is(.*)", "was"));
		System.out.println(A17.indexOf('i'));
		System.out.println(A17.lastIndexOf('r'));
		System.out.println(A17.charAt(3));
		System.out.println(A17.contains("ca"));// boolean value return karta hai
		System.out.println(A17.endsWith("r"));
}}
