package demo.wifi;

import java.io.File;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


public class WH {
     
	public static void main(String[] args) {

		//Double d = Double.valueOf(1.22);
		java.math.BigInteger grz;  // ganz Grosse Zahlen
		String zeichenKetten = "Hallo \n  \u00aa    \\ " + File.pathSeparator + File.separator;
		
		System.out.println(zeichenKetten);
		
		double messwert = 1.1234567;
		
		BigDecimal konto;
		
		// Typ wert
		int ganzeZahl = 1233*2;
		int a,b,c;
		
		a = b = c = 10;  // eher nicht verweden
		
		// Typ -> Klassen
		BigDecimal refDecimal = null;
		MathContext mc = new MathContext(100, RoundingMode.HALF_UP);
		refDecimal = new BigDecimal("1.23232323232323232323232323232323454343434",mc );
		refDecimal = refDecimal.multiply(refDecimal);
		System.out.println(refDecimal);
		
	}
}
