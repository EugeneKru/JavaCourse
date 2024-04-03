package eugenekru.javacourse.hometask13;

public enum SunSystemConstants {
	
	EARTH(5.9726E24, 6.371E6, 5.5153, 287.2),	
	MOON(7.3477E22, 1.73814E6, 3.3464, 220),	
	SUN(1.9885E30, 6.957E8, 1.409, 5780);
	
	private final double MASS;	
	private final double RADIUS;	
	private final double DENSITY;	
	private final double AVERAGE_TEMPERATURE;	

	private SunSystemConstants(double MASS, double RADIUS, double DENSITY, double AVERAGE_TEMPERATURE) {
		this.MASS = MASS;
		this.RADIUS = RADIUS;
		this.DENSITY = DENSITY;
		this.AVERAGE_TEMPERATURE = AVERAGE_TEMPERATURE;
	}

	public double getMASS() {
		return MASS;
	}

	public double getRADIUS() {
		return RADIUS;
	}

	public double getDENSITY() {
		return DENSITY;
	}

	public double getAVERAGE_TEMPERATURE() {
		return AVERAGE_TEMPERATURE;
	}

	
	
	

}
