package oopsd;

public class CounterDemo {
static int count = 0;
	CounterDemo(){
		
		
		count ++;
		System.out.println(count);
	}
	  public static void main(String []args) {
		  
		  CounterDemo heap1 = new CounterDemo();
		  CounterDemo heap2 = new CounterDemo();
		  CounterDemo heap3 = new CounterDemo();
		  
	  }
}    

