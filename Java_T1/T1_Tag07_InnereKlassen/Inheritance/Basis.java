package Inheritance;

public abstract class Basis {

    // Method that is called from outside to test functionality
    public void test() {
        save(); // Call the save method
        PreInterface pre = new PreInterface() {  // Anonymous class implementing PreInterface
            @Override
            public void pre() {
                System.out.println("pre klasse in Basis");
            }
        };
        pre.pre(); // Call the pre method of the anonymous class
    }

    // Save method that is responsible for storing and calling pre()
    public void save() {
        System.out.println("gespeichert");
        pre();  // Call the pre method
    }

    // Protected method to allow access in subclasses or within the package
    protected void pre() {
        System.out.println("pre method in Basis");
    }

    // Interface with a pre() method
    public interface PreInterface {
        void pre();  // Method to be implemented in anonymous class
    }
}
