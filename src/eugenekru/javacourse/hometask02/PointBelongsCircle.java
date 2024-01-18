package eugenekru.javacourse.hometask02;

import java.util.Scanner;

public class PointBelongsCircle {

	public static void main(String[] args) {		
		
		int x0 = enterParameters(1);		
		int y0 = enterParameters(2);		
		int r0 = enterParameters(3);		
		int x1 = enterParameters(4);		
		int y1 = enterParameters(5);
		
		if (r0 < findDistanceToPoint(x0, y0, x1, y1)) {
			System.out.println("The point is outside the circle");
		} else {
			System.out.println("The point belongs to the circle");
		}		

	}
	
	public static int scanParameters() {
		
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		
	}
	
	private static int enterParameters(int n) {
		
		switch (n) {
		case 1 -> System.out.println("Enter the x-coordinate of the center of the circle: ");		
		case 2 -> System.out.println("Enter the y-coordinate of the center of the circle: ");		
		case 3 -> System.out.println("Enter the radius of the circle: ");		
		case 4 -> System.out.println("Enter the x-coordinate of the point: ");		
		case 5 -> System.out.println("Enter the y-coordinate of the point: ");		
		}
		
		int parameter = scanParameters();
		return parameter;
		
	}
	
	private static double findDistanceToPoint(int x0, int y0, int x1, int y1) {
		
		double r1 = Math.sqrt(Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2));
		return r1;
		
	}
		
}