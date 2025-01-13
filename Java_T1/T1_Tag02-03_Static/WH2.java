package demo.kurs;

import java.util.Iterator;

public class WH {

	public static void main(String[] args) {
		// 
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		String append = "";
		for (int i = 0; i < 100;) {
			append += i++;
		}
		System.out.println(append);
		
		// 
		int i = 0;
		i  = 3 * 2 + 5 + i++ - ++i ;
		// ->
		i  = 3 * 2 + 5;
		i = i + i++;
		i = i - ++i;
		
		int a,b[],c;  // bed smells
		
		// Typ[] name
		
		int[] intArray = new int[10];
		// frag chatgpt
		
		
		// Objekte versus variablen
        // Typ namen
		int anzahl;
		anzahl = Integer.MAX_VALUE;
		System.out.println(anzahl);
		System.out.println(++anzahl);
		
		String str;  // referenz
		str = null;
		str = "Hallo";
		str = new String("");
		
		//
		Integer refInt = 123;  // autoboxing
		
		Person p1 = null;
 		System.out.println(p1.id);
		
	}

}
class Person {
	
	int id;  // Instanzvariable, Eigenschaft  ...
	
}

