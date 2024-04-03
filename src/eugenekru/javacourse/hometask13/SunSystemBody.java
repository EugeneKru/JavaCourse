package eugenekru.javacourse.hometask13;

public class SunSystemBody implements CosmicBody {
	
	private double MASS; 	//	kg	
	private double RADIUS;	//	m	
	private double DENSITY;	//	g/cm^3	
	private double AVERAGE_TEMPERATURE;	//	K	
	private int numberOfOperations = 0;

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
	
	public int getNumberOfOperations() {
		return numberOfOperations;
	}	
		
	@Override
	public double getSurfaceArea() {
		numberOfOperations = getNumberOfOperations() + 1;
		double area = (4 * Math.PI * Math.pow(getRADIUS(), 2)) / Math.pow(10, 6);
		return area;
	}

	@Override
	public double getVolume() {
		numberOfOperations = getNumberOfOperations() + 1;
		double volume = getMASS() * (getDENSITY() / 1000);
		return volume;
	}
	
	@Override
	public boolean isInhabited() {
		numberOfOperations = getNumberOfOperations() + 1;
		return (CosmicBody.MIN_HABITABLE_TEMPERATURE < getAVERAGE_TEMPERATURE() &&
				getAVERAGE_TEMPERATURE() < CosmicBody.MAX_HABITABLE_TEMPERATURE);
	}
	
	public void printNumberOfOperations() {
		System.out.println("Number of operations above object "
				+ getClass().getSimpleName() + " is "
				+ getNumberOfOperations());
	}

	@Override
	public String toString() {		
		return this.getClass().getSimpleName()
				+ " adress: Milky Way galaxy, Sun system";
	}	
}