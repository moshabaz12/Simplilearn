package deepakCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticDemo {

	public static void main(String[] args) {
		
	ArrayList a1= new ArrayList();
	a1.add(10);
	a1.add(90);
	a1.add("shababz");
//	System.out.println(a1);
//	
//	System.out.println(a1.get(1));
//	a1.set(0, "zaid");
//	System.out.println(a1);
//	System.out.println(a1.indexOf(90));
//	
	
Iterator itr = a1.iterator();
while( itr.hasNext()) {
System.out.println(itr.next());	
}

	}

}
