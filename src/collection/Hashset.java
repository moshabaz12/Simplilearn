package collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet <String> hashset = new HashSet <String>();
		hashset.add("A");
		hashset.add("B");
		 boolean R1 =hashset.add("C");
		// System.out.println(r1);
		 
		boolean R2 = hashset.add("C");
		//System.out.println(r1);
		
		
		System.out.println(hashset);
		
	System.out.println("Set contains C or not ? "+ hashset .contains("C"));
 for (String item : hashset) {
	 System.out.println(item);
 }
}
}