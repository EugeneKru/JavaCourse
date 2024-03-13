package eugenekru.javacourse.hometask06.task1.enumpack;

public enum AircraftSpecifications {
	
	BOEING_737(905, 4200, 30),
	HELICOPTER(250, 650, 25),
	ANTEI(560, 5250, 30),
	CARGO_COPTER(35, 25, 10)
	;
	
	private final int speed;
	
	private final int mileage;
	
	private final int lifetime;

	private AircraftSpecifications(int speed, int mileage, int lifetime) {
		this.speed = speed;
		this.mileage = mileage;
		this.lifetime = lifetime;
	}

	public int getSpeed() {
		return speed;
	}

	public int getMileage() {
		return mileage;
	}

	public int getLifetime() {
		return lifetime;
	}
}
