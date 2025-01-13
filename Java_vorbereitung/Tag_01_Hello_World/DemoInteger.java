package demo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DemoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 2147483647;
		System.out.println(a1);
		a1++; // a = a + 1;
		System.out.println(a1);

		// System.out.println(a/0); // prüfen
		// typ name
		BigInteger ganzGrosseZahl;
		ganzGrosseZahl = new BigInteger("1232324343434545454546565656565657767677676768686886868686");
		ganzGrosseZahl = ganzGrosseZahl.multiply(ganzGrosseZahl);
		System.out.println(ganzGrosseZahl);

		///

		double ungenaueZahl = 0.01 * 100;

		System.out.println(ungenaueZahl);
		double a = 0.1;
		double b = 0.2;
		double sum = a + b;

		// Erwartetes Ergebnis: 0.3
		System.out.println("Summe: " + sum);

		// Überprüfen, ob die Summe gleich 0.3 ist
		if (sum == 0.3) {
			System.out.println("Die Summe ist genau 0.3.");
		} else {
			System.out.println("Die Summe ist nicht genau 0.3. Tatsächlicher Wert: " + sum);
		}

		// Geld Konto
		
		BigDecimal konto;
		konto = new BigDecimal(1);
		
		System.out.println(konto.divide(new BigDecimal(4000)));
		
	}

}
