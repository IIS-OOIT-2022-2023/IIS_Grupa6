package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
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
	
	public double lenght() {
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
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public String toString() {
		return startPoint + "-->" + endPoint.toString();
	}
	
	
}
