package wifi.kurs.einf;

import javax.swing.JOptionPane;

public class Minimum {

	public static void main(String[] args) {
		
		String eingabe = JOptionPane.showInputDialog("bitte ganze Zahl eingeben");
		int zahl1 = Integer.parseInt(eingabe);
	
		eingabe = JOptionPane.showInputDialog("bitte ganze Zahl eingeben");
		int zahl2 = Integer.parseInt(eingabe);
		
		
		System.out.println("zahl1:" + zahl1 + " zahl2:" + zahl2);
		
		// Verarbeitung kleinste zahl
		int minimum; //  = Integer.MIN_VALUE; // ???
	    // <, <= , >, >= , == , !=
//		
//		if(zahl1 < zahl2) {
//			//zahl1 < zahl2
//			minimum = zahl1;
//		} else {
//			// //zahl1 >=  zahl2
//			minimum = zahl2;
//		}
		
		minimum = zahl1;
		if(zahl2 < minimum) {
			minimum = zahl2;
		}
		
		// Ausgabe meldung
		System.out.println("die kleinste Zahl ist:" + minimum);

	}

}
