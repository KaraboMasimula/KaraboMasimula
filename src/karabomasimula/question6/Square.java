package karabomasimula.question6;

public class Square {
	
	int l;
	String type;
	
	public Square(int l) {
		this.l = l;
	}

	public double getArea() {
		double a = l * l;
		return a;
	}
	
	public double getPerimeter() {
		double p = 4 *  l ;
		return p;
	}
	
	public void compareArea(Object otherObject) {

		double difference = 0;

		if (otherObject instanceof Circle) {
			Circle circle = (Circle) otherObject;
			difference = this.getArea() - circle.getArea();

			System.out.println("Square Area: " + this.getArea() + " \n Circle Area: " + circle.getArea()
					+ "\n Difference: " + difference);

		}
		
		if (otherObject instanceof Square) {
			Square square = (Square) otherObject;
			difference = this.getArea() - square.getArea();

			System.out.println("Square Area: " + this.getArea() + " \n Square-2 Area: " + square.getArea()
					+ "\n Difference: " + difference);
		}
		
		if (otherObject instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) otherObject;
			difference = this.getArea() - rectangle.getArea();

			System.out.println("Square Area: " + this.getArea() + " \n Rectangle Area: " + rectangle.getArea()
					+ "\n Difference: " + difference);
		}

	}

	public void comparePerimeter(Object otherObject) {

		double difference = 0;

		if (otherObject instanceof Circle) {
			Circle circle = (Circle) otherObject;
			difference = this.getPerimeter() - circle.getPerimeter();

			System.out.println("Square Area: " + this.getPerimeter() + " \n Circle Area: " + circle.getPerimeter()
					+ "\n Difference: " + difference);

		}
		
		if (otherObject instanceof Square) {
			Square square = (Square) otherObject;
			difference = this.getPerimeter() - square.getPerimeter();

			System.out.println("Square Area: " + this.getPerimeter() + " \n Square-2 Area: " + square.getPerimeter()
					+ "\n Difference: " + difference);
		}
		
		if (otherObject instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) otherObject;
			difference = this.getPerimeter() - rectangle.getPerimeter();

			System.out.println("Square Area: " + this.getPerimeter() + " \n Rectangle Area: " + rectangle.getPerimeter()
					+ "\n Difference: " + difference);
		}

	}
}