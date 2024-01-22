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
		
		String messegetoprint = switch(hours) {
		case 0 -> "Осталось менее часа";
		case 1 -> "Остался " + hours + " час";
		case 2, 3, 4 -> "Осталось " + hours + " часа";
		default -> "Осталось " + hours + " часов";
		};
		
		System.out.println(messegetoprint);		
	}
	
}