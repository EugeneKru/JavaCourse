package eugenekru.javacourse.hometask01;

import java.util.Scanner;

public class MiddleMark {

	public static void main(String[] args) {
		System.out.print("Введите количество предметов: ");		
		int numbSubj = scanNumber();
		System.out.println();
		System.out.printf("\nСредняя оценка: %.2f", (sumMark(numbSubj) / numbSubj));
		
	}
	
	private static int scanNumber() {
		
		Scanner scan = new Scanner(System.in);
		
		if (!scan.hasNextInt()) {
			System.out.println("Ошибка! Введено не число. Перезапустите программу и попробуйте снова.");			
		}
				
		return scan.nextInt();
		
	}
	
	private static double sumMark(int numbSubj) {
		
		double sum = 0;
		
		for(int i = 1; i <= numbSubj; i++) {
			
			System.out.print("Введите оценку за предмет №" + i + ": ");
			int mark = scanNumber();
			
			if((mark <= 10) && (mark >= 1)) {
				sum += mark;				
			} else {
				System.out.println("\nОшибка! Введите оценку от 1 до 10\n");
				i--;
			}
			
		}
		
		return sum;
		
	}

}
