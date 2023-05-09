package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	private Point upperLeftPoint;
	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {

		this(upperLeftPoint, width, height);
		setSelected(selected);
	}

	public boolean contains(int x, int y) {
		return x >= upperLeftPoint.getX() && x <= upperLeftPoint.getX() + width && y >= upperLeftPoint.getY()
				&& y <= upperLeftPoint.getY() + height;
	}

	public int area() {
		return width * height;
	}

	public int circumference() {
		return 2 * (width + height);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			if (this.upperLeftPoint.equals(r.upperLeftPoint) && this.width == r.width && this.height == r.height) {
				return true;
			}
		}
		return false;
	}

	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}

	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		return "Upper left point:" + upperLeftPoint + ", width =" + width + ",height = " + height;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeftPoint.getX(), upperLeftPoint.getY(), width, height);

		if (isSelected()) {
			g.setColor(Color.blue);
			g.drawRect(upperLeftPoint.getX() - 2, upperLeftPoint.getY() - 2, 4, 4);
			g.drawRect(upperLeftPoint.getX() + width - 2, upperLeftPoint.getY() - 2, 4, 4);
			g.drawRect(upperLeftPoint.getX() - 2, upperLeftPoint.getY() + height - 2, 4, 4);
			g.drawRect(upperLeftPoint.getX() + width - 2, upperLeftPoint.getY() 
					+ height - 2, 4, 4);
			g.setColor(Color.black);
		}

	}

	@Override
	public void moveTo(int x, int y) {
		this.upperLeftPoint.moveTo(x, y);
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.upperLeftPoint.moveBy(byX, byY);
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle shapeToCompare = (Rectangle) obj;
			return this.area() - shapeToCompare.area();
		}
		return 0;
	}

}
