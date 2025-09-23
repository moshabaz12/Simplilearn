package oopsd;

// Interface definition
public interface Birds {
    void show();
}

// Class implementing the interface
class Tirad implements Birds {

    // Implementing the abstract method from Birds interface
    public void show() {
        System.out.println("Hello Java Programmer");
    }

    // Main method to run the program
    public static void main(String[] args) {
        Tirad se = new Tirad();
        se.show();
    }
}
