package demo.kurs;

import java.math.BigDecimal;

public class TestRechnung {

	public static void main(String[] args) {
		Rechnung r1 = new Rechnung();
		//r1.setRec
		
		r1.setRngNummer(1);
		RechnungsPosistion pos = new RechnungsPosistion() ;
		pos.artikelnr = 100;
		pos.menge = 3;
		pos.preis = new BigDecimal("12.34");
		r1.add(pos );
		// pos = null;
		System.out.println(r1);
		// 1000 Zeilen Code

		

		
		pos.menge = 100;
		System.out.println(r1);

	}

}
