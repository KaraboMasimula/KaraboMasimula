package karabomasimula.question4;

public class Circle {

	int r;
	
	public Circle(int r) {
		super();
		this.r = r;
	}

	public int getBiggest(Circle c) {
		
		int biggest = 0;
		
		if(c.r > this.r) {
			biggest = c.r;
		}
		
		if(this.r > c.r) {
			biggest = this.r;
		}
		// Both equal //
		if(this.r == c.r) {
			biggest = this.r;
		}
		
		return biggest;
	}
	
}
