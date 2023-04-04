package geometry;

import java.awt.Graphics;

public class Circle extends Shape {
	
	protected Point center;
	private int radius;
	
	public Circle() {

	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		setSelected(selected);
	}

	public boolean contains(int x, int y) {
		return this.center.distance(new Point(x,y)) <= radius;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}  
	
	public double circumference() {
		return 2*radius*Math.PI;
	}  
	
	public boolean equals(Object obj) {		
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			if(this.center.equals(c.center)
					&& this.radius==c.radius) {
				return true;
			}
		}		
		return false;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Center=" + center + ", radius=" + radius;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX() - radius, center.getY() - radius,2*radius, 2*radius);
		
	}
	
	
}
