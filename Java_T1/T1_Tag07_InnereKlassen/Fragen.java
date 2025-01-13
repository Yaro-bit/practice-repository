package demo.kurs;

public class Fragen {

	public static void main(String[] args) {
//überladen
		char x = 1;
		a(x);
		Fragen f = new Fragen();
		f.b();
		
		Fragen.a(x); //das gleiche wie drunter
		a(x);
		
		f = null;
		f.a(x);
		
	}

	private void b() {
		// TODO Auto-generated method stub
		
	}

	private static void a(int y) {
		System.out.println("integer");
	}

	private static void a(double y) {
		System.out.println("double");
	}

	private static void a(char y) {
		System.out.println("char");
	}
}
