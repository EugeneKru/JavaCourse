package eugenekru.javacourse.hometask06.task1;

import eugenekru.javacourse.hometask06.task1.enumpack.AircraftSpecifications;

public class CargoCopter extends Aircraft{

	public CargoCopter(String name, int yearbuilt, int tonnage) {
		super(name, yearbuilt);
		setTonnage(tonnage);
		setSpeed(AircraftSpecifications.CARGO_COPTER.getSpeed());		
		setMileage(AircraftSpecifications.CARGO_COPTER.getMileage());
		setLifetime(AircraftSpecifications.CARGO_COPTER.getLifetime());
	}
}
