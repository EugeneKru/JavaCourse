package eugenekru.javacourse.arraystasks.hometask04;

import eugenekru.javacourse.arraystasks.MyArraysMethods;

public class TransposeArray {

	public static void main(String[] args) {
		
		int[][] originalmatrix = MyArraysMethods.createArrayWithStep(5, 2, 0, 1);
		int[][] transposematrix = MyArraysMethods.transposeMatrix(originalmatrix);		
		
		System.out.println("Original Matrix:");
		MyArraysMethods.printArray(originalmatrix);
		System.out.println("\nTranspose Matrix:");
		MyArraysMethods.printArray(transposematrix);
	}

}
