package multithreadinfD;

// 1 implement the Runnable interface
 public class Test_2 implements Runnable {
public void run() {
	/// 2 overrride the run methods
	System.out.println("hello_thread");
}
	public static void main(String[] args) {
		// 3 create an object of (Test )  the class 
		Test_2  t = new Test_2();
		// 4  create an object of Threa class s  the propertis in contribute 
	Thread h = new  Thread();
	t.run();
	h.start();
	
	//5 start the Thread
	}

}
