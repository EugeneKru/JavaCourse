package eugenekru.javacourse.hometask13;

public class Moon extends SunSystemBody implements CosmicBody {
	
	private static Moon instance;
	
	final double MASS = SunSystemConstants.MOON.getMASS();	//	kg 	
	final double RADIUS = SunSystemConstants.MOON.getRADIUS();	//	m	
	final double DENSITY = SunSystemConstants.MOON.getDENSITY();	//	g/cm^3	
	final double AVERAGE_TEMPERATURE = SunSystemConstants.MOON.getAVERAGE_TEMPERATURE();	//	K
	
	private Moon() {}

	public static Moon getInstance() {
		
		if(instance == null) {
			instance = new Moon();
		}
		
		return instance;
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
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+ " - the satellite of Earth";
	}
}