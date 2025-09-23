package oopsd;

class Employee {
	
	 private int empid;
	 public void setEmpid(int eid) {
		 empid = eid;
	 }
	 public int getEmpid() {
		 return empid;
	 }
}


public class Company {

	public static void main(String[] args) {
		
		Employee  he = new Employee();
		he.setEmpid(1);
		System.out.println(he.getEmpid());
		
		
	}

}
