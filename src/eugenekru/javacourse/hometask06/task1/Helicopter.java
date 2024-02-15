package eugenekru.javacourse.hometask06.task1;

import eugenekru.javacourse.hometask06.task1.enumpack.Lifetime;
import eugenekru.javacourse.hometask06.task1.enumpack.Mileage;
import eugenekru.javacourse.hometask06.task1.enumpack.Speed;

public class Helicopter extends Aircraft{

	public Helicopter(String name, int yearbuilt, int capasity) {
		super(name, yearbuilt);
		setCapasity(capasity);
		setSpeed(Speed.HELICOPTER.speed);
		setMileage(Mileage.HELICOPTER.mileage);		
		setLifetime(Lifetime.HELICOPTER.lifetime);
	}
}
