package wifi.kurs;
//
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LoadStoreToolbox {
    public static void speichern(Serializable ob, String fileName) {
    	 try (FileOutputStream fileOut = new FileOutputStream(fileName);
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

                // Speichern des Objekts in die Datei
                out.writeObject(ob);
                System.out.println("Objekt wurde gespeichert in " + fileName );

            } catch (IOException e) {
                e.printStackTrace();
            }
	}
}
