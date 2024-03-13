package eugenekru.javacourse.hometask06.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		
		String [] ip = {"255.01.99.1", "256.01.99.1", "1.01.1.01", "254.254.254.254"};
		
		Pattern pattern = Pattern.compile("((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9]).){3}"
											+ "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])");
		
		for (int i = 0; i < ip.length; i++) {
			
			Matcher matcher = pattern.matcher(ip[i]);
			
			if (matcher.matches()) {
				System.out.println("IP adress -  " + ip[i] + "  - is correct.");
			} else {
				System.out.println("Warning! -  " + ip[i] + "  - incorrect IP adress.");
			}			
		}
		
	}
}
