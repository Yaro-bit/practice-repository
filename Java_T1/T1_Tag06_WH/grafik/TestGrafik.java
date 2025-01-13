package wifi.kurs.grafik;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGrafik {

	public static void main(String[] args) {
        
		Punkt p1 = new Punkt();
		p1.x = 90;
		p1.y = 200;
		Kreis k1 = new Kreis(p1 , 100);
		
		// k1.draw();
		
		List<BasisGrafik> zeichenObjekte = new ArrayList<BasisGrafik>();
		zeichenObjekte.add(k1);
		zeichenObjekte.add(k1);
		
		Linie l1 = new Linie();
		l1.p1 = new Punkt(10,10);
		l1.p2 = new Punkt(100,50);
		
		zeichenObjekte.add(l1);
		for (BasisGrafik basisGrafik : zeichenObjekte) {
			basisGrafik.draw();
		}
		
		
		JFrame zeichenfläche = new JFrame();
		
		JPanel jp = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponents(g);
				g.drawOval(10, 10, 100, 100);
				g.drawString("Test", 100, 100);
				g.drawRect(10, 10, 100, 100);
			}
			
		};
		zeichenfläche.getContentPane().add(jp);
		zeichenfläche.setVisible(true);
		
	}

}
