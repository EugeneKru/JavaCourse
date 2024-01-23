package eugenekru.javacourse.arraystasks.hometask03;

import java.util.Arrays;

import eugenekru.javacourse.arraystasks.MyArraysMethods;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		
		int[] originalarray = MyArraysMethods.createRandomArray(15, -5, 5);
		int[] interimarray = new int[originalarray.length];
		int index = 0;
		
		for(int i = 0, j; i < interimarray.length; i++) {
			
			for (j = index; j < originalarray.length; j++) {
				if(isUniqNumber(originalarray, j)) {
					interimarray[i] = originalarray[j];
					index = j + 1;
					break;
				} 
			}
			
			if(j == (originalarray.length - 1)) {
				index = i; 
				break;
			}
		}
		
		int[] cleararray = Arrays.copyOf(interimarray, (index + 1));
		
		System.out.println("Original Array:");
		MyArraysMethods.printArray(originalarray);
		System.out.println("\nArray after removing duplicates:");
		MyArraysMethods.printArray(cleararray);

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
