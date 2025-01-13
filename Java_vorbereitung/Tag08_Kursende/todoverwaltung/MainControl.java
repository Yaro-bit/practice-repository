package demo.todoverwaltung;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MainControl {

	private List<ToDo> liste = new ArrayList<ToDo>();
	private File file = new File("todo.bin");

	private void init() {
		run();

	}

	private void run() {
		boolean running = true;
		do {
			String kommando = JOptionPane.showInputDialog("I... Insert,\nS... Save,\n\nA... abbruch");

			// switch
			if ("S".equalsIgnoreCase(kommando)) {
				ToolboxToDo.save(liste, file);
			}
			if ("I".equalsIgnoreCase(kommando)) {
				ToDo todo = ToolboxToDo.insert();
				liste.add(todo);
			}
			// :-( running = ! kommando.equalsIgnoreCase("A"); // 1
			running = !"A".equalsIgnoreCase(kommando); // 2
		} while (running);

	}

	public static void main(String[] args) {
		// init logging, uncouthexceptionhandler, fehlerbehandlung, ...

		MainControl main = new MainControl();
		main.init();
	}
}
