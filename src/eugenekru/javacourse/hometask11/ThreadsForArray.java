package eugenekru.javacourse.hometask11;

import java.util.Arrays;

public class ThreadsForArray {

	public static void main(String[] args) throws InterruptedException {
		
		int[] array = ArrayBuilder.createArray();		

		Thread minElement = new Thread (() -> findMinElement(array));		
		Thread maxElement = new Thread (() -> findMaxElement(array));		
			
		minElement.start();
		maxElement.start();
		minElement.join();
		maxElement.join();		
		
		System.out.println("\nProgram is succesfully executed.");
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
