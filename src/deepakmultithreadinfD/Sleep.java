package deepakmultithreadinfD;

public class Sleep {
//	public static void sleep(long mili ) throws InterruptedException
//	public static void sleep(int  name) throws InterruptedException
//	
	public static void main(String[] args) {
		for (int i =1; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			}catch(Exception e) {
				System.out.println(e);
			}
			}

	}

}
