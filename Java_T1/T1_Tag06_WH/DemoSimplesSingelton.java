package wifi.kurs;

public class DemoSimplesSingelton {

	private static DemoSimplesSingelton exemplar = new DemoSimplesSingelton(); // einziges Object
	
	private DemoSimplesSingelton() {}
	
	public static DemoSimplesSingelton getInstance() {
		return exemplar;
	}
	public static void main(String[] args) {
		DemoSimplesSingelton ob1 = DemoSimplesSingelton.getInstance();
		DemoSimplesSingelton ob2 = DemoSimplesSingelton.getInstance();
		DemoSimplesSingelton ob3 = DemoSimplesSingelton.getInstance();

	}

}
