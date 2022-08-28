
public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(4.0,40.0);
		System.out.println("Area is: " + r1.getArea());
		System.out.println("Perimeter is: " + r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(3.5,35.9);
		System.out.println("Area is: " + r2.getArea());
		System.out.println("Perimeter is: " + r2.getPerimeter());
	}

}
