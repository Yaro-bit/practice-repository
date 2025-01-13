package wifi.kurs.einf;

import javax.swing.JOptionPane;

public class Minimum3 {

	public static void main(String[] args) {
		
		String eingabe = JOptionPane.showInputDialog("bitte ganze Zahl eingeben");
		int zahl1 = Integer.parseInt(eingabe);
	
		eingabe = JOptionPane.showInputDialog("bitte ganze Zahl eingeben");
		int zahl2 = Integer.parseInt(eingabe);
	
		eingabe = JOptionPane.showInputDialog("bitte ganze Zahl eingeben");
		int zahl3 = Integer.parseInt(eingabe);
	
		eingabe = JOptionPane.showInputDialog("bitte ganze Zahl eingeben");
		int zahl4 = Integer.parseInt(eingabe);
		
		System.out.println("zahl1:" + zahl1 + " zahl2:" + zahl2 + " zahl3:" + zahl3); 
		
		// Verarbeitung kleinste zahl von 3 
		int minimum; //  = Integer.MIN_VALUE; // ???
	    // <, <= , >, >= , == , !=
		

		minimum = minum(zahl1, zahl2, zahl3, zahl4);
		
		// Ausgabe meldung
		System.out.println("die kleinste Zahl ist:" + minimum);

	}

	private static int minum(int zahl1, int zahl2, int zahl3, int zahl4) {
		int minimum;
		minimum = zahl1;
		if(zahl2 < minimum) {
			minimum = zahl2;
		}
		if(zahl3 < minimum) {
			minimum = zahl3;
		}
		if(zahl4 < minimum) {
			minimum = zahl4;
		}
		return minimum;
	}

}
