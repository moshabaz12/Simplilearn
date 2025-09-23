package oopsd;
abstract class Vehicle{
	int no_of_types;
abstract void Start();
}

class Car extends Vehicle
{
	@Override
	void Start() {
		no_of_types= 4;
		System.out.println("car start with key");
		
	}	
}
 class Scooter  extends Vehicle{
	public static void main(String[] args) {
		Car c= new Car();
c.Start();
Scooter n= new Scooter();
n.Start();
	}
	@Override
	
	void Start() {
		no_of_types=3;
		System.out.println("scooter start with key");
		
	}

}
