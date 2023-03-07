package geometry;

public class Point {
	
	private int x;
	private int y;
	private boolean selected;
	
	
	public double distance(Point point2) {
		double dx=this.x-point2.getX();
		double dy=this.y-point2.y;
		double distance = Math.sqrt(dx*dx+dy*dy);
		return distance;
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



}
