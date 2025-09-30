package deepakCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	ArrayList n2 = new ArrayList<>();	
	n2.add("shabaz");
	n2.add("fraz");
	n2.add("huzaifa");
	
HashSet a= new  HashSet(n2);
a.add(30);
a.add(10);
a.add(20);
a.add(40);
System.out.println(a);
System.out.println(a.size());
////System.out.println(a);
//Iterator n1= a.iterator();
//while( n1.hasNext()) {
//	System.out.println(n1.next());
//}
	}

}
