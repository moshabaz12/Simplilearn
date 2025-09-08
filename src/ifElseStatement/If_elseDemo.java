package ifElseStatement;

public class If_elseDemo {

	public static void main(String[] args) {
		int  tesatscor = 76;
		char grade ;
		
		if(tesatscor >= 70) {
			grade ='A';
		}else if (tesatscor >= 80) {
			grade = 'F';
		}else if(tesatscor >= 90) {
			grade = 'k';
		}else {
			grade ='h';
		}
	System.out.println("grade = : "+ grade);
		
	}

	}
