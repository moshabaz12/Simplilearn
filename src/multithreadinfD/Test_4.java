package multithreadinfD;

public class Test_4  extends Thread{
	// single task multiple thread
	public void run() {
		
		System.out.println("  singla task to Multiple threads");
	}
	
	public static void main(String[] args) {   // jvm thread create karta hai
		Test_4 th = new Test_4();// 1 thrads
		Test_4 te = new Test_4();// 2 threads 
		
		th.start();
		te.start();
	}

}
