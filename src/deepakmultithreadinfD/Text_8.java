package deepakmultithreadinfD;

public class Text_8 {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("shabaz");
		System.out.println(Thread.currentThread().getName());
	}

}

