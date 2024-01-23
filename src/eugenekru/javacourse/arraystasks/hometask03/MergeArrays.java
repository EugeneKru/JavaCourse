package eugenekru.javacourse.arraystasks.hometask03;

import eugenekru.javacourse.arraystasks.MyArraysMethods;

public class MergeArrays {

	public static void main(String[] args) {
		
		int[] orderedarray1 = MyArraysMethods.createArrayWithStep(5, 1, 2);
		int[] orderedarray2 = MyArraysMethods.createArrayWithStep(5, 2, 2);
		int[] mergedarray = new int[orderedarray1.length + orderedarray2.length];
		
		for(int i = 0, j = 0; i < mergedarray.length; i += 2, j++) {
			mergedarray[i] = orderedarray1[j];
			mergedarray[i + 1] = orderedarray2[j];
		}
		
		System.out.println("Ordered Array 1:");
		MyArraysMethods.printArray(orderedarray1);
		System.out.println("\nOrdered Array 2:");
		MyArraysMethods.printArray(orderedarray2);
		System.out.println("\nMerged Ordered Array:");
		MyArraysMethods.printArray(mergedarray);
	}

}
