package eugenekru.javacourse.hometask06.task1;

import eugenekru.javacourse.hometask06.task1.enumpack.Lifetime;
import eugenekru.javacourse.hometask06.task1.enumpack.Mileage;
import eugenekru.javacourse.hometask06.task1.enumpack.Speed;

public class Boeing737 extends Aircraft {	

	public Boeing737(String name, int yearbuilt, int capasity) {
		super(name, yearbuilt);
		setCapasity(capasity);
		setSpeed(Speed.BOEING_737.speed);
		setMileage(Mileage.BOEING_737.mileage);		
		setLifetime(Lifetime.BOEING_737.lifetime);
	}
}
