package for_shapes;

public class Driver {

	public static void main(String[] args) {
		
		
		Square s1 = new Square(1.2);
		Square s2 = new Square(1.5);
		Circle c1 = new Circle(3.2);
		Circle c2 = new Circle(3);
		
		Shape[] shapes = new Shape[4];
		
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = c1;
		shapes[3] = c2;
		
		for(Shape s : shapes) {
			System.out.println(s + " area:");
			System.out.println(s.area());
		}
		
	}

}
