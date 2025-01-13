package demo.wifi;

import ch.aplu.turtle.Turtle;

public class Schildkröte {

	public static void main(String[] args) {
		Turtle t1 = new Turtle();

//
//		t1.right(90);
//		t1.forward(100);
//		t1.right(90);
//		t1.forward(10);
//		t1.right(90);
//		t1.forward(100);
//		t1.left(90);
//    	t1.forward(10);
//		t1.left(90);
//		
//		t1.forward(100);
//		t1.right(90);
//		t1.forward(10);
//		t1.right(90);
//		t1.forward(100);
//		t1.left(90);
//    	t1.forward(10);
//		t1.left(90);
		
		int anzahl = 0;
		while (anzahl < 3) {
			t1.forward(100);
			t1.right(90);
			t1.forward(10);
			t1.right(90);
			t1.forward(100);
			t1.left(90);
			t1.forward(10);
			t1.left(90);
			
			anzahl++;  // anzahl = anzahl + 1 // anzahl += 1
		}
		// sinnlos anzahl = anzahl++;
	}

}
