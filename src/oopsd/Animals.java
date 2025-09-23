package oopsd;
public class Animals {
	String color ;
	int age;
	void initObj(String c, int  a) {
		
		color = c;
		age  = a;
	}
	void display() {
		System.out.println(color +"   "+ age );
	}
	public static void main(String[] args) {
	Animals hello = new Animals ();
	hello.initObj("black", 45);
	hello.display();
	}
	}
	