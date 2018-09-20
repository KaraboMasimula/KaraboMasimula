package karabomasimula.question6;

public class Rectangle {
	
	int l,b;
	String type;
	
	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public double getArea() {
		double a = l * b;
		return a;
	}
	
	public double getPerimeter() {
		double p = 2 * ( l * b);
		return p;
	}
	
	
	public void compareArea(Object otherObject) {

		double difference = 0;

		if (otherObject instanceof Circle) {
			Circle circle = (Circle) otherObject;
			difference = this.getArea() - circle.getArea();

			System.out.println("Rectangle Area: " + this.getArea() + " \n Circle Area: " + circle.getArea()
					+ "\n Difference: " + difference);

		}
		
		if (otherObject instanceof Square) {
			Square square = (Square) otherObject;
			difference = this.getArea() - square.getArea();

			System.out.println("Rectangle Area: " + this.getArea() + " \n Square Area: " + square.getArea()
					+ "\n Difference: " + difference);
		}
		
		if (otherObject instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) otherObject;
			difference = this.getArea() - rectangle.getArea();

			System.out.println("Rectangle Area: " + this.getArea() + " \n Rectangle-2 Area: " + rectangle.getArea()
					+ "\n Difference: " + difference);
		}

	}

	public void comparePerimeter(Object otherObject) {

		double difference = 0;

		if (otherObject instanceof Circle) {
			Circle circle = (Circle) otherObject;
			difference = this.getPerimeter() - circle.getPerimeter();

			System.out.println("Rectangle Area: " + this.getPerimeter() + " \n Circle Area: " + circle.getPerimeter()
					+ "\n Difference: " + difference);

		}
		
		if (otherObject instanceof Square) {
			Square square = (Square) otherObject;
			difference = this.getPerimeter() - square.getPerimeter();

			System.out.println("Rectangle Area: " + this.getPerimeter() + " \n Square Area: " + square.getPerimeter()
					+ "\n Difference: " + difference);
		}
		
		if (otherObject instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) otherObject;
			difference = this.getPerimeter() - rectangle.getPerimeter();

			System.out.println("Rectangle Area: " + this.getPerimeter() + " \n Rectangle-2 Area: " + rectangle.getPerimeter()
					+ "\n Difference: " + difference);
		}

	}
	
}
