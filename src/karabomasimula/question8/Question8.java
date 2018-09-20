package karabomasimula.question8;

import java.util.Date;

public class Question8 extends Date {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		Question8 q = new Question8();
		System.out.println("Seconds : "+ q.getTime("seconds"));
		System.out.println("Milliseconds : "+ q.getTime("milliseconds"));
	}

	
	public long getTime(String format) {

		Date d = new Date();
		long l = 0;
		
		if (format.equals("milliseconds")) {
			l = d.getSeconds() * 1000;
		}
		if (format.equals("seconds")) {
			l = d.getSeconds();
		}
		
		return l;
	}

}
