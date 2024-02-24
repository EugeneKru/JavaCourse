package eugenekru.javacourse.hometask06.task1;

import eugenekru.javacourse.hometask06.task1.enumpack.AircraftSpecifications;

public class Boeing737 extends Aircraft {	

	public Boeing737(String name, int yearbuilt, int capacity) {
		super(name, yearbuilt);
		setCapasity(capacity);
		setSpeed(AircraftSpecifications.BOEING_737.getSpeed());
		setMileage(AircraftSpecifications.BOEING_737.getMileage());		
		setLifetime(AircraftSpecifications.BOEING_737.getLifetime());
	}
}
