package wifi.kurs;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// swing 
// awt 
// javaFx
public class MeinFenster extends JFrame{
    static int maxFensterNr = 2;
    static int xPos = 0;
    static int yPos = 0;
    int aktuelleFensterNummer;
	
    static {
		// nach dem laden der Klasse aufgerufen
		System.out.println("Konstruktor für klassen(static initialisier)");
		maxFensterNr = 1;
	}
	public MeinFenster(){
		super();
		getContentPane().setBackground(Color.ORANGE);
		this.setVisible(true);
		this.setSize(700, 534);
		this.setLocation(xPos, yPos);
		xPos = xPos + 10;
		yPos = yPos + 10;
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		aktuelleFensterNummer = maxFensterNr;
		setTitle("Nr:" + aktuelleFensterNummer);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ???
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		maxFensterNr++;
	}

}
