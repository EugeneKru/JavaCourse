package eugenekru.javacourse.hometask13;

public class Earth extends SunSystemBody implements CosmicBody {
	
	private static Earth instance;	
	
	final double MASS = SunSystemConstants.EARTH.getMASS();	//	kg 	
	final double RADIUS = SunSystemConstants.EARTH.getRADIUS();	//	m	
	final double DENSITY = SunSystemConstants.EARTH.getDENSITY();	//	g/cm^3	
	final double AVERAGE_TEMPERATURE = SunSystemConstants.EARTH.getAVERAGE_TEMPERATURE();	//	K	
	
	private Earth() {}

	public static Earth getInstance() {
		
		if(instance == null) {
			instance = new Earth();
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
				+ " - the planet of Sun system";
	}	
}