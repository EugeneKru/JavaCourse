package eugenekru.javacourse.hometask06.task1;

import eugenekru.javacourse.hometask06.task1.enumpack.Lifetime;
import eugenekru.javacourse.hometask06.task1.enumpack.Mileage;
import eugenekru.javacourse.hometask06.task1.enumpack.Speed;

public class CargoCopter extends Aircraft{

	public CargoCopter(String name, int yearbuilt, int tonnage) {
		super(name, yearbuilt);
		setTonnage(tonnage);
		setSpeed(Speed.CARGO_COPTER.speed);		
		setMileage(Mileage.CARGO_COPTER.mileage);
		setLifetime(Lifetime.CARGO_COPTER.lifetime);
	}
}
