package eugenekru.javacourse.arraystasks.hometask03;

import eugenekru.javacourse.arraystasks.MyArraysMethods;

public class MergeArrays {

	public static void main(String[] args) {
		
		int[] orderedarray1 = MyArraysMethods.createArrayWithStep(5, 1, 2);
		int[] orderedarray2 = MyArraysMethods.createArrayWithStep(5, 2, 2);
		int[] mergedarray = MyArraysMethods.mergeArrays(orderedarray1, orderedarray2);
						
		System.out.println("Ordered Array 1:");
		MyArraysMethods.printArray(orderedarray1);
		System.out.println("\nOrdered Array 2:");
		MyArraysMethods.printArray(orderedarray2);
		System.out.println("\nMerged Ordered Array:");
		MyArraysMethods.printArray(mergedarray);
	}

}
