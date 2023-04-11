package geometry;

import java.awt.Graphics;

public class Line extends Shape{

	private Point startPoint;
	private Point endPoint;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint,endPoint);
		this.selected=selected;
	}
	
	public boolean contains(int x, int y) {
		return this.startPoint.distance(new Point(x,y)) 
				+ this.endPoint.distance(new Point(x,y)) - length() <= 2;
	}
	
	public double length() {
		return this.startPoint.distance(endPoint);
	}
	
	public boolean equals(Object obj) {		
		if(obj instanceof Line) {
			Line l = (Line)obj;
			if(this.startPoint.equals(l.startPoint)
					&& this.endPoint.equals(l.endPoint)) {
				return true;
			}
		}		
		return false;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	public String toString() {
		return startPoint + "-->" + endPoint.toString();
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(),
				endPoint.getX(), endPoint.getY());
		
	}

	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.startPoint.moveBy(byX, byY);
		this.endPoint.moveBy(byX, byY);		
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Line) {
			Line shapeToCompare = (Line)obj;
			return (int)(this.length() - shapeToCompare.length());
		}
		return 0;
	}
	
	
}
