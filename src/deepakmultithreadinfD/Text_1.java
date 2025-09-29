package deepakmultithreadinfD;
//1 ectends the thread class
public class Text_1 extends Thread {
	public void run() {
		 System.out.println("Thread");//take of thread 
	}
// 2 override the run()  methods 
	public static void main(String[] args) {
		// 3 create an object class 
Text_1 Text = new Text_1();
Text.run();

// 4 invoke the thread
Text.start();


	}

}
