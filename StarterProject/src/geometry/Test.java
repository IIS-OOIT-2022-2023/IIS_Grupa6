package geometry;

public class Test {

	public static void main(String[] args) {
		
		/*Point point1 = new Point();
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
		System.out.println(distance);*/
		
		//VEZBE 3.
		/*Point p = new Point();
		Point p1 = new Point();
		p1.setX(30);
		p1.setY(40);
		p1.setSelected(true);
				
		// 1. Inicijalizovati x koordinatu tacke p
		// na vrednost y koordinate tacke p1
		System.out.println(p.getX());
		p.setX(p1.getY());
		System.out.println(p.getX());

		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p1
		Line l1=new Line();
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		System.out.println("("+l1.getStartPoint().getX()+","
				+l1.getStartPoint().getY()+") --> "+"("
				+l1.getEndPoint().getX()+","
				+l1.getEndPoint().getY()+")");

		// 3. Postaviti y koordinatu krajnje tacke l1 na 23
		l1.getEndPoint().setY(23);


		// 4. Inicijalizovati x koordinatu pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1
		l1.getStartPoint().setX(l1.getEndPoint().getY());
		

		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1
        l1.getEndPoint().setX((int)l1.lenght()-(l1.getStartPoint().getX()+l1.getStartPoint().getY()));

		// 6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15
        Rectangle r1 = new Rectangle();
        r1.setUpperLeftPoint(p);
        r1.getUpperLeftPoint().setX(10);
        r1.getUpperLeftPoint().setY(15);


		// 7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1
        
        Circle c1=new Circle();
        //preuzimanje vrednosti i reference
        //c1.setCenter(r1.getUpperLeftPoint());
        
        //preuzimanje vrednosti
        c1.setCenter(new Point());
        c1.getCenter().setX(r1.getUpperLeftPoint().getX());
        c1.getCenter().setY(r1.getUpperLeftPoint().getY());


		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1
		
        c1.getCenter().setX(r1.area()-l1.getStartPoint().getY());
        */
        
        //Vezbe 4.
        Point p4 = new Point(50,40);
        
        Line l2 = new Line(new Point(50,40), new Point(60,70));
        
        System.out.println(p4.toString());
        System.out.println(p4);
        System.out.println(l2);
        
        int a=5;
        int b=6;
        System.out.println(a==b);
        
        String a1 = "abc";
        String b1 = "abcd";
        System.out.println(a1==b1);
        
        String s1 = new String("Hello World");
        String s2 = new String("Hello World"); 
        System.out.println(s1==s2);
        /*s1=s2;
        System.out.println(s1==s2);*/
        System.out.println(s1.equals(s2));
        
        

        Point p5 = new Point(50,40);
        System.out.println(p4==p5);
        System.out.println(p4.equals(p5));
        
        Donut d = new Donut(p5, 25, 15);
        System.out.println(d);
        
        Circle c5 = new Donut(p5, 25, 15);
        System.out.println(((Donut)c5).getInnerRadius());
        
        
        

	}

}
