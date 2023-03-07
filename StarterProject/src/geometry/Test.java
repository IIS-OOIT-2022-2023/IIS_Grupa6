package geometry;

public class Test {

	public static void main(String[] args) {
		
		Point point1 = new Point();
		Point point2 = new Point();
		
		System.out.println(point1);
		System.out.println(point1.getX());
		point1.setX(3);
		System.out.println(point1.getX());
		System.out.println(point1);
		point1.setY(5);
		
		point2.setX(13);
		point2.setY(15);
		
		double distance = point1.distance(point2);
		System.out.println(distance);
		

	}

}
