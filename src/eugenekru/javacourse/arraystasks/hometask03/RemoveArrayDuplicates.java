package eugenekru.javacourse.arraystasks.hometask03;

import eugenekru.javacourse.arraystasks.MyArraysMethods;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		
		int[] originalarray = MyArraysMethods.createRandomArray(15, -5, 5);
		int[] cleararray = MyArraysMethods.removeDuplicateNumbers(originalarray);
		
		System.out.println("Original Array:");
		MyArraysMethods.printArray(originalarray);
		System.out.println("\nArray after removing duplicates:");
		MyArraysMethods.printArray(cleararray);
	}
	
}
