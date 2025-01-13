package wifi.kurs.einf;

import javax.swing.JOptionPane;

public class WH {

	public static void main(String[] args){
		// typ name  
		int ganzeZahl;
		
		double messwert;
		
		char zeichen = 'A';
		zeichen = '\u0065';
		
		boolean ok = true;
		
		ganzeZahl = Integer.MAX_VALUE;
		System.out.println(ganzeZahl); 
		System.out.println(++ganzeZahl); 
		
		
		//System.out.println(ganzeZahl/0);  // int / int -> int
		
		
		System.out.println("nacher");
		
		
		messwert = 0.0/0.0;
		
		System.out.println(messwert);
		System.out.println(messwert);  
		// int Integer
		// double Double
		// char Char
		System.out.println(Double.isNaN(messwert));
	
		
		// Daten modellieren

		//##############
		
		String zeichenKette = "Das ist ein Object vom Typ/Klasse String";
		
		System.out.println(zeichenKette + " ...." + zeichen);
	
		
		String eingabe = JOptionPane.showInputDialog("bitte was eingeben");
		
		System.out.println(eingabe);
		
		
		
	}

}
