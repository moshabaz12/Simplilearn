package deepakCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterDemo {

	public static void main(String[] args) {
		
List l = new ArrayList();

l.add(3);
l.add("Sohail");
l.add("arkam");

Iterator iter = l.iterator();
while(iter.hasNext() ) {
	System.out.println(iter.next());
}


	}

}
