package multithreadinfD;

public class Sleep1 extends Thread {
public void run() {
	
	try {
		
		for(int i = 1; i <= 5;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}catch(Exception e) {
		System.out.println(e);
	}
}
	public static void main(String[] args) {
		Sleep1 h1 = new Sleep1();
		Sleep1 h2 = new Sleep1();
		h1.start();
		h2.start();
		
	}
	
}


