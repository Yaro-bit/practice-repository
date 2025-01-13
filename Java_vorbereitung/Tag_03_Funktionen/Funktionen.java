package demo.wifi;

import javax.swing.JOptionPane;

public class Funktionen {

	public static void main(String[] args) {
		// E V A
		
		String eingabe = einlesenString("Bitte einen String eingben");
		System.out.println(eingabe);
		
		int eingabeInt = einlesenInt("Bitte einen int eingben");
		System.out.println(eingabeInt);
		
	}

	public static int einlesenInt(String text) {
		String eingabe =  einlesenString(text);
		
		return Integer.valueOf(eingabe);
	}

	public static String einlesenString(String text) {
		String eingabe = JOptionPane.showInputDialog(text);
		
		return eingabe;
	}

}
