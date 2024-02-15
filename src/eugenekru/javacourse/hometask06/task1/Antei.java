package eugenekru.javacourse.hometask06.task1;

import eugenekru.javacourse.hometask06.task1.enumpack.Lifetime;
import eugenekru.javacourse.hometask06.task1.enumpack.Mileage;
import eugenekru.javacourse.hometask06.task1.enumpack.Speed;

public class Antei extends Aircraft{

	public Antei(String name, int yearbuilt, int tonnage) {
		super(name, yearbuilt);
		setTonnage(tonnage);
		setSpeed(Speed.ANTEI.speed);		
		setMileage(Mileage.ANTEI.mileage);
		setLifetime(Lifetime.ANTEI.lifetime);
	}
}
