package wifi.kurs.einf;

import javax.swing.JOptionPane;

public class GreadeUngeradeZahl {

	public static void main(String[] args) {
		// Eingabe ganze Zahl
		String eingabe = JOptionPane.showInputDialog("bitte ganze Zahl eingeben");
		int zahl = Integer.parseInt(eingabe);
	
		// Verarbeitung ist Zahl Gerade
		boolean isGrade = true;
		// ????
		isGrade = zahl%2 == 0; // int%int -> int 0,1
		
		// Ausgabe meldung
		if (isGrade) {
			// isGrade == true
			System.out.println("Zahlt ist gerade");
		} else {
			// isGrade == false
			System.out.println("Zahlt ist ungerade");
		} 
		
	}

}
