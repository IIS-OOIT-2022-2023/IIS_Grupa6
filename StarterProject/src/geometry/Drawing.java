package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	/**
	 * Create the panel.
	 */
	public Drawing() {

	}
	
	public static void main(String []args) {
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800,600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}
	public void paint(Graphics g) {
		Point p1 = new Point(40,50);
		p1.draw(g);
		
		Line l1 = new Line(p1, new Point(70,80));
		l1.draw(g);
		
		g.setColor(Color.RED);
		Circle c1 = new Circle (new Point(100,100), 35);
		c1.draw(g);
		
	}
	

}
