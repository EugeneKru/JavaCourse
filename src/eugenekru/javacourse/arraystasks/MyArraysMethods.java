package eugenekru.javacourse.arraystasks;

import java.util.Arrays;
import java.util.Random;

public class MyArraysMethods {
	
	
	private static Random random = new Random();
	
			
	public static int[] createRandomArray(int size, int startpoint, int endpoint) {
				
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(startpoint, endpoint);			
		}
		
		return array;		
	}
	
	public static int[][] createRandomArray(int rows, int columns, int startpoint, int endpoint) {
		
		int[][] matrix = new int [rows][columns];		
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = createRandomArray(columns, startpoint, endpoint);			
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
	
	public static int[][] createArrayWithStep(int rows, int columns, int startpoint, int step) {
		
		int[][] matrix = new int [rows][columns];		
		
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = createArrayWithStep(columns, startpoint, step);
			startpoint += columns;
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
	
	private static int countDuplicateNumbers(int[] array) {
		
		int count = 0;
		int[] sortarray = Arrays.copyOf(array, array.length);		
		Arrays.sort(sortarray);
		
		for(int i = 1; i < sortarray.length; i++) {
			if(sortarray[i] == sortarray[i - 1]) {
				count++;
			}
		}
		
		return count;		
	}
	
	private static boolean isUniqNumber(int[] array, int index) {
		
		boolean uniq = true;		
		
		for (int i = (index + 1); i < array.length; i++) {
			if(array[index] == array[i]) {					
				uniq = false;
				break;
			}			
		}
		
		return uniq;
	}
	
	public static int[] removeDuplicateNumbers(int[] array) {
		
		int duplicates = countDuplicateNumbers(array);
		int[] cleararray = new int[array.length - duplicates];
		int index = 0;
		
		for(int i = 0; i < cleararray.length; i++) {
			
			for (int j = index; j < array.length; j++) {
				if(isUniqNumber(array, j)) {
					cleararray[i] = array[j];
					index = j + 1;
					break;
				} 
			}			
		}
		
		return cleararray;
	}
	
	public static int[] mergeArrays(int[] array1, int[] array2) {
		
		int[] mergedarray = new int[array1.length + array2.length];
		
		for(int i = 0, j = 0; i < mergedarray.length; i += 2, j++) {
			mergedarray[i] = array1[j];
			mergedarray[i + 1] = array2[j];
		}
		
		return mergedarray;
	}
	
	public static int[][] transposeMatrix(int[][] array) {
		
		int[][] transposematrix = new int[array[0].length][array.length];		

		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				transposematrix[j][i] = array[i][j];				
			}			
		}
		
		return transposematrix;
	}
	
}
