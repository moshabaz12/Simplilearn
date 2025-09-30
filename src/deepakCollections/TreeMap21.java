package deepakCollections;

import java.util.TreeMap;

public class TreeMap21 {

	public static void main(String[] args) {
		TreeMap sh = new TreeMap();
sh.put(1, "pink");  
sh.put(9, "yellow");
sh.put(8, "red");
sh.put(4, "blue");
System.out.println(sh.ceilingEntry(3));// key value dono retrun karega 
System.out.println(sh);
System.out.println(sh.ceilingKey(2));// only key value return kare ga
//sh.clear(); // saare methods cler ho jaye ge 

sh.containsKey(10);
System.out.println(sh);

//System.out.println(sh.floorEntry(2));   kam value print karta hai
//System.out.println(sh.headMap(4)); proper value retuen hoga
//System.out.println(sh.higherEntry(3)); 2 nahi hai to usse badi retuen kare gi

System.out.println(sh.pollFirstEntry()); // first elemet delete kar deta hai
System.out.println(sh);
//System.out.println(sh.pollLastEntry()); las ka elementdelet kar dega 
System.out.println(sh);
	}

}
