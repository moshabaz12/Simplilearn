package deepakmultithreadinfD;

class Test_9 extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());// get name 
		System.out.println("hello java threads ");
		
	}
	public static void main (String [] args ) {
		System.out.println("hello");
		Test_9  the = new Test_9();
		the.start();// and set name 
		//the.run();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(the.isAlive());// true false return  hota hai  
	}
}