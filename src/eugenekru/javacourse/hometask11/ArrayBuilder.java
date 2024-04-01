package eugenekru.javacourse.hometask11;

import java.util.Scanner;

public class ArrayBuilder {	
	
	public static int[] createArray() {		
		
		Scanner scan = new Scanner(System.in);		
		System.out.print("Enter the array's size: ");		
		int size = getIntegerOnly(scan);
		
		System.out.print("\nEnter " + size + " elements of array:\n");		
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			scan.nextLine();
			array[i] = getIntegerOnly(scan);
		}
		
		scan.close();		
		return array;
	}

	private static int getIntegerOnly(Scanner scan) {		
		
		while(!scan.hasNextInt()) {			
			scan.nextLine();			
			System.out.print("\nInvalid value of input data!\n"
					+ "Please, enter correct value.\n");			
		}
		
		return scan.nextInt();
	}
	
}
