package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
Queue<String> queue = new PriorityQueue<String>();


queue.add("india");
queue.add("germany");
queue.add("america");

System.out.println("orignal queue : " + queue);
queue.remove();
System.out.println("queue after removing the head element : "+ queue);
//System.out.println(queue);
String head  = queue.peek();
System.out.println("head of the queue: " + head);


head =queue.poll();
System.out.println("remove head : "+head);
System.out.println("queue now looks like this : " + queue);
	}

}
