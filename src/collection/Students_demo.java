package collection;
// clasess start
public class Students_demo {

	String name;
	int age;
	String address;
	
	public  Students_demo (String name, int age, String address){
		
this.name = name;
this.age = age;
this.address= address;

	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setaddress(String address) {
		this.address = address;
		
	}
	public String getName() {
		return name;
	}
public int getAge() {
	return age;
}
public String getaddress() {
	return address;
}
public String toString() {
	return("Name is : " +this.getName() +" Age is :" + this.getAge()+" Addres is : "+this.getaddress());
}
public static void main (String []args ) {
	Students_demo  john = new Students_demo  ("john ", 25 ,  "23 East, California");
	System.out.println(john.getName());
	System.out.println(john.getAge());
	System.out.println(john.getaddress());
}
}
