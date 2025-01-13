package wifi.kurs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JFrame;

public class WH {

	public static void main(String[] args) {

		LoadStoreToolbox.speichern("ich bin ein String", "DateiMitString.bin");
		LoadStoreToolbox.speichern("ich bin ein String", "DateiMitString.bin");

		// Laden
		String str = (String) LoadStoreToolbox.laden("DateiMitString.bin");
		System.out.println(str);

		List<String> liste = new ArrayList<String>();
		liste.add("Franz");
		liste.add("Franz");
		// todo

		// Optional<T> Lesen
		Optional<Serializable> ref = LoadStoreToolbox.laden2("DateiMitString.bin");
		if (ref.isPresent()) {
			String refString = (String) ref.get();
			System.out.println(refString);
		}

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.bin");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 100; i++) {
			//
			JFrame fester = new JFrame();
			fester.setVisible(true);
			// fester.dispose();
			fester.setVisible(false);
		}
		
		
		String leerString = new String();
		String leerString2 = "";
		
		// 
		
		
		
	}
}
class Auto {
	String marke; // enum 
	double geschwindikeit; // km/h -20  ... 300 
	// ... 
}
