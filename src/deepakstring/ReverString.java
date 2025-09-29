package deepakstring;

public class ReverString {

	public static void main(String[] args) {
	
		String s= "shabaz";
		String rev= "";
		
		for(int i =s.length() -1; i >= 0; i--) {
			rev = rev+s.charAt(i);
		}
if(s.equals(rev)) {   
	System.out.println("plaindrome String");
}else {
	
	System.out.println("hello java declopers");
}
	}

}
