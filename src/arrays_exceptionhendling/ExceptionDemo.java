package arrays_exceptionhendling;

import java.io.FileInputStream;

public class ExceptionDemo {

    public static void main(String[] args) {

        // File Not Found Exception
        try {
            FileInputStream fi = new FileInputStream("d:/abc.txt");
        } catch (Exception e) {
            System.out.println(e);
           
        }

        // Class Not Found Exception
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        // Arithmetic Exception (/ by zero)
        try {
            int a = 10, b = 0, c;
            c = a / b;   // exception yahan aayega
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        }

        // No Exception Example
        System.out.println("1");
        try {
            System.out.println("2");
            int a = 10, b = 2, c;
            System.out.println("3");
            c = a / b;  // yahan 10/2 = 5
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");
        } catch (ArithmeticException e) {
            System.out.println("6");
            System.out.println(e);
            System.out.println("7");
        }
        System.out.println("8");
       
    }
}
