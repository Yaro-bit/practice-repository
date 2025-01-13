package wifi.kurs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Optional;

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

    public static Optional<Serializable> laden2(String fileName) {
  //  	Optional<Serializable> retValue =;
    	Serializable obj = laden(fileName);
    	if(obj == null) {
    		return Optional.ofNullable(null);
    	} else {
    		return Optional.of(obj);
    	}
    }
    
	public static Serializable laden(String fileName) {
	     // Load the object
		Serializable obj = null; // List, Array , Eigen Wrapper
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // Read the object from the file
        	obj = (Serializable) ois.readObject();
            
            // Print the loaded object
            System.out.println("Loaded object: " + obj);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
		return obj;
	}
}
