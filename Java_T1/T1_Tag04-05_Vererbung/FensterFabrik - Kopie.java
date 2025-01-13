package wifi.kurs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

final public class FensterFabrik {

	static int maxFensterNr = 1;
	static int xPos = 0;
	static int yPos = 0;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1 = getMeinFenster();
		JFrame f2 = getMeinFenster();
		JFrame f3 = getMeinFenster();
	}
	
	public static JFrame getMeinFenster() {
		JFrame frame = new JFrame();
		
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setVisible(true);
		frame.setSize(700, 534);
		frame.setLocation(xPos, yPos);
		xPos = xPos + 10;
		yPos = yPos + 10;
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		// aktuelleFensterNummer = maxFensterNr;
		frame.setTitle("Nr:" + maxFensterNr);
		maxFensterNr++;
		
		return frame;
	}

}
