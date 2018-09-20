package karabomasimula.question2;

public class Rectangle {
	
	int l,b;
	
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
	
}
