package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	/**
	 * Create the panel.
	 */
	public Drawing() {

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		Point p = new Point(50, 50);
		Line l1 = new Line(new Point(100, 100), new Point(200, 200));
		Rectangle r1 = new Rectangle(l1.getEndPoint(), 100, 50);
		Circle c1 = new Circle(new Point(50, 100), 80);
		Donut d1 = new Donut(new Point(80, 100), 50, 25, true);
		Rectangle k1 = new Rectangle(new Point(50, 50), 50, 50);

		// Zadatak 1.
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p);
		shapes.add(l1);
		shapes.add(c1);
		shapes.add(d1);
		shapes.add(k1);
		Iterator<Shape> it = shapes.iterator();
		while (it.hasNext()) {
			it.next().moveBy(10, 0);
		}

		try {
			c1.setRadius(-15);
			System.out.print("Da li se izvrsava?");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Izvrsava se");
		}
		
		// Zadatak 2.
		shapes.get(3).draw(g);
		shapes.get(shapes.size() - 1).draw(g);
		shapes.remove(1);
		// pomera se lista
		shapes.get(1).draw(g);
		shapes.get(3).draw(g);
		shapes.add(3, l1);
		
		it=shapes.iterator();
		while(it.hasNext()) {
			Shape pomocniS=it.next();
			pomocniS.setSelected(true);
			pomocniS.draw(g);
		}


	}

}
