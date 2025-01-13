package Inheritance;

public class Sub extends Basis {
    @Override
    public void test() {
        // You could modify the behavior here, or just call the parent method.
        System.out.println("In Sub class - Before calling save()");
        super.test();  // Calls the test() method from Basis, which in turn calls save()
    }

    // Optionally override pre() to change behavior in Sub
    @Override
    protected void pre() {
        System.out.println("pre method in Sub");
    }
}
