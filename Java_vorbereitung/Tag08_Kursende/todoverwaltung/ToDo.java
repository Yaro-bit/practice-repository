package demo.todoverwaltung;

import java.io.Serializable;
import java.util.Date;

// Datenkapsel
// java date to string germany -> https://chatgpt.com/
// Clonable, Serilzable, Compareable, equals hashcode, set/get ...
// https://projectlombok.org/

public class ToDo implements Serializable {
    int id;
    String aufgabe;
	Date anlageDatum = new Date();
	
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", aufgabe=" + aufgabe + ", anlageDatum=" + getGermanDate(anlageDatum) + "]";
	}

	private String getGermanDate(Date anlageDatum2) {
		// chatgpt
		return anlageDatum2.toString();
	}

	public static void main(String[] args) {
		// Testcode für Todo
		ToDo t1 = new ToDo();
		t1.id = 1;
		t1.aufgabe = "erste aufgabe";
		t1.anlageDatum = new Date();
		
		
		System.out.println(t1);
	}

}
