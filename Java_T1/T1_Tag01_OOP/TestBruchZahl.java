package wifi.kurs;

public class TestBruchZahl {

	public static void main(String[] args){
		// Test für Bruchzahlen
		
		BruchZahl b1 = new BruchZahl();
		// b1.zähler = Integer.MAX_VALUE + 1;
		b1.setZähler(1);
		try {
			b1.setNenner(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
	
//		try {
//			int[] groesserIntArray = new int[999999999];
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
		
		double wert = b1.toDouble();
		System.out.println(wert);
		
		System.out.println(b1);
		
		b1.setZähler(1);
		b1.setNenner(2);
		BruchZahl b2 = new BruchZahl();
		b2.setZähler(1);
		b2.setNenner(3);
		
		BruchZahl erg = b1.mul(b2);
		System.out.println(erg);
		
	}

}
