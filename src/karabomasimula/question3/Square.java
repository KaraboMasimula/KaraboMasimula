package karabomasimula.question3;

public class Square {
	
	int l;
	
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
	
}
