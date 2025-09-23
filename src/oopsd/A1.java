package oopsd;

public class A1 {
void show( String b) {
	
	System.out.println("1");
}
void show(int a) {
	System.out.println("3");
}
//complie time polimorphisem
	public static void main(String[] args) {
		
		A1 ne= new A1();
		ne.show("shabaz");
		ne.show(6);
	}

}



//methods overloding achiv