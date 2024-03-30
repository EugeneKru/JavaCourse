package eugenekru.javacourse.hometask11;

import java.util.Arrays;
import java.util.Scanner;

public class ThreadsForArray {

	public static void main(String[] args) throws InterruptedException {
		
		int[] array = createArray();		
		
		Thread minElement = new Thread (() -> findMinElement(array));
		
		Thread maxElement = new Thread (() -> findMaxElement(array));		
			
		minElement.start();
		maxElement.start();
		minElement.join();
		maxElement.join();
		
		System.out.println("\nProgram is succesfully executed.");

	}
	
	private static int getIntegerOnly(Scanner scan) {		

		while(!scan.hasNextInt()) {			
			scan.nextLine();			
			System.out.print("\nInvalid value of input data!\n"
					+ "Please, enter correct value.\n");			
		}
		
		return scan.nextInt();
	}
	
	private static int[] createArray() {		
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("Enter the array's size: ");		
		int size = getIntegerOnly(scan);
		
		System.out.print("\nEnter " + size + " elements of array:\n");		
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			scan.nextLine();
			array[i] = getIntegerOnly(scan);
		}
		
		scan.close();		
		return array;
	}
	
	private static void findMinElement(int[] array) {
		int min = Arrays.stream(array)
				.min()
				.getAsInt();
		System.out.print("\nMIN element in the array: " + min + "\n");		
		}
	
	private static void findMaxElement(int[] array) {
		int max = Arrays.stream(array)
				.max()
				.getAsInt();
		System.out.print("\nMAX element in the array: " + max + "\n");		
		}

}
