package eugenekru.javacourse.hometask13;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Earth earth = Earth.getInstance();
		Moon moon = Moon.getInstance();
		Sun sun = Sun.getInstance();			
		
		List<SunSystemBody> sunSystem = List.of(earth, sun, moon);		
		
		sunSystem.stream()		
			.forEach(System.out::println);		
		
		System.out.println("\nCosmic body sorted by size:");
		sunSystem.stream()
			.sorted()			
			.forEach(System.out::println);	
		
		System.out.println("\nIs Cosmic body could be habitable (by temperature)?");
		sunSystem.stream()
			.forEach(body -> body.printPossibilityOfColonization());	
		
		
		System.out.println("\nSurface area of "
				+ moon.getClass().getSimpleName() + " is "
				+ moon.getSurfaceArea() + " km^2");
		
		System.out.println("\nNumber of operations above Sun system objects:");
		sunSystem.stream()		
			.forEach(body -> body.printNumberOfOperations());
		
			
		List<SunSystemBody> newSunSystem = List.of(
				Earth.getInstance(),
				Sun.getInstance(),
				Moon.getInstance()
				);
		
		System.out.println("\nNumber of operations above \"NEW\" Sun system objects:");
		newSunSystem.stream()		
			.forEach(body -> body.printNumberOfOperations());	
	}

}
