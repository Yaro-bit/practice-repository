package wifi.kurs.demo.vererbung;

public class Basis extends Object{

	private void testPrivate() {
		
	}

	@Override
	public String toString() {
		return "Basis []";
	}
	
	public void testPublic() {
		System.out.println("Basis testPublic");
	}
	
    /*void testPackage() { // ist Ein
    	System.out.println("Subklasse testPackage");
	}
	
    protected void testPackage() { // ist Ein
    	System.out.println("Subklasse testPackage");
	}
	*/
	
      public void testPackage() { // ist Ein
	   	System.out.println("Subklasse testPackage");
      }

	
}
