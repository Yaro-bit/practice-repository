package demo.wifi;
// https://projectlombok.org/

public class DemoLagerstand {
    private int lagerstand;
    private String artikel;
     
	public int getLagerstand() {
		return lagerstand;
	}
	public void setLagerstand(int lagerstand) {
		// 
		this.lagerstand = lagerstand;
	}
	@Override
	public String toString() {
		return "DemoLagerstand [lagerstand=" + lagerstand + ", artikel=" + artikel + "]";
	}
	public String getArtikel() {
		return artikel;
	}
	public void setArtikel(String artikel) {
		this.artikel = artikel;
	}
     
	
	

}
