package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Streams_Map {
	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
		List<Integer> squareList = new ArrayList<>();
		for(Integer i: numbersList) {
			squareList.add(i * i);
		}
	
List<Integer>squareList1 = numbersList.stream()
.map(x -> x*x).collect(Collectors.toList());
System.out.println("list of squared numbers: " + squareList);
// collect  (Collectors.toList());
System.out.println("List of squared numbers: "+ squareList1);
	
	Set<Integer> squareSet1 = new HashSet<>();
	for(Integer i: numbersList) {
		squareList1.add(i*i);
	}
Set <Integer>  squareSet = numbersList.stream()
.map(x -> x*x)
.collect(Collectors.toSet());
System.out.println("Set of squared numbers: " + squareSet);

List<String> languages = new ArrayList<String>();
languages.add("java");
languages.add("python");
languages.add("javascript");



List<String> fhilterResult = languages.stream()
.filter(s->s.startsWith("p"))
.collect(Collectors.toList());
System.out.println("languages starting with 'p': " + fhilterResult);
	//shorted

List<String> sortedList = languages.stream()
.sorted()
.collect(Collectors.toList());
System.out.println("languages sorted alphabetically: "+ sortedList);
System.out.println("printing all elements one by one ");

	
//demonstration of forEach method
	for(Integer i: numbersList) {
	
		
		squareSet1.add(i * i);
	}

	

numbersList.stream()
.map(x-> x*x)
.forEach(y -> System.out.println("element is : " + y));

//demonstration of reduce method
int sum = 
numbersList.stream().reduce(0,(ans,i) -> ans + i);
System.out.println("sum of all elements in the numberlist:"+ sum);

}
}

