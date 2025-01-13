package demo.kurs;

public class Ziffernsumme {

	public static void main(String[] args) {

		int zahl = 1111212;  // 1 + 2 + 3 -> 6

		int summe = ziffernsumme(zahl);
		System.out.println(summe);
		
	}

	private static int ziffernsumme(int zahl) {
		int summe = 0;
		
		String ziffern = "" + zahl;
		int z;
		
//		z = ziffern.charAt(0) - '0' ;
//		summe = summe + z;
//		
//		z = ziffern.charAt(1) - '0' ;
//		summe = summe + z;
//		
//		z = ziffern.charAt(2) - '0' ;
//		summe = summe + z;
		int i = 0;
		while (i < ziffern.length()) {
			z = ziffern.charAt(i) - '0' ;
			summe = summe + z;
			i++;
		}
		
		return summe;
	}

}
