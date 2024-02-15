package eugenekru.javacourse.hometask06.task1.enumpack;

public enum Mileage {
	
	BOEING_737(4200),
	HELICOPTER(650),
	ANTEI(5250),
	CARGO_COPTER(25)
	;
	
	public final int mileage;

	Mileage(int mileage) {
		
		this.mileage = mileage;
	}
}
