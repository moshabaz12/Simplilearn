package deepakmultithreadinfD;
class Medical extends Thread {
	
	public void run() {
		
		try {
			for(int i = 1; i <=4;i++) {
			
				System.out.println("Medical starts");
				Thread.sleep(1000);
				System.out.println("Mesical completed ");
			}}
			catch(Exception e) {
				System.out.println(e);
				}
			}
		}
		class TestDriver  extends Thread{
			public void run() {
				
				try {
					
					System.out.println("Test drive starts");
					Thread.sleep(1000);
					System.out.println("test drive  complete");
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}

class OfficerSing  extends Thread{
	
	public void  run() {
		try {
			
			System.out.println("officer take this file ");
			Thread.sleep(1000);
			System.out.println("officer work completed");
		}
		catch(Exception e) {
System.out.println(e);
		}
	}
	}
public class Licence {

	public static void main(String[] args) throws InterruptedException {
		Medical a1 = new Medical();
		a1.start();
		
		a1.join();
		
		TestDriver a2 = new TestDriver();
		a2.start();
		a2.join();
		OfficerSing a3=new OfficerSing();
		a3.start();
	}

}
