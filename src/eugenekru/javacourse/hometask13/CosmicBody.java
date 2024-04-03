package eugenekru.javacourse.hometask13;

public interface CosmicBody extends Comparable<CosmicBody> {
	
	double MIN_HABITABLE_TEMPERATURE = 270;
	
	double MAX_HABITABLE_TEMPERATURE = 330;
	
	double getSurfaceArea();
	
	double getVolume();
	
	boolean isInhabited();

	@Override
	default int compareTo(CosmicBody cosmicBody) {
		return Double.compare(getVolume(), cosmicBody.getVolume());
	}
		
	default void printPossibilityOfColonization() {		
		if(isInhabited()) {
			System.out.println(getClass().getSimpleName()
					+ " - could be habitable");			
		} else {
			System.out.println(getClass().getSimpleName()
					+ " - is not habitable");
		}
	}	

}
