package eugenekru.javacourse.arraystasks.hometask03;

import java.util.Arrays;

import eugenekru.javacourse.arraystasks.MyArraysMethods;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		
		int[] originalarray = MyArraysMethods.createRandomArray(15, -5, 5);
		int duplicates = countDuplicateNumbers(originalarray);
		int[] cleararray = new int[originalarray.length - duplicates];
		int index = 0;
		
		for(int i = 0; i < cleararray.length; i++) {
			
			for (int j = index; j < originalarray.length; j++) {
				if(isUniqNumber(originalarray, j)) {
					cleararray[i] = originalarray[j];
					index = j + 1;
					break;
				} 
			}			
		}
		
		System.out.println("Original Array:");
		MyArraysMethods.printArray(originalarray);
		System.out.println("\nArray after removing duplicates:");
		MyArraysMethods.printArray(cleararray);

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
	
}
