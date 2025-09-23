package oopsd;

class A{
	
	void showA() {
		
		System.out.println("hello shabaz");
	}
}

class B   extends  A{
	void showB() {
		
		System.out.println("hello roman ");
	}
}
public class C extends  B  {

	void  showC () {
		System.out.println("hello arman ");
	}
	public static void main(String[] args) {

C he = new C ();
he.showA();
he.showB();
he.showC();

	
	}

}
