package access_modifir;

public class FourAccessModifires {
	
	
	private  static   void m2() {
		System.out.println("this is private access modifires");
	}
	public void m1() {
		System.out.println("this is public access modifires");
	}

	protected void m3() {
		System.out.println("this is protected access mofifires");
	}

	void m4() {
		System.out.println("this is defualt access modifires");
	}

public static void main(String [] args ) {
	
	FourAccessModifires.m2();
	
	 
} 
	
}
