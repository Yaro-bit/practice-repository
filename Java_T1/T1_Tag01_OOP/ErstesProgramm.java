package wifi.kurs;

public class ErstesProgramm {

	public static void main(String[] args) {
		System.out.println("  String \u0065   ");
		
		// Variable
		// Typ name
		int anzahl = 123;
		
		
		String string = "dfsdfsdfsdfdfb dfdfdfx";
		
		System.out.println(string.length());
		System.out.println(string.charAt(0));
		System.out.println(string.charAt(string.length()-1));
			
		
		
		int ergebniss;
		
		ergebniss = add(34,23);
		
		System.out.println("ergebniss:" + ergebniss);
		
		Mitarbeiter  mitarbeiter01;
		mitarbeiter01 = new Mitarbeiter();
		mitarbeiter01.id = 123;
		mitarbeiter01.vorname = "Franz";
		
		mitarbeiter01 = null;
		System.out.println(mitarbeiter01);   // println( Object )
		if(mitarbeiter01 != null) {
			System.out.println(mitarbeiter01.toString());  // println( String)  
		}
		
		
		
	}
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	
}

class Mitarbeiter {
	int id;   // long, Integer, Long , BigInteger
	String vorname;  // <> null , lenght() >= 2 und lenght() <= 50
	
	
	
	@Override
	public String toString() {
		return "Mitarbeiter [id=" + id + ", vorname=" + vorname + "]";
	}

}