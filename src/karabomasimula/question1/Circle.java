package karabomasimula.question1;

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
		double p =2 * Math.PI * r;
		return p;
	}
	
}
