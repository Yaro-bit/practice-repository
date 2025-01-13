package demo.todoverwaltung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class ToolboxToDo {

	public static List<ToDo> load(File fileName) {
		InputStream fis = null;
		
		// fileName.isFile()
		// fileName.canRead()
		
		List<ToDo> todos = null;
		try { // refactoring try with resources 
			fis = new FileInputStream(fileName);
			ObjectInputStream o = new ObjectInputStream(fis);
			todos = (List<ToDo>) o.readObject();

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
		
		
		return todos;
		
	}
	
	
	public static void save(List<ToDo> liste, File fileName) {
		// Objectserialsierung
		OutputStream fos = null;

		try {
			fos = new FileOutputStream(fileName);
			ObjectOutputStream o = new ObjectOutputStream(fos);
			o.writeObject(liste);
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
	
	
	//print
	
	
	// reset
	
	
	
	
	public static void main(String[] args) {
		// Testcode für Toolbox
		ToDo t1 = new ToDo();
		t1.id = 1;
		t1.aufgabe = "Test";
		List<ToDo> liste = new ArrayList<ToDo>();
		liste.add(t1);
		
		File f = new File("todo.bin");
		save(liste,f);
		
		liste = load(f);
		System.out.println(liste.size());
		
	}


	public static ToDo insert() {
		ToDo td = new ToDo();
		td.id = 1; // max nummer auslesen
		td.aufgabe = JOptionPane.showInputDialog("Aufgabe eingeben");
		return td;
	}

}
