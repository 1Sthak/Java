
public class Rectangle {
		double width = 1;
		double height = 1;
		public Rectangle() {
		}
		public Rectangle(double newWidth, double newHeight) {
			width = newWidth;
			height = newHeight;
		}
		public double getArea() {
			return width*height;
		}
		public double getPerimeter() {
			return (2*width) + (2*height);
		}
}
