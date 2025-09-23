package oopsd;

public class Animal {
//	how to cretate object oops 
	
	public void run() {
		
		System.out.println(" i am running ");
	}

	public   static void main(String[] args) {
//		same object ke thru alge alge methods call kar sakta hu
		Animal buzo = new  Animal();
		buzo.run();
		buzo.eat();
		
	}
	
	public void eat() {
		
		System.out.println(" i am eating ");
	}
	
	
	
	
		
	}


