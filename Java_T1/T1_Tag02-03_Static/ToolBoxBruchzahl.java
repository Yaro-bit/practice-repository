package demo.kurs;

public class ToolBoxBruchzahl {

	private ToolBoxBruchzahl() {};  // keine Objekte 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // BruchZahl 
		
		ToolBoxBruchzahl obj = new ToolBoxBruchzahl();
	}

	public void methodeVomObject() {
		
	}
	
	public static BruchZahl mul(BruchZahl o1, BruchZahl o2) {
		BruchZahl retValue = new BruchZahl();
		
		retValue.setZähler(o1.getZähler() * o2.getZähler());
		retValue.setNenner(o1.getNenner() * o2.getNenner());
		// -> kürzen
		return retValue;
	}
	// 

	public static String toString(BruchZahl erg) {
		String toStr = "";
		toStr = toStr + erg.getZähler() + "/" + erg.getNenner();
		return toStr;
	}
	
}
