package deepakCollections;
import java.util.HashMap;
import java .util.Map;

public class Maps {

	public static void main(String[] args) {
		Map h1=new HashMap();
	h1.put(1, "shabaz");
	h1.put(2, "shabaz");
	h1.put(3, "shab");// keys uniq honi cahiye  value dublicat hoga to bhi chalega 
	h1.put(4, "shabaz");
	h1.put(null, "shabaz"); //hashMap jo hai non syncronize  data struture hota hai
System.out.println(h1.containsKey(6));
System.out.println(h1.containsValue("shab"));
System.out.println(h1);
	}

}
