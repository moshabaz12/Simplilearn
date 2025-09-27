package multithreadinfD;

public class InterruptedMethodDemo  extends Thread{
	
	public void run() {
		System.out.println("A :"+Thread.interrupted()); // true -> false
		System.out.println(Thread.currentThread().isInterrupted());
		try {
			for(int i = 1; i<=5;i++) {
				
				System.out.println(i);
				Thread .sleep(1000);
			}
			
			
		}
		
		catch(Exception e){
		System.out.println("thread interrupted"+ e );	
		}
	}
	public static void main(String[] args) {
		InterruptedMethodDemo inter= new InterruptedMethodDemo();
		inter.start();
		inter.interrupt();
		
	}

}
