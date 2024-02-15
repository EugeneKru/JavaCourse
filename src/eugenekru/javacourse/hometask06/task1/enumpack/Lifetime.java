package eugenekru.javacourse.hometask06.task1.enumpack;

public enum Lifetime {
	
	BOEING_737(30),
	HELICOPTER(25),
	ANTEI(30),
	CARGO_COPTER(10)
	;
	
	public final int lifetime;

	Lifetime(int lifetime) {
		
		this.lifetime = lifetime;
	} 
}
