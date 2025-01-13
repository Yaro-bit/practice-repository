package wifi.kurs;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WH {
    class InnerClass {
    	
    }
	public static void main(String[] args) {
		// Typ  name
		int anzahl;
		boolean isOkay;
		// enums
		String nichtÄnderbareZeichenkette; // unicode
		nichtÄnderbareZeichenkette = null;

		StringBuilder  sb = new StringBuilder();  // StringBuffer
		
		// Geld 
		BigDecimal konto = new BigDecimal("1233");
		
		// double  float
		double messwert;
		
		BigInteger großeGanzeZahl; 
		
		// Kunde 
		// id
		// vorname
		// nachname 
		// ...
		Kunde kunde1 = new Kunde();
		//kunde1.
		kunde1.setId(1);
		kunde1.vorname = "Franz";
		kunde1.setNachname("U.");
		Toolbox.print(kunde1);
		kunde1.print();
		
		Kunde kunde2 = new Kunde();
		kunde2.print();
		
		
		// 1000 zeilen code 2 wochen ..
		kunde1.setNachname(null); // 
		kunde1.setId(-1);
	}
}
class Kunde {
// Daten	
	private int id;  // key > 0 < 1000000 und unique
	
	// https://www.infoq.com/presentations/Null-References-The-Billion-Dollar-Mistake-Tony-Hoare/
	String vorname = ""; // "nachpfelgen";
	private String nachname;
	
	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Kunde [id=" + getId() + ", vorname=" + vorname + ", nachname=" + getNachname() + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @param nachname the nachname to set
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
}
class Toolbox {
// Programme für Kunden
	public static void print(Kunde k) {
		System.out.println("Kunde " + "id:" + k.getId());
		
	}
   	
	
	
}
