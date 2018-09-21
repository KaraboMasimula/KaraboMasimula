package karabomasimula.question10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Reader {

	public static void main(String[] args) {


		int lineNumber = 0;
		int previous = 0;
		int current;

		int max = 0;
		int delayCount = 0;
		
		try {

			File file = new File("3spindle.log");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);

			String line = null;

			System.out.println("===============  "+ file.getName() +"  ==================\n");
			
			while ((line = br.readLine()) != null) {

				lineNumber++;
				String tx[] = line.split(" ");
				String seconds = tx[1];
				current = Integer.parseInt(seconds.substring(6, 8));

				if (lineNumber > 1) {

					int timeDiff = current - previous;
					// Check For A Delay
					if (timeDiff > 5) {
						
						int last = tx.length - 1;
						System.out.println("Line ["+lineNumber+"]" + " -- Delay: " + timeDiff +" seconds || Message: "+ tx[last] );
						
						//Set Maximum Delay
						if(timeDiff > max) {
							max = timeDiff;
						}
						//Increasing Delay Count
						delayCount++;
						
					}
					
				}

				previous = current;

			}

			System.out.println("\n----------------  SUMMARY  ------------------");
			System.out.println("    Delays: "+delayCount+", Maximum Delay = "+ max +" seconds");
			System.out.println("---------------------------------------------");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
