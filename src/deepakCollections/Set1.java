package deepakCollections;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set s1 = new HashSet();// hash code ke bases pe element ko add karavata hai
		s1.add(100);// hash code   element automatic  add karta  rahega  
		System.out.println(s1);// insertion id ko follow nahi karta hai
	}

}
