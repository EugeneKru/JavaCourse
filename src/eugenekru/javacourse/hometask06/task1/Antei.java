package eugenekru.javacourse.hometask06.task1;

import eugenekru.javacourse.hometask06.task1.enumpack.AircraftSpecifications;

public class Antei extends Aircraft{

	public Antei(String name, int yearbuilt, int tonnage) {
		super(name, yearbuilt);
		setTonnage(tonnage);
		setSpeed(AircraftSpecifications.ANTEI.getSpeed());		
		setMileage(AircraftSpecifications.ANTEI.getMileage());
		setLifetime(AircraftSpecifications.ANTEI.getLifetime());
	}
}
