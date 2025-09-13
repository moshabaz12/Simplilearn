package deepaksirOOPS;


class A3 {
    void show() {
        System.out.println("Show...");
    }
}

class B3 extends A3 {
    void disp() {
        System.out.println("Disp....");
    }
}

class C2 extends A3 {
    void area() {
        System.out.println("Area....");
    }

}
public class Hirarichal {

	public static void main(String[] args) {
		 C2 c = new C2();
	        c.show();  // Parent class method
	        c.area();  // C2 class method

	        B3 b = new B3();
	        b.show();  // Parent class method
	        b.disp();  // B3 class method

	}

}
