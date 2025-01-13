package Inheritance;

public class Toolbox {
    
    // The save method accepts both a Sub object and an implementation of PreInterface
    public static void save(Sub sub, PreInterface pre) {
        // Perform the saving action
        System.out.println("gespeichert");

        // Call the pre() method from the PreInterface implementation
        pre.pre();
    }
}
