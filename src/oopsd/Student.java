package oopsd;
public class Student {
	int student_id;
	String name; 
	String company;
	Student(int student_id , String name , String company  ){
		this.student_id=student_id;
		this .name=name;
		this .company=company;
	}
	void display() {
		System.out.println(student_id+" "+name+" "+company);
	}
	public static void main(String[] args) {
		
		Student hell = new Student( 1, "Shabaz","Airtel" ); 
			hell.display();
			Student hell1 = new Student( 1, "Roman","Airtel" );
			hell1.display();
		}
	

}
