package wifi.kurs;

import java.applet.Applet;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class WH {

	public static void main(String[] args) {
		// Klasse
		// Java Bean -> Klasse default Konstruktor

		// Konstruktor   -> 1/0!!!  null  -> Objekt oder Exception
		// Fabrikmethode  -> null
		// clone	shallow copy 
		// serilisieren und deserlisiern -> deep copy   https://stackoverflow.com/questions/64036/how-do-you-make-a-deep-copy-of-an-object
		
		
		A a = new A();
	    // https://stackoverflow.com/questions/12592520/example-of-factory-pattern-in-java-jdk
		// https://www.baeldung.com/java-constructors-vs-static-factory-methods  -> Homework
		
		Runtime runtime = Runtime.getRuntime();
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		DemoSimplesSingelton obj1 = DemoSimplesSingelton.getInstance();
		DemoSimplesSingelton obj2 = DemoSimplesSingelton.getInstance();
		DemoSimplesSingelton obj3 = DemoSimplesSingelton.getInstance();
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj3.hashCode());
		
	
	}

}
