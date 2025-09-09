package collection;

import java.util.Stack;


public class StacksDemo {

	public static void main(String[] args) {
		Stack <String> hell= new Stack<String>();
		hell.push("America");
		hell.push("india");
		hell.push("ukerain");
		hell.push("noida");
		System.out.println("hell : "+ hell);
		
String popped1 = hell.pop();
	System.out.println("last value target :"+popped1);

		
		String poppedelements1 = hell.peek();
		System.out.println("only one value target any time :"+poppedelements1);
		
	
	 
	}

}
