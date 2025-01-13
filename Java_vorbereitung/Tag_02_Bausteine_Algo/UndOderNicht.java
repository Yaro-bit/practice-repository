package wifi.kurs.einf;

import javax.swing.JOptionPane;

public class UndOderNicht {

	public static void main(String[] args) {
		// &&  || !     & | 
		
		int a = 5;
		int b = 10;
		
		if ( a < b || b > a) {
			// a != b
		}
        // entscheidungtabellen
		
	//	&&  , || , !   op für boolean
		 
	//	& , |, !       op für bit
		
		if ( a < b || b > a++) {  // mit kurzschluss auswertung
			// a != b
		}
		if ( a < b | b > a++) { // ohne kurzschlussauswertung
			// a != b
		}
		
		a = a++;  // -> schwer leserlich 
		++a;
		
		String eingabe = JOptionPane.showInputDialog("nix eingeben");
		
		System.out.println(eingabe);
		//System.out.println(eingabe.length());
		
		int längeEingabe = 0;
		if(eingabe != null && eingabe.length() > 0 ) {
			System.out.println(eingabe.charAt(0));
		}
		
		
		
		
		
		
	}

}
