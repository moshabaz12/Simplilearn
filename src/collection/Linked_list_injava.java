package collection;

import java.util.LinkedList;

public class Linked_list_injava {

	public static void main(String[] args) {
	
LinkedList <String> list = new  LinkedList <String>();
list.add("B");
list .add("D");
list .addLast("E");
list.addFirst("A");
list.add(2, "C");

list.remove(0);

System.out.println(list);
	}

}
