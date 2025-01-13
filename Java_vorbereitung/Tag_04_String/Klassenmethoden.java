package demo;

import javax.swing.JOptionPane;

public class Klassenmethoden {

	public static void main(String[] args) {
		// EVA  -> 
		int zahl = einlesenInt("bitte eine ganze Zahl eingeben");
		System.out.println(zahl);
	}

	public static int einlesenInt(String text) {
		int retValue = 0;
		
		boolean isValidNumber = false;
		do {
			String eingabe = JOptionPane.showInputDialog(text);
			try {
				// String in int umwandeln
				int number = Integer.parseInt(eingabe);
				retValue = number;
				isValidNumber = true;
				System.out.println("Der umgewandelte Integer ist: " + number);
			} catch (NumberFormatException e) {
				System.out.println("Ungültige Zahl: " + eingabe);
			} 
		} while (!isValidNumber);
		
		return retValue;
	}

}

