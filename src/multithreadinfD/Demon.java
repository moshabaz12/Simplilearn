package multithreadinfD;

public class Demon  extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("demon Thread");
		}else {
			
			System.out.println("child");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("main thread");
		Demon he = new Demon();
		he.setDaemon(true);
		he.start();
		

	}

}
