package demo.kurs;

public class FunktionenDemo {

	public static void main(String[] args) {
		  int summe = summeVonN(50000);

		  System.out.println(summe);
		  System.out.println(summeVonN2(50000));
		  
		  
		  
		  int fact = fakturelle(5);
		 
		System.out.println(fact);
		  
	}

	private static int fakturelle(int n) {
        int fact = 1;
        // 3
        
//        fact = 1;
//        fact = 1 * 2;
//        fact = 1 * 2 * 3;  
//        fact = 1 * 2 * 3 * 4;
//        fact = 1 * 2 * 3 * 4 * 5;  
//
//        fact = 1;
//        
//        fact = fact * 1;
//        fact = fact * 2;
//        fact = fact * 3;  
//        fact = fact * 4;
//        fact = fact * 5;  
//        
        int v = 1;
        
//        fact = fact * v;
//        v++;
//        fact = fact * v;
//        v++;
//        
        while (v <= n) {
			fact = fact * v;
			v++;
		}
		return fact;
	}

	public static int summeVonN2(int zahl) {
		return (zahl * (zahl + 1)) / 2;
	}
		
	public static int summeVonN(int zahl) {
		int summe = 0;
		
//		summe = 1;
//		summe = 1 + 2; 
//		summe = 1 + 2 + 3;
//		summe = 1 + 2 + 3 + 4;
//		summe = 1 + 2 + 3 + 4 + 5;
//		
//		summe = 0;
//		
//		summe = summe + 1;
//		summe = summe + 2; 
//		summe = summe + 3;
//		summe = summe + 4;
//		summe = summe + 5;
//		
//		summe = 0;
//		int v = 1;
//		summe = summe + v;
//		v++;
//		summe = summe + v;
//		v++;
//		summe = summe + v;
//		v++;
//		summe = summe + v;
//		v++;
//		summe = summe + v;
//		v++;
//		summe = summe + v;
//		v++;
//		summe = summe + v; 
//		summe = summe + v;
//		summe = summe + v;
//		summe = summe + v;
		
		summe = 0;
		int v = 1;
		while(v <= zahl  ) {
			summe = summe + v;
			v++;
		}
		
		
		return summe;
	}

}
