package oopsd;

class Employe{
	
	String name ;
	int employe_id;
	
	Employe( String name , int employe_id){
		this .name= name;
		this.employe_id = employe_id;
		
	}
}
public class Constractor {

	public static void main(String[] args) {
		
		Employe e1 = new Employe("shabaz", 1);
		Employe e2 = new Employe("khan", 2);
		
		System.out.println(e1.name+"  "+e1.employe_id);
		System.out.println(e2.name+"  "+e2.employe_id);
		
	}

}
