package demo.kurs;

public class TestBruchZahl {

	public static void main(String[] args) {
		
		BruchZahl b1 = new BruchZahl(1, 2);
		BruchZahl b2 = new BruchZahl(1, 3);;
		//ToolBoxBruchzahl td = new ToolBoxBruchzahl();
		BruchZahl erg = ToolBoxBruchzahl.mul(b1, b2);
		System.out.println(ToolBoxBruchzahl.toString(erg));

	}

}
