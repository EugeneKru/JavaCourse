package eugenekru.javacourse.arraystasks.hometask04;

import eugenekru.javacourse.arraystasks.MyArraysMethods;

public class TransposeArray {

	public static void main(String[] args) {
		
		int[][] originalmatrix = MyArraysMethods.createArrayWithStep(5, 2, 0, 1);
		int[][] transposematrix = new int[originalmatrix[0].length][originalmatrix.length];		

		for(int i = 0; i < originalmatrix.length; i++) {
			
			for(int j = 0; j < originalmatrix[i].length; j++) {
				transposematrix[j][i] = originalmatrix[i][j];				
			}			
		}
		
		System.out.println("Original Matrix:");
		MyArraysMethods.printArray(originalmatrix);
		System.out.println("Transpose Matrix:");
		MyArraysMethods.printArray(transposematrix);

	}

}
