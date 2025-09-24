package stringdd;

public class StringBuffers {

	public static void main(String[] args) {
		
StringBuffer name =  new StringBuffer("shabaz");
System.out.println(name.capacity());


StringBuffer Name =  new StringBuffer(1000);
System.out.println(Name.capacity());

name.append("hello");
System.out.println(name.capacity());



StringBuffer shabaz= new StringBuffer("khanroman");
//System.out.println(shabaz.delete(2, 5));
System.out.println(shabaz.deleteCharAt(1));



StringBuffer hello= new StringBuffer("khanzubair");
StringBuffer hello1= hello.append("hi"); new StringBuffer("khanzubair");
System.out.println(hello.equals(hello1));//StringBuffer class does not override equals methods


StringBuffer nobita = new  StringBuffer("hello java ");
System.out.println(nobita.insert(2, "see"));
	}

}
