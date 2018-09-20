package karabomasimula.question6;

public class Circle {

	int r;

	public Circle(int r) {
		this.r = r;
	}

	public double getArea() {
		double a = Math.PI * Math.pow(r, 2);
		return a;
	}

	public double getPerimeter() {
		double p = 2 * Math.PI * r;
		return p;
	}

	public void compareArea(Object otherObject) {

		double difference = 0;

		if (otherObject instanceof Circle) {
			Circle circle = (Circle) otherObject;
			difference = this.getArea() - circle.getArea();

			System.out.println("Circle Area: " + this.getArea() + " \n Circle-2 Area: " + circle.getArea()
					+ "\n Difference: " + difference);

		}
		
		if (otherObject instanceof Square) {
			Square square = (Square) otherObject;
			difference = this.getArea() - square.getArea();

			System.out.println("Circle Area: " + this.getArea() + " \n Square Area: " + square.getArea()
					+ "\n Difference: " + difference);
		}
		
		if (otherObject instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) otherObject;
			difference = this.getArea() - rectangle.getArea();

			System.out.println("Circle Area: " + this.getArea() + " \n Rectangle Area: " + rectangle.getArea()
					+ "\n Difference: " + difference);
		}

	}

	public void comparePerimeter(Object otherObject) {

		double difference = 0;

		if (otherObject instanceof Circle) {
			Circle circle = (Circle) otherObject;
			difference = this.getPerimeter() - circle.getPerimeter();

			System.out.println("Circle Area: " + this.getPerimeter() + " \n Circle-2 Area: " + circle.getPerimeter()
					+ "\n Difference: " + difference);

		}
		
		if (otherObject instanceof Square) {
			Square square = (Square) otherObject;
			difference = this.getPerimeter() - square.getPerimeter();

			System.out.println("Circle Area: " + this.getPerimeter() + " \n Square Area: " + square.getPerimeter()
					+ "\n Difference: " + difference);
		}
		
		if (otherObject instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) otherObject;
			difference = this.getPerimeter() - rectangle.getPerimeter();

			System.out.println("Circle Area: " + this.getPerimeter() + " \n Rectangle Area: " + rectangle.getPerimeter()
					+ "\n Difference: " + difference);
		}

	}
}
