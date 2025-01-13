package demo.kurs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SpeicherLaden {
	private static final String KUNDEN_BIN = "Kunden.bin";

	public static void main(String[] args) {

		// KundeListe
		// List<Kunde> kundeListe = new ArrayList<>();
		List<Kunde> kundeListe = load();

		Kunde k1 = new Kunde();
		k1.einlesen();
		kundeListe.add(k1);

		print(kundeListe);

		save(kundeListe);
		
	}

	private static List<Kunde> load() {
		InputStream fis = null;
		List<Kunde> kunden = null;
		try {
			fis = new FileInputStream(KUNDEN_BIN);
			ObjectInputStream o = new ObjectInputStream(fis);
			kunden = (List<Kunde>) o.readObject();

		} catch (IOException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
			}
		}

		return kunden;
	}

	private static void save(List<Kunde> kundeListe) {
		// Objectserialsierung
		OutputStream fos = null;

		try {
			fos = new FileOutputStream(KUNDEN_BIN);
			ObjectOutputStream o = new ObjectOutputStream(fos);
			o.writeObject(kundeListe);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private static void print(List<Kunde> kundeListe) {

		for (Kunde kunde : kundeListe) {
			System.out.println(kunde);
		}

	}
}

class Kunde implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String vorname;

	@Override
	public String toString() {
		return "Kunde [id=" + id + ", name=" + name + ", vorname=" + vorname + "]";
	}

	public void einlesen() {
		id = Integer.parseInt(JOptionPane.showInputDialog("id eingeben"));
		name = JOptionPane.showInputDialog("name eingeben");
		vorname = JOptionPane.showInputDialog("vorname eingeben");
	}
}
