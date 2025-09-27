package multithreadinfD;

public class Priority  extends Thread{
	public void run() {
		System.out.println("child Thread :  ");
		System.out.println("child :   "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println("main therad old priority :   "   + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("main therad old priority  :   "   + Thread.currentThread().getPriority());
		
		Priority first= new Priority();
		first.start();
		
	}
        
}
