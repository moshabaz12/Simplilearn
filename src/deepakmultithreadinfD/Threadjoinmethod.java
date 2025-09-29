package deepakmultithreadinfD;

public class Threadjoinmethod  extends Thread{
	public void run() {
		try {
			for(int i =1; i<= 5;i++) {
				System.out.println("child thread : "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args)  throws InterruptedException{
		Threadjoinmethod h4= new Threadjoinmethod();
		h4.start();
		h4.join(); // main methods white karta hai paheli line excute ho to mai chalu ga
		
		try {
			for(int i =1; i<= 5;i++) {
				System.out.println("main  thread : "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}}

