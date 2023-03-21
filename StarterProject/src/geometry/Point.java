package geometry;

public class Point {
	
	private int x;
	private int y;
	private boolean selected;
	
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
	
	public boolean isSelected() {
		return this.selected;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void setSelected(boolean selected) {
		this.selected=selected;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}



}
