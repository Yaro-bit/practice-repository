package wifi.kurs.demo.vererbung;

public class Test {

	public static void main(String[] args) {
		Basis b = new Basis();
		// get nicht b.testPrivate();
		Subklasse sub =  new Subklasse();
		System.out.println(sub);
		System.out.println(sub.getClass());
		
		
		b.testPublic();
		sub.testPublic();
		
		b.testPackage();
		sub.testPackage();
		
		
	}

}
