package eugenekru.javacourse.hometask02;

import java.util.Random;

public class SecondsToHours {

	public static void main(String[] args) {
		
		int seconds = setTime();
		int hours = (seconds / (60 * 60)) % 24;
		
		System.out.println(seconds);
		
		printRemainingTime(hours);

	}
	
	private static int setTime() {
		
		Random seconds = new Random();
		return seconds.nextInt(0, 28801);
		
	}
	
	private static void printRemainingTime(int hours) {
		
		StringBuilder time = new StringBuilder("Осталось " + hours + " час");
		
		if (hours > 4) {
			System.out.println(time.insert(time.length(), "ов"));
		} else if (hours != 1) {			
			time = time.insert(time.length(), "a");
			
			if (hours > 1) {
				System.out.println(time);
			} else {
				System.out.println(time.replace(9, 10, "менее"));
			}
			
		} else {
			System.out.println(time.replace(5, 8, "ся"));
		}		
		
	}
	
}