package constructors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Streams_Filtre {

	public static void main(String[] args) {
	
		List<Integer>numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
		List<Integer> squaresList = new ArrayList<>();
		for(Integer i : numbersList) {
			squaresList.add(i*i);
		}
		
		 List<Integer> squaresList1 = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
	System.out.println("List of squared numbers : "+ squaresList1);
		
		Set<Integer> squareSet= new HashSet<>();
		for(Integer i : numbersList) {
			squareSet.add(i*i);
		}
				
		Set<Integer> squareSet1= (Set<Integer>) numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println("Set of aquared numbers : "+squareSet1 );
		
List<String>languages = new ArrayList<>();
languages.add("java");
languages.add("python");
languages.add("c++");

List<String> filterResult = new ArrayList<>();
for(String s :languages ) {
	if(s.startsWith("p")) {
		filterResult.add(s);
		
	}
}

List <String> filterResult1 = languages.stream().filter(s -> s.startsWith("p"))
.collect(Collectors.toList());
System.out.println("language starting with 'p': " + filterResult1);

List<String> sortedList = languages.stream()
.sorted()
.collect(Collectors.toList());
System.out.println("languages sorted alphabetically: "+ sortedList);
System.out.println("printing all elements one by one ");
numbersList.stream().map(x -> x*x).forEach(y -> System.out.println("element is : " + y));
	}

}
