package oopsd;


class A9{
	
	int i = 10;
	
}
public class B10  extends A9{
int  i = 20;
void show (int i) {
	System.out.println(i);
	System.out.println(this.i);
	System.out.println(super.i);
}
	public static void main(String[] args) {
	
B10 hello = new B10();
hello.show(28);
	}

}
