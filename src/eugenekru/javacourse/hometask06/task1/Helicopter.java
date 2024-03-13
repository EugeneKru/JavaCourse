package eugenekru.javacourse.hometask06.task1;

import eugenekru.javacourse.hometask06.task1.enumpack.AircraftSpecifications;

public class Helicopter extends Aircraft{

	public Helicopter(String name, int yearbuilt, int capacity) {
		super(name, yearbuilt);
		setCapasity(capacity);
		setSpeed(AircraftSpecifications.HELICOPTER.getSpeed());
		setMileage(AircraftSpecifications.HELICOPTER.getMileage());		
		setLifetime(AircraftSpecifications.HELICOPTER.getLifetime());
	}
}
