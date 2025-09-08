package collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap <Integer, String> map = new TreeMap<Integer , String>();
		map.put( 3, "shabaz");
		map.put(2, "khan");
		map.put(1, "suhel");
		System.out.println(map);
	}

}
