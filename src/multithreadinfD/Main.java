package multithreadinfD;

class Text_6 extends Thread{
	
	// multiple task multiple thread
	public void run() {
		
		System.out.println("multipletask");
	}
}

class Text_7 extends Thread{
	
	public void run() {
		
		System.out.println("hello_ multiple Thread");
	}
}

public class Main {

	public static void main(String[] args) {
		
		Text_6 the=  new Text_6();
		the.start();
		
		Text_7 thea= new Text_7();
		thea.start();
	}

}
