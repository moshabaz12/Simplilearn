package multithreadinfD;

public class Intrrupted  extends Thread{
	
	public void run() {
		
		try {
			for (int i= 1; i <= 5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e) {
			
			System.out.println("thread interrupted : "+ e);
		}
	}

	public static void main(String[] args) {
		Intrrupted se = new Intrrupted();
		se.start();
		se.interrupt();

	}

}
