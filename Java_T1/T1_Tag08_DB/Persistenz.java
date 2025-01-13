package demo.kurs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.logging.Logger;

public class Persistenz {

	public static void main(String[] args) throws Exception {
		
		//Wie speichert man
		
		
		//speichern über serilisierung 
		//object mach eine binärdatei
		//diese datei in ein file speichern
		
		
		
		
		//Properties verwenden
		Properties prop = System.getProperties();
		prop.list(System.out);
		
		Properties myProp = new Properties ();
		FileInputStream in = new FileInputStream("config\\test.properties");
		myProp.load(in);
		myProp.list(System.out);
		
		//DB no SQL DB wie derby sql-lite oder über ORM-Mapper
		//Derby:
		
		
		
		
		//Loging in java
		Logger log = Logger.getLogger("key");
		
		
	}

}
