package wifi.kurs.grafik;

public class Kreis extends BasisGrafik {
	private Punkt mittelPunkt;
	private int radius;
	
	
	public Kreis(Punkt mittelPunkt, int radius) {
		super();
		this.mittelPunkt = mittelPunkt;
		this.radius = radius;
	}


	@Override
	public void draw() {
		System.out.println("Ich zeiche einen Kreis .....");
	}
	
	
}
