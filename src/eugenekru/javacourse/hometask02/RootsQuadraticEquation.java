package eugenekru.javacourse.hometask02;

import java.util.Scanner;

public class RootsQuadraticEquation {

	public static void main(String[] args) {
		
		System.out.println("Enter the coefficients of the quadratic equation (a, b, c)");
		int a = scanCoefficient();
		int b = scanCoefficient();
		int c = scanCoefficient();
		int d = findDeterminant(a, b, c);
		
		if (d < 0) {
			System.out.println("The quadratic equation doesn't have any root");
		} else {
			findRootsEquation(a, b, d);
		}
		
	}
	
	private static int scanCoefficient() {
		
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		
	}
	
	private static int findDeterminant(int a, int b, int c) {
		
		int d = (b * b) - (4 * a * c);
		return d;
		
	}
	
	private static void findRootsEquation(int a, int b, int d) {
		
		double x1;
		double x2;
		
		if (d == 0) {
			x1 = (double)-b / (2 * a);
			System.out.printf("The quadratic equation has one root:\nRoot: %.5f", x1);
		} else {
			System.out.println("The quadratic equation has two distinct real roots:");
			x1 = (-b - Math.sqrt(d)) / (2 * a);
			x2 = (-b + Math.sqrt(d)) / (2 * a);			
			System.out.printf("Root 1: %.5f\nRoot 2: %.5f", x1, x2);
		}
		
	}

}
