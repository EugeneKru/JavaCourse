package eugenekru.javacourse.hometask13;

public class Sun extends SunSystemBody implements CosmicBody {
	
	private static Sun instance;
	
	final double MASS = SunSystemConstants.SUN.getMASS();	//	kg 	
	final double RADIUS = SunSystemConstants.SUN.getRADIUS();	//	m	
	final double DENSITY = SunSystemConstants.SUN.getDENSITY();	//	g/cm^3	
	final double AVERAGE_TEMPERATURE = SunSystemConstants.SUN.getAVERAGE_TEMPERATURE();	//	K
	
	private Sun() {}

	public static Sun getInstance() {
		
		if(instance == null) {
			instance = new Sun();
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
				+ " - the star of Milky Way galaxy";
	}

}
