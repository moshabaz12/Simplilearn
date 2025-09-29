package deepakmultithreadinfD;

public class Yield  extends Thread{
	public void run() {
		
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+1);
		}
	}

	public static void main(String[] args) {
	
		Yield h4= new Yield();
		h4.start();
//		Thread.yield(); if you went main methods to stop and provide chance to other  thread for excution
		for(int i = 1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}

}
