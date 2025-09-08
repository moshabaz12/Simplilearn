package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		 HashMap <String , Integer> map = new  HashMap<String , Integer>(); 
		
		map.put("shabaz",2 );
		map.put("roman", 3);
		map.put("huzaifa", 4);
		
//		System.out.println("size of map is : "+ map.size());
//		System.out.println( map);
		
		if(map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("value for key "+" \"a\" is :" + a);
		}
		
		for(String key : map .keySet()) {
			System.out.println("key: "+ key + ", value: " + map.get(key));
		}
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key: - "+  entry.getKey()+ ", value : " + entry.getValue());
		}
		
	}

}
