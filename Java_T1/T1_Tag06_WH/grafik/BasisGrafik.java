package wifi.kurs.grafik;

public abstract class BasisGrafik {
    
	
	public abstract void draw();
	/*{
		// System.out.println("ich weis nicht was ich zeichen soll");
		throw new RuntimeException("nicht implementiert");
	}*/

	@Override
	public String toString() {
		draw();
		return "BasisGrafik [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
