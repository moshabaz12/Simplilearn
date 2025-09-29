package deepakCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class List1 {

	public static void main(String[] args) {
		List l= new ArrayList();// list jo hai index base pe kaam karta hai
		l.add(0,1);
		l.add(1,2);
		l.add(2,3);
		l.add(3,4);// element index base pe add karta hai
		System.out.println(l);// list insertion id ko follwo karta hai
		// set does not  allow to dublicate value 
		ListIterator litr= l.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
	}

}
