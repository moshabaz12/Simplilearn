package deepakmultithreadinfD;

class BookThaterSeat  extends Thread{
	int total_seats=10;
	synchronized void bookSeat(int seats) {
		
		if(total_seats>=seats) {
			System.out.println(seats+"seats booked successfully");
//			System.out.println("seats left : ");
			System.out.println("seats left : "+ total_seats);
		}
		else{
			System.out.println("sorry seats can not be book ...!!");
			System.out.println("seats left : "+ total_seats);
			
		}
	}
}
public class MoviBook extends Thread {
 static BookThaterSeat b;
 int seats;
public void run() {
	b.bookSeat(seats);
	}
public static void main(String[] args) {
	
	b= new BookThaterSeat();
	MoviBook shabaz = new MoviBook();
	shabaz.seats=7;
	shabaz.start();
	
	MoviBook roman=new MoviBook();
	roman.seats = 6;
	roman.start();
	}
}

