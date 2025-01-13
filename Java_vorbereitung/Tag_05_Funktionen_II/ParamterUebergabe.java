package demo.kurs;


public class ParamterUebergabe {

	public static void main(String[] args) {
     
        ParamterUebergabe p = new ParamterUebergabe();
        p.printHallo();
        
        
        int[][] int2DimArray = {{10,11},{12,13,14},{15,16,17,18},null}; // {  int[] ,int[] };
		//print2Array( int2DimArray);
		//print2Array( null);
		
		int a = 1;
		test(a );
		
		StringBuffer sb = new StringBuffer("xyz");
		test(sb );
		System.out.println(sb);
		
		
		String str = "xyz";
		test(str);
		System.out.println(str);
	}
	
	private static void test(String str) {
		str = str + "123";
		System.out.println(str);
	}

	private static void test(StringBuffer sb) {
		sb.append("123");
		sb = null;
		
	}
	private static void test(int a) {
		a = -1;
		
	}







	public static void keineRückgabe() {
		
		
	}
	
	public static void print2Array(int[][] int2Dim) {
		// prüfen auf != null
		for (int i = 0; i < int2Dim.length; i++) {
			// System.out.println(int2Dim[i]); 
			printZeile(int2Dim[i]); // zeile int[]
		}
	}
	
	private static void printZeile(int[] zeile) {
		// prüfen auf != null
		// Arrays.toString(zeile)
		for (int i = 0; i < zeile.length; i++) {
			System.out.print(zeile[i]);
			if (i < zeile.length - 1) {
				System.out.print(",");
			}
			
		}
		System.out.println();
	}

	public void printHallo() {
		System.out.println("Hallo");
	}

}
