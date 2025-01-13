package demo.wifi;

import ch.aplu.turtle.Turtle;

public class Schildkröte2 {

	public static void main(String[] args) {
		Turtle t1 = new Turtle();


		
		int anzahl = 0;
		while (anzahl < 36) {
			t1.forward(1);
			t1.right(10);
			
			
			anzahl++;  // anzahl = anzahl + 1 // anzahl += 1
		}
		// sinnlos anzahl = anzahl++;
	}

}
