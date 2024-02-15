package eugenekru.javacourse.hometask06.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FlyCompany implements Comparator<Aircraft>{
	
	private List<Aircraft> fleet = new ArrayList<Aircraft>();	
		
	public FlyCompany(List<Aircraft> fleet) {
		
		this.fleet = fleet;
	}

	public void addBoards(Aircraft...board) {
		
		for(int i = 0; i < board.length; i++) {
			fleet.add(board[i]);			
		}
	}	
	
	public void removeBoards(Aircraft...board) {
		
		for(int i = 0; i < board.length; i++) {
			fleet.remove(board[i]);
		}
	}
	
	private  int allBoardsCapacity() {
		
		int boardscapacity = 0;
		
		for (Aircraft capacity: fleet) {
			boardscapacity += capacity.getCapasity();
		}
		
		return boardscapacity;
	}
	
	public static void printAllBoardsCapacity(FlyCompany fleet) {		
		
		System.out.println("\nAll boards capacity is " + fleet.allBoardsCapacity() + " persons\n");
	}

	private int allBoardsTonnage() {
		
		int boardstonnage = 0;
		
		for (Aircraft tonnage: fleet) {
			boardstonnage += tonnage.getTonnage();
		}
		
		return boardstonnage;
	}
	
	public static void printAllBoardsTonnage(FlyCompany fleet) {
		
		System.out.println("\nAll boards tonnage is " + fleet.allBoardsTonnage() + " kg\n");
	}

	@Override
	public String toString() {
		return "FlyCompany fleet:\n" + fleet;
	}

	@Override
	public int compare(Aircraft o1, Aircraft o2) {
		
		return o1.getSpeed() - o2.getSpeed();
	}
	
	private static Comparator<Aircraft> sortByMileage = new Comparator<Aircraft>() {		

		@Override
		public int compare(Aircraft o1, Aircraft o2) {			
			return o2.getMileage() - o1.getMileage();
		}		
	};
		
	public void printSortByMileage() {
		Collections.sort(fleet, FlyCompany.sortByMileage);
		for (Aircraft elem: fleet) {
			System.out.println(elem.getName() + " mileage: " + elem.getMileage());
		}
	}
	
	public static int scanner() {
		
		Scanner sc = new Scanner(System.in);
		int scan = sc.nextInt();
		return scan;
	}
	
	public void findBoard() {
		
		System.out.print("\nIf you want to find a passenger's board enter 1"
							+ "\nIf you want to find a cargo's board enter 2: ");
		int choise = scanner();
		switch(choise) {
		case 1 -> findPasengersBoard();
		case 2 -> findCargoBoard();
		}		
	}
	
	private void findCargoBoard() {
		
		String message = "We haven't got any board suits you";
		System.out.print("Enter a board's mileage: ");
		int mileage = scanner();
		System.out.print("Enter a board's tonnage: ");
		int tonnage = scanner();
				
		for (Aircraft elem: fleet) {
			if(elem.isFlightAllowed() && mileage < elem.getMileage() && tonnage < elem.getTonnage()) {				
				message = elem.getName() + " suits you";
				break;
			} 
		}
		
		System.out.println(message);
	}
	
	private void findPasengersBoard() {
		
		String message = "We haven't got any board suits you";
		System.out.print("Enter a board's mileage: ");
		int mileage = scanner();
		System.out.print("Enter a board's capacity: ");
		int capacity = scanner();
		
		for (Aircraft elem: fleet) {
			if(elem.isFlightAllowed() && mileage < elem.getMileage() && capacity < elem.getCapasity()) {
				message = elem.getName() + " suits you";
				break;
			} 
		}
		
		System.out.println(message);
	}	
}
		
	
	


	


