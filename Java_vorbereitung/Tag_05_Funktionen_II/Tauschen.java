package demo.kurs;

public class Tauschen {

	public static void main(String[] args) {
		// 
		int a = 5;
		int b = 7;
		
		// ???
		// tauschen(a,b);
		
		int[] intA = {a};
		int[] intB = {b};
		tauschen(intA,intB);
		
		IntHolder aHolder = new IntHolder();
		aHolder.wert = a;
		//...
		// tauschen(aHolder,aHolder);
		
		
		System.out.println("a:" + intA[0]);
		System.out.println("b:" +  intB[0]);

	}

	private static void tauschen(int[] intA, int[] intB) {
		int help;
		help = intA[0];
		intA[0] = intB[0];
	    intB[0] = help;
	}

	private static void tauschen(int a, int b) {
		int help;
		help = a;
		a = b;
		b = help;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}

}

class IntHolder {
	int wert;
}