package wifi.kurs.einf;

public class Ausdruecke {

	public static void main(String[] args) {
		int zahl = 1;
		
		zahl = 1 + 3 * 4 / 4;   // int + int * int / int -> int
		
		zahl = 1 / 2;  // int / int -> int
		
		System.out.println("zahl:" + zahl);
		
		double kommaZahl = 1 / 2; // int / int -> int	
		System.out.println("kommaZahl:" + kommaZahl);
		
		kommaZahl = 1.0 / 2; // double / int -> double	
		System.out.println("kommaZahl:" + kommaZahl);
		
		kommaZahl = 1 / (double)2; // int / double -> double	
		System.out.println("kommaZahl:" + kommaZahl);
		
	}

}
