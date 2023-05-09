package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape {
	
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		setY(y);
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected=selected;
	}
	
	public boolean contains(int x, int y) {
		return this.distance(new Point(x,y)) <= 2;
	}
	
	public double distance(Point point2) {
		double dx=this.x-point2.getX();
		double dy=this.y-point2.y;
		double distance = Math.sqrt(dx*dx+dy*dy);
		return distance;
	}
	
	public boolean equals(Object obj) {		
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(this.x==p.x && this.y==p.y) {
				return true;
			}
		}		
		return false;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}

	@Override
	public void draw(Graphics g) {
		//tacku crtamo kao +
		g.drawLine(x-2,y,x+2,y); // horizontalna linija
		g.drawLine(x,y-2,x,y+2); // vertikalna linija
		
		if(isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(x-2, y-2, 4, 4);
			g.setColor(Color.black);	}
	}

	@Override
	public void moveTo(int x, int y) {	
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.x += x;
		this.y += y;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Point) {
			Point shapeToCompare = (Point)o;
			return (int)this.distance(new Point(0,0))
					- (int)shapeToCompare.distance(new Point(0,0));
		}
		return 0;
	}



}
