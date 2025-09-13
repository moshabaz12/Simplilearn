package deepaksirOOPS;


class A2 {
    void show() {
        System.out.println("Show....");
    }
}

class B2 extends A2 {
    void disp() {
        System.out.println("Disp....");
    }
}

class C1 extends B2 {
    void area() {
        System.out.println("Area...");
    }

}
public class Multilevel {

	public static void main(String[] args) {
		
		 C1 c = new C1();
	        c.show();  // A2 class method
	        c.disp();  // B2 class method
	        c.area();  // C1 class method
	}

}
