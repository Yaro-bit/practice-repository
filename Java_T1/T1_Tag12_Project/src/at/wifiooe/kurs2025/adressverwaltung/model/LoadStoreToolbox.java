package at.wifiooe.kurs2025.adressverwaltung.model;

import java.io.*;

public class LoadStoreToolbox {
    public static void speichern(Serializable ob, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            // Speichern des Objekts in die Datei
            out.writeObject(ob);
            System.out.println("Objekt wurde gespeichert in " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Serializable laden(String fileName) {
        // Load the object
        Serializable obj = null;
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

    // Deep copy via Serialisierung und Deserialisierung
    public static Serializable deepCopy(Serializable obj) {
        try {
            // Schreiben des Objekts in einen Byte-Array-Ausgangsstrom
            ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
            try (ObjectOutputStream out = new ObjectOutputStream(byteArrayOut)) {
                out.writeObject(obj);
            }

            // Lesen des Objekts aus dem Byte-Array-Eingangsstrom
            ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(byteArrayOut.toByteArray());
            try (ObjectInputStream in = new ObjectInputStream(byteArrayIn)) {
                return (Serializable) in.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null; // Fehlerbehandlung bei Deep Copy
        }
    }
}
