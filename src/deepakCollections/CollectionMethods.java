package deepakCollections;

import java.util.ArrayList;

public class CollectionMethods { // collection method ka object not createated

	public static void main(String[] args) {
		ArrayList l = new ArrayList();// collection object create  hogya hai
		l.add(10);
		l.add("shabaz");
		l.add('v');
		
System.out.println(l);
System.out.println(l.add("shabazkhan"));// adding 
System.out.println(l);
System.out.println(l.contains(10));// container ke undedr 10 hai cheke karta hai hai boolean value return karta hai
ArrayList ls= new ArrayList();
ls.add(2);
ls.add('b');
ls.add("aaa");
System.out.println(ls);
l.addAll(ls);//interface  ka methods hai
System.out.println(l);
System.out.println(ls.isEmpty());// ye  bata hai agar ap kuch bhi declare nahi kiye hai to empty rahega 
System.out.println(ls.size());//collection object ka size bata hai size methods ();

ArrayList h1 = new ArrayList();
h1.add("suhel");
h1.add(30);
h1.add("zubair");
System.out.println(h1);
h1.remove(1);
System.out.println(h1);

	}

}
