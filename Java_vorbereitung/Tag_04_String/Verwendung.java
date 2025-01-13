package demo;

public class Verwendung {

	public static void main(String[] args) {
		int zahl1 = Klassenmethoden.einlesenInt("bitte zahl1 eingeben");
		int zahl2 = Klassenmethoden.einlesenInt("bitte zahl2 eingeben");
		int zahl3 = Klassenmethoden.einlesenInt("bitte zahl3 eingeben");
		
		// minimum von 3 zahlen
     	int min = Integer.MAX_VALUE;
		
//		min = Math.min(zahl1, zahl2);
//		min = Math.min(min, zahl3);
		
    	min = minVonDreiZahlen(zahl1, zahl2, zahl3);
		
		//
		System.out.println(min);
	}

	public static int minVonDreiZahlen(int zahl1, int zahl2, int zahl3) {
		
		return Math.min(zahl3, Math.min(zahl1, zahl2));
		
	}

	
}
