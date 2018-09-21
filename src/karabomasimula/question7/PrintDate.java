package karabomasimula.question7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDate extends DatePrinter{
	
	@Override
	public void print() {
		
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
		df.format(d);
		System.out.println(df.format(d));
		
	}
	
	public static void main(String[] args) {
		
		DatePrinter p = new PrintDate();
		p.print();
		
	}
	
}
