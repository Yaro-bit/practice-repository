package wifi.kurs;

public class MyA extends A {

	@Override
	void testMethod() {
		// log nicht verweden
		throw new RuntimeException("Klasse a nicht verweden");
	}

}
