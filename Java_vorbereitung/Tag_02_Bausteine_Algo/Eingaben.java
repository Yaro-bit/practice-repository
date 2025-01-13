package wifi.kurs.einf;

import javax.swing.JOptionPane;

public class Eingaben {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("bitte was eingeben");

		System.out.println(eingabe);
		// String eingabe -> int
		int zahl = Integer.parseInt(eingabe);
		
		System.out.println("berechne: zahl * 2 + 5 - 1:" + ( zahl * 2 + 5 - 1));
		
		
		
		

	}

}
