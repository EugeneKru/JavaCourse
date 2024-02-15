package eugenekru.javacourse.hometask06.task1.enumpack;

public enum Speed {
	
	BOEING_737(905),
	HELICOPTER(250),
	ANTEI(560),
	CARGO_COPTER(35)
	;
	
	public final int speed;

	Speed(int speed) {
		
		this.speed = speed;
	}
}
