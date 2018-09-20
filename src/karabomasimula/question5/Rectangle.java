package karabomasimula.question5;

public class Rectangle {
	
	int l,b;
	
	public Rectangle() {}
	
	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	// Returns a copy of the rectangle
	public Rectangle copyRectangle() {
		
		Rectangle rectangle = new Rectangle();
		rectangle.b = this.b;
		rectangle.l = this.l;
		return rectangle;
		
	}
	
}
