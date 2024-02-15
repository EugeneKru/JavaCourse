package eugenekru.javacourse.hometask06.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Boeing737 plain_01 = new Boeing737("Boeing737-300-01", 1993, 300);
		Boeing737 plain_02 = new Boeing737("Boeing737-400-02", 1999, 400);		
		Helicopter heli_01 = new Helicopter("Bell 222-01", 2005, 6);
		Helicopter heli_02 = new Helicopter("Sikorsky s-92-01", 2003, 20);		
		Antei an_01 = new Antei("AN-22 Antei-01", 1991, 40000);
		Antei an_02 = new Antei("AN-22 Antei-02", 2001, 40000);		
		CargoCopter copt_01 = new CargoCopter("dji-t30", 2023, 50);
		CargoCopter copt_02 = new CargoCopter("VoloDrone-01", 2023, 160);
		CargoCopter copt_03 = new CargoCopter("VoloDrone-02", 2023, 160);
		
		plain_01.printFlightTime(3000);
		heli_01.printFlightTime(800);
		an_02.printFlightTime(2500);
		
		System.out.println(plain_02);		
		
		List<Aircraft> boards = new ArrayList<Aircraft>();
		
		FlyCompany fleet = new FlyCompany(boards);
		
		fleet.addBoards(plain_01, plain_02, heli_01, heli_02);
		fleet.addBoards(an_02, copt_01, copt_03);		
		
		System.out.println(fleet.toString());
		
		FlyCompany.printAllBoardsCapacity(fleet);
		FlyCompany.printAllBoardsTonnage(fleet);
		
		fleet.printSortByMileage();
		
		fleet.findBoard();
	}
}
