package eugenekru.javacourse.arraystasks;

import java.util.Random;

public class MyArraysMethods {
	
	private static int randomNamber(int startpoint, int endpoint) {
		
		Random rand = new Random();
		return rand.nextInt(startpoint, endpoint);		
	}
		
	public static int[] createRandomArray(int size, int startpoint, int endpoint) {
				
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = randomNamber(startpoint, endpoint);			
		}
		
		return array;		
	}
	
	public static int[][] createRandomArray(int size2, int size, int startpoint, int endpoint) {
		
		int[][] matrix = new int [size2][size];		
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = createRandomArray(size, startpoint, endpoint);			
		}		
		
		return matrix;
	}
	
	public static int[] createArrayWithStep(int size, int startpoint, int step) {
						
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = startpoint;
			startpoint += step;
		}
		
		return array;
	}
	
	public static int[][] createArrayWithStep(int size2, int size, int startpoint, int step) {
		
		int[][] matrix = new int [size2][size];		
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = createArrayWithStep(size, startpoint, step);
			startpoint += size;
		}		
		
		return matrix;
	}
		
	public static void printArray(int[] array) {
		
		for (int val: array) {
			System.out.print(val + " ");
		}
	}
	
	public static void printArray(int[][] array) {
		
		for(int i = 0; i < array.length; i++) {
			printArray(array[i]);
			System.out.println();
		}
	}

}
