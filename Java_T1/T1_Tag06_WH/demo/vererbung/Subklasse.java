package wifi.kurs.demo.vererbung;

public class Subklasse extends Basis {
	
	private void testPrivate() {  // neue Methode
		
	}

	@Override
	public void testPublic() {
		System.out.println("Subklasse testPublic");
	}

	@Override
	public void testPackage() {  // https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#liskov-substitution-principle
		// TODO Auto-generated method stub
		super.testPackage();
	}
	
	
}
