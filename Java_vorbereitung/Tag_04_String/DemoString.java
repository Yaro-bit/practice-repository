package demo;

public class DemoString {

	public static void main(String[] args) {
		String zeichenkette = "abc";
		zeichenkette = zeichenkette  + 'd' + "ef";
		
		System.out.println(zeichenkette);
		
		StringBuilder sb = new StringBuilder(zeichenkette);
		for (int i = 0; i < 1000000; i++) {
			//zeichenkette = zeichenkette  + 'd' + "ef";
			sb.append('d');
			sb.append("ef");
		}
		zeichenkette = sb.toString();
		// System.out.println(zeichenkette);
		
		
		// vergleichen
		// == 
		String a = "abc";
		String b = "abc";  // String b = a;
		String c = new String("abc");  // new String(a);
		
		System.out.println(a==b);
		System.out.println(b==c);
		
		System.out.println(a.equals(b)); // richtig
		System.out.println(b.equals(c));

		
		// StringBuilder u StringBuffer
		StringBuffer sbu1 = new StringBuffer("a");
		StringBuffer sbu2 = new StringBuffer("a");
		
		System.out.println(sbu1==sbu2);
		System.out.println(sbu1.equals(sbu2));
		System.out.println(sbu1.toString().equals(sbu2.toString())); // richtig
		
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder sb2 = new StringBuilder("a");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString())); // richtig
		
		
		
	
		
	}

}
