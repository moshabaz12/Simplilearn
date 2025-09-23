package oopsd;

class Animal32{
	
	void eat() {
		
		System.out.println("i am eeating a foods");
	}
}
//simple in heritence in java 
public class Dog  extends Animal32{

	public static void main(String[] args) {
		Dog t = new Dog();
		t.eat();

	}

}
