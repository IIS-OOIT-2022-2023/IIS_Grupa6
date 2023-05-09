package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Donut extends Circle{

	private int innerRadius;
	public Donut() {		
	}
	
	public Donut(Point center, int radius, int innerRadius) {	
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {	
		super(center, radius, selected);
		this.innerRadius = innerRadius;
	}
		
	
	@Override
	public boolean contains(int x, int y) {	
		return super.contains(x, y) && 
				this.center.distance(new Point(x,y)) >= innerRadius;
	}

	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}

	@Override
	public double circumference() {
		return super.circumference() + 2*innerRadius*Math.PI;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Donut) {
			Donut d = (Donut)obj;
			if(super.equals(obj)
					&& this.innerRadius==d.innerRadius) {
				return true;
			}
		}		
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + ", innerRadius="+innerRadius;
	}

	public int getInnerRadius() {
		return innerRadius;
	}
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g); //nacrta spoljasnji krug
		g.drawOval(getCenter().getX() - innerRadius, getCenter().getY() - innerRadius,
				2*innerRadius, 2*innerRadius); //nacrta unutrasnji krug 
		
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() - innerRadius - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() + innerRadius - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() - innerRadius - 2, 4, 4);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() + innerRadius - 2, 4, 4);
			g.setColor(Color.black);
		}

	}	
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Donut) {
			Donut shapeToCompare = (Donut)obj;
			return (int)(this.area() - shapeToCompare.area());
		}
		return 0;
	}
	
}
