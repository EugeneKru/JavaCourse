package eugenekru.javacourse.hometask06.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Boeing737 plain01 = new Boeing737("Boeing737-300-01", 1993, 300);
		Boeing737 plain02 = new Boeing737("Boeing737-400-02", 1999, 400);		
		Helicopter heli01 = new Helicopter("Bell 222-01", 2005, 6);
		Helicopter heli02 = new Helicopter("Sikorsky s-92-01", 2003, 20);		
		Antei an01 = new Antei("AN-22 Antei-01", 1991, 40000);
		Antei an02 = new Antei("AN-22 Antei-02", 2001, 40000);		
		CargoCopter copt01 = new CargoCopter("dji-t30", 2023, 50);
		CargoCopter copt02 = new CargoCopter("VoloDrone-01", 2023, 160);
		CargoCopter copt03 = new CargoCopter("VoloDrone-02", 2023, 160);
		
		plain01.printFlightTime(3000);
		heli01.printFlightTime(800);
		an02.printFlightTime(2500);
		
		System.out.println(plain02);		
		
		List<Aircraft> boards = new ArrayList<Aircraft>();
		
		FlyCompany fleet = new FlyCompany(boards);
		
		fleet.addBoards(plain01, plain02, heli01, heli02);
		fleet.addBoards(an02, copt01, copt03);		
		
		System.out.println(fleet.toString());
		
		FlyCompany.printAllBoardsCapacity(fleet);
		FlyCompany.printAllBoardsTonnage(fleet);
		
		fleet.printSortByMileage();
		
		fleet.findCargoBoard(4000, 7000);
		fleet.findPasengersBoard(4000, 200);
	}
}
