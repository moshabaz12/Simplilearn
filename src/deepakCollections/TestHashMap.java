package deepakCollections;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap <Integer ,String> h32 = new HashMap();
		h32.put(101, "Lion");
		h32.put(102, "Tiger");
		h32.put(103, "leppad");
		System.out.println(h32);
		
		for(Map.Entry me : h32.entrySet()) {
			System.out.println(me.getKey()+" -->"+me.getValue());
		}
//		Set set = h32.entrySet();
//		System.out.println(h32);
//		System.out.println(set);
//		Iterator iter = set.iterator();
//while(iter.hasNext()) {
////	System.out.println(iter.next());
//	Map.Entry entery= (Map.Entry) iter.next();
//	System.out.println(entery.getKey()+ " - >"+entery.getValue());
//	}

}}
